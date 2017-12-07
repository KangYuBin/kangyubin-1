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

	// ��ü ȭ�鿡 �̹��� ���
	private Image screenImage;
	private Graphics screenGraphic;


	private ImageIcon exitButtonEnteredImage =  new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage =  new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	private JButton exitButton = new JButton(exitButtonBasicImage);

	
	private int mouseX, mouseY;	//���� ���α׷� �ȿ��� ���콺 X,Y�� ��ǥ
	
	
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("�ݸ�����ӽ�Ÿ��");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ��ü ����â�� ũ�⸸���
		setResizable(false); // ����ڰ� ���Ƿ� ������ ���ϵ���
		setLocationRelativeTo(null); // �������� �� ���� â�� ��ǻ���� �߾ӿ� �߰� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����â�� �������� �� ���α׷� ��ü�� ����ǰ� ��
		setVisible(true); // �츮�� ���� ����â�� ���������� ��ǻ�Ϳ� ������ְ� ��
		setBackground(new Color(0, 0, 0, 0)); // paintComponents�� ������ ����� �Ͼ������ �������� ��
		setLayout(null);

		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//���콺�� �ö��� �� Entered �̹����� �ٲ���
				exitButton.setIcon(exitButtonEnteredImage);
				//���콺�� �ö��� �� Ŀ���� �հ��� ������� �ٲ�
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//���콺�� �������� �� �ٽ� ���󺹱ͻ��·� !
				exitButton.setIcon(exitButtonBasicImage);
				//���콺�� �������� �� ��ư�� �ٽ� ���󺹱ͷ� �ٲ�
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonPressedMusic.start();
				try {
					//�Ҹ��� ���� �� 1�� ���� �ִٰ� ���α׷� ����
					Thread.sleep(1000);
				}	catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				//Ŭ������ �� �ش� ������ ����
				System.exit(0);
			
			}
		});
		
		add(exitButton);
		
		
		menuBar.setBounds(0, 0, 1280, 30); // ��ġ�� ũ�⸦ ������
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			//���콺�� �ش� ��ư�� ������ ���� �̺�Ʈ ó��
			public void mousePressed(MouseEvent e) {
				mouseX=e.getX();
				mouseY=e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			//�巡�� �̺�Ʈ�� �߻�������
			public void mouseDragged(MouseEvent e) {
				int x=e.getXOnScreen();
				int y=e.getYOnScreen();
				setLocation(x=mouseX,y=mouseY);
			}
		});
		add(menuBar);

		// ����ȭ�鿡�� ���������� ���������� ���!!(���� �����Ű�� ������ ���� �ݺ� ���)
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
	}

	// JFrame���� ���� ù��°�� ȭ���� �׷��ִ� �Լ�
	public void paint(Graphics g) {
		// ���α׷� ȭ�� ũ�⸸ŭ �̹��� ����
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // �츮�� ���ϴ� �̹��� �׷���
		g.drawImage(screenImage, 0, 0, null);

	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g); // �޴��ٰ��� ���� �׻� �����ϴ� �̹����⶧����
		this.repaint();
	}
}
