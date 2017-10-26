
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SequentialSearch {
	public static void main(String args[]) {
		int arr[]= {24,88,46,59,18,76,33,44,81,97};
		int i, num;
		int key=0, index=0;
		num=arr.length;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("찾고자 하는 숫자를 2자리로 입력하세요 : ");
		try {
			key=Integer.parseInt(in.readLine());
		}catch (Exception e) {
			System.out.println("입력 오류");
		}
		
		for (i = 0; i < num; i++) {
			if (arr[i] == key) {
				index = i + 1;
			}
		}

		if (index == 0) {
			System.out.println("찾고자 하는 값이 없습니다.");
		}

		else {
			System.out.println("찾는 값은 " + index + "번째에 있습니다.");
		}
	}
}
