
public class Ex1 {
	public static void main(String[] args) {
		int [][] arr= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total=0;
		double average=0;
		int i,j;
		int size;	//2차원 배열 arr의 사이즈
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				total=total+arr[i][j];
			}
		}
		size=20;
		average=total/(double)size;
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}
