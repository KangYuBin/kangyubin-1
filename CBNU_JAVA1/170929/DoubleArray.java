
public class DoubleArray {
	public static void main(String[] args) {
		int[][] arr= {{ 10, 20},{ 30, 40}};
		int i,j;
		
		for(i=0;i<arr.length;i++) {
			System.out.println("  ");
			for(j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
				}
			//System.out.println();
		}
	}
}
