
public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {2,8,4,9,3};
		int i,j,temp;
		System.out.println("---정렬 전 배열 출력---");
		for(i=0;i<arr.length;i++) {
			System.out.println("arr["+(i+1)+"]번째 데이터 : "+arr[i]);
		}
		for(i=0;i<arr.length-1;i++) {
			for(j=i+1;j<5;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("---정렬 후 배열 출력---");
		for(i=0;i<arr.length;i++) {
			System.out.println("arr["+(i+1)+"]번째 데이터 : "+arr[i]);
		}
		
	}
}
