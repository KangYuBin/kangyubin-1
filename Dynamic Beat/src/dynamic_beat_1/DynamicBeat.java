package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("�ݸ�����ӽ�Ÿ��");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);	//��ü ����â�� ũ�⸸���
		setResizable(false);							//����ڰ� ���Ƿ� ������ ���ϵ���
		setLocationRelativeTo(null);					//�������� �� ���� â�� ��ǻ���� �߾ӿ� �߰� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����â�� �������� �� ���α׷� ��ü�� ����ǰ� ��
		setVisible(true);								//�츮�� ���� ����â�� ���������� ��ǻ�Ϳ� ������ְ� ��
		
	}
}
