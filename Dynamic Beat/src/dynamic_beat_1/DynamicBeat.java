package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("♬리듬게임스타♬");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);	//전체 게임창의 크기만들기
		setResizable(false);							//사용자가 임의로 줄이지 못하도록
		setLocationRelativeTo(null);					//실행했을 때 게임 창이 컴퓨터의 중앙에 뜨게 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//게임창을 종료했을 때 프로그램 전체가 종료되게 함
		setVisible(true);								//우리가 만든 게임창이 정상적으로 컴퓨터에 출력해주게 함
		
	}
}
