
public class Bubble_sort {
	public static void main(String[] args) {
		int arr[]= {5,8,7,2,3};
		int i,j;
		int temp,flag;
		System.out.println("---정렬 전 배열 출력---");
		for(i=0;i<arr.length;i++) {
			System.out.println("arr["+(i+1)+"]번 째 데이터 : "+arr[i]);
		}
		
		for(i=0;i<arr.length-1;i++) {
			flag=0;
			for(j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("---정렬 후 배열 출력---");
		for(i=0;i<arr.length;i++) {
			System.out.println("arr["+(i+1)+"]번 째 데이터 : "+arr[i]);
		}
	}
}
