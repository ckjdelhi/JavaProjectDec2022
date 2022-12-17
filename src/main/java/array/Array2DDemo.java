package array;

public class Array2DDemo {

	public static void main(String[] args) {
		int[][] arr2= {{60, 70}, {30, 10}, {44, 50}};
		System.out.println("Rows="+arr2.length); //no of Rows
		System.out.println("Column="+arr2[2].length);//no of col
		
		int[][] arr=new int[3][2];//row x col
		arr[0][0]=60;
		arr[0][1]=70;
		arr[1][0]=30;
		arr[1][1]=10;
		arr[2][0]=44;
		arr[2][1]=50;
		
		for(int i=0; i<arr.length;i++) {//row
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int[] ua:arr) {
			for(int la:ua) {
				System.out.println(la);
			}
		}
		
		
	}

}
