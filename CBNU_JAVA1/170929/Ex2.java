//�ּ� ���� ���� ���ϱ�!

public class Ex2 {
	public static void main(String args[]) {
		int[] coinUnit= {500,100,50,10};
		int[] change= {0,0,0,0};	//������ ������ �Ž�����
		
		int st_money;
		int money=2600;
		st_money=money;	//������ �ʴ� st_money ������ ó�� ���� �ִ� ���� �־��ش�
		
		for(int i=0;i<coinUnit.length;i++) {
			change[i]=money/coinUnit[i];
			money=money-coinUnit[i]*change[i];
		}
		
		System.out.println("money = "+st_money+"��");
		
		for(int j=0;j<coinUnit.length;j++) {
			System.out.println(""+coinUnit[j]+"�� ������ ���� : "+change[j]);
		}
	}
}
