package dynamic_beat_4;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {

	// 전체 화면에 이미지 담기
	private Image screenImage;
	private Graphics screenGraphic;


	private ImageIcon exitButtonEnteredImage =  new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage =  new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	private JButton exitButton = new JButton(exitButtonBasicImage);

	
	private int mouseX, mouseY;	//현재 프로그램 안에서 마우스 X,Y의 좌표
	
	
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("♬리듬게임스타♬");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 전체 게임창의 크기만들기
		setResizable(false); // 사용자가 임의로 줄이지 못하도록
		setLocationRelativeTo(null); // 실행했을 때 게임 창이 컴퓨터의 중앙에 뜨게 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임창을 종료했을 때 프로그램 전체가 종료되게 함
		setVisible(true); // 우리가 만든 게임창이 정상적으로 컴퓨터에 출력해주게 함
		setBackground(new Color(0, 0, 0, 0)); // paintComponents를 했을때 배경이 하얀색으로 맞춰지게 됨
		setLayout(null);

		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//마우스가 올라갔을 때 Entered 이미지로 바꿔줌
				exitButton.setIcon(exitButtonEnteredImage);
				//마우스가 올라갔을 때 커서가 손가락 모양으로 바뀜
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//마우스가 내려갔을 때 다시 원상복귀상태로 !
				exitButton.setIcon(exitButtonBasicImage);
				//마우스가 내려갔을 때 버튼이 다시 원상복귀로 바뀜
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonPressedMusic.start();
				try {
					//소리가 나온 뒤 1초 정도 있다가 프로그램 종료
					Thread.sleep(1000);
				}	catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				//클릭했을 때 해당 게임이 종료
				System.exit(0);
			
			}
		});
		
		add(exitButton);
		
		
		menuBar.setBounds(0, 0, 1280, 30); // 위치와 크기를 정해줌
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			//마우스로 해당 버튼을 눌렀을 때의 이벤트 처리
			public void mousePressed(MouseEvent e) {
				mouseX=e.getX();
				mouseY=e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			//드래그 이벤트가 발생했을때
			public void mouseDragged(MouseEvent e) {
				int x=e.getXOnScreen();
				int y=e.getYOnScreen();
				setLocation(x=mouseX,y=mouseY);
			}
		});
		add(menuBar);

		// 시작화면에서 정상적으로 시작음악을 재생!!(직접 종료시키기 전까지 음악 반복 재생)
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
	}

	// JFrame에서 가장 첫번째로 화면을 그려주는 함수
	public void paint(Graphics g) {
		// 프로그램 화면 크기만큼 이미지 생성
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // 우리가 원하는 이미지 그려줌
		g.drawImage(screenImage, 0, 0, null);

	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g); // 메뉴바같은 경우는 항상 존재하는 이미지기때문에
		this.repaint();
	}
}
