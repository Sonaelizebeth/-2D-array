echo "# -2D-array" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Sonaelizebeth/-2D-array.git
git push -u origin main
//Creator Sona Elizebeth Shaji
// On 30 October 2020




import java.util.Scanner;
// 2d array demo
public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] array = new int [10][10];
//		int[][]array1 = {{1,2,3},
//				         {4,5,6},
//				         {7,8,9,10}};  //3 rows 4 columns
		// int[][]array1 = {{1,2,3},{4,5,6},{7,8,9,10}};
		//int [] array2 = {1,2,3,4}; one d array
		//System.out.println(array1[2][2]); prints element at a position
//		System.out.println("the array is:");
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.print(array1[i][j]+" ");
//			}
//			System.out.println(" ");
//		}
		System.out.println("Enter the row size , maximum 10:");
		int rowSize = sc.nextInt();
		System.out.println("Enter column size, maximum 10:");
		int colSize =sc.nextInt();
		
		for(int i=0;i<rowSize;i++) {
			System.out.println("Enter elements :");
			for(int j=0;j<colSize;j++) {
				
				array[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("the array is:");
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		sc.close();	
	}

}
