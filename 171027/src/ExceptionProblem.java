
public class ExceptionProblem {
	public static void main(String[] args) {
		int test[]= {17,68,10};
		System.out.println("�迭 test�� ����"+test.length);
		
		try {
			for(int i=0;i<=test.length;i++) {
				System.out.println("test["+i+"]:"+test[i]);
			}
		}
		catch(Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�..");
		}
		finally {
			System.out.println("-------------------------");
			System.out.println("���� �߻����ο� ������� ����˴ϴ�.");
		}
	}
}
