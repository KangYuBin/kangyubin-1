package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	//��ü ȭ�鿡 �̹��� ���
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	public DynamicBeat() {
		setTitle("�ݸ�����ӽ�Ÿ��");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);	//��ü ����â�� ũ�⸸���
		setResizable(false);							//����ڰ� ���Ƿ� ������ ���ϵ���
		setLocationRelativeTo(null);					//�������� �� ���� â�� ��ǻ���� �߾ӿ� �߰� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����â�� �������� �� ���α׷� ��ü�� ����ǰ� ��
		setVisible(true);								//�츮�� ���� ����â�� ���������� ��ǻ�Ϳ� ������ְ� ��
		
		//���ٰ� ���� ù ���� �̹��� �ֱ�!!!(ù ����ȭ��)
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	}
	
	//JFrame���� ���� ù��°�� ȭ���� �׷��ִ� �Լ�
	public void paint(Graphics g) {
		//���α׷� ȭ�� ũ�⸸ŭ �̹��� ����
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic=screenImage.getGraphics();
		screenDraw(screenGraphic);	//�츮�� ���ϴ� �̹��� �׷���
		g.drawImage(screenImage,0,0,null);
		
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
