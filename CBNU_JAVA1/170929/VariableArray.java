
public class VariableArray {
	public static void main(String[] args) {
		int [][] arr = new int [3][];
		int i=0; int j=0;
		
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[1];
		
		arr[0][0]=10;
		arr[1][0]=20;
		arr[1][1]=30;
		arr[2][0]=40;
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
					System.out.println("arr["+i+"]"+"["+j+"]="+arr[i][j]+" ");
				}
			//System.out.println();
			}
		}
	}

