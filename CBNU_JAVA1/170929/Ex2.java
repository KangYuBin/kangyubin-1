//최소 동전 갯수 구하기!

public class Ex2 {
	public static void main(String args[]) {
		int[] coinUnit= {500,100,50,10};
		int[] change= {0,0,0,0};	//각각의 동전의 거스름돈
		
		int st_money;
		int money=2600;
		st_money=money;	//변하지 않는 st_money 변수에 처음 갖고 있던 돈을 넣어준다
		
		for(int i=0;i<coinUnit.length;i++) {
			change[i]=money/coinUnit[i];
			money=money-coinUnit[i]*change[i];
		}
		
		System.out.println("money = "+st_money+"원");
		
		for(int j=0;j<coinUnit.length;j++) {
			System.out.println(""+coinUnit[j]+"원 동전의 갯수 : "+change[j]);
		}
	}
}
