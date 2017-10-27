
public class ExceptionProblem {
	public static void main(String[] args) {
		int test[]= {17,68,10};
		System.out.println("배열 test의 길이"+test.length);
		
		try {
			for(int i=0;i<=test.length;i++) {
				System.out.println("test["+i+"]:"+test[i]);
			}
		}
		catch(Exception e) {
			System.out.println("예외가 발생하였습니다..");
		}
		finally {
			System.out.println("-------------------------");
			System.out.println("예외 발생여부와 상관없이 수행됩니다.");
		}
	}
}
