
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SequentialSearch {
	public static void main(String args[]) {
		int arr[]= {24,88,46,59,18,76,33,44,81,97};
		int i, num;
		int key=0, index=0;
		num=arr.length;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ã���� �ϴ� ���ڸ� 2�ڸ��� �Է��ϼ��� : ");
		try {
			key=Integer.parseInt(in.readLine());
		}catch (Exception e) {
			System.out.println("�Է� ����");
		}
		
		for (i = 0; i < num; i++) {
			if (arr[i] == key) {
				index = i + 1;
			}
		}

		if (index == 0) {
			System.out.println("ã���� �ϴ� ���� �����ϴ�.");
		}

		else {
			System.out.println("ã�� ���� " + index + "��°�� �ֽ��ϴ�.");
		}
	}
}
