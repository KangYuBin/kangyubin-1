import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void main(String[] args) {
		int data[] = { 11, 16, 21, 26, 35, 39, 47};
		int k = 0, cnt = 0;
		int low = 0;
		int high = data.length-1;
		int middle;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("찾고자 하는 숫자를 2자리로 입력하세요: ");
		try {
			k = Integer.parseInt(in.readLine());
		} catch (Exception e) {
			System.out.println("입력 오류");
		}
		while (true) {
			if (low > high) {
				System.out.println("검색 데이터가 없습니다");
				break;
			}
			middle = (low + high) / 2;
			cnt++;
			System.out.println("비교값:" + data[middle]);
			if (data[middle] == k) {
				System.out.println(middle + 1 + "번째 위치 검색횟수=" + cnt + "번");
				break;
			}
			if (k > data[middle]) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
	}
}
