package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	//전체 화면에 이미지 담기
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	public DynamicBeat() {
		setTitle("♬리듬게임스타♬");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);	//전체 게임창의 크기만들기
		setResizable(false);							//사용자가 임의로 줄이지 못하도록
		setLocationRelativeTo(null);					//실행했을 때 게임 창이 컴퓨터의 중앙에 뜨게 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//게임창을 종료했을 때 프로그램 전체가 종료되게 함
		setVisible(true);								//우리가 만든 게임창이 정상적으로 컴퓨터에 출력해주게 함
		
		//요기다가 게임 첫 시작 이미지 넣기!!!(첫 시작화면)
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	}
	
	//JFrame에서 가장 첫번째로 화면을 그려주는 함수
	public void paint(Graphics g) {
		//프로그램 화면 크기만큼 이미지 생성
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic=screenImage.getGraphics();
		screenDraw(screenGraphic);	//우리가 원하는 이미지 그려줌
		g.drawImage(screenImage,0,0,null);
		
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
