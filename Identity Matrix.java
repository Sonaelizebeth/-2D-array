//creator Sona Elizebeth Shaji
//30/10/2020


import java.util.Scanner;
public class TwoDIdentitymatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] array = new int [10][10];
		System.out.println("Enter the row size , maximum 10:");
		int rowSize = sc.nextInt();
		System.out.println("Enter column size, maximum 10:");
		int colSize =sc.nextInt();
		System.out.println("Enter elements :");
		for(int i=0;i<rowSize;i++) {

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
		// to check whether Identity matrix
		boolean isIdentity = true;
	    out:
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {	
				if(i==j) {
					if(array[i][j]!=1) {
						isIdentity = false;
						break out;	
					}
				}
				else {
					if(array[i][j]!=0) {
						isIdentity = false;
						break out;	
					}
				}
			}
		}
		if(isIdentity) {
			System.out.println("Identity matrix");
		}
		else{
			System.out.println("Not Identity matrix");
		}
	}
}
