package connection;
import java.io.*;
import java.util.*;


public class SpiralOrder {
	
	
	                          
	public static void main(String args[]) {
		
 Scanner sc = new Scanner(System.in);
 System.out.println(" enter the size");
 int n=sc.nextInt();
 int m=sc.nextInt();
 System.out.println("matrix");
 int matrix[][]=new int[n][m];
 
 for(int i=0 ;i<n;i++) {
	 for(int j=0;j<m;j++){
		 matrix[i][j]=sc.nextInt();
		 
	 }
 }
 System.out.println(" Spiral matrix is");
int rowstart=0;
int rowend=n-1;
int colstart=0;
int colend=m-1;

while(rowstart<= rowend && colstart<=colend) {
	for(int col=colstart;col<=colend;col++) {
		System.out.print((matrix[rowstart][col]+ " "));
	}
	rowstart++;
	for(int row=rowstart;row<=rowend;row++) {
		System.out.print(matrix[row][colend ]+ " ");
	}
		colend--;
		

for(int col=colend;col>=colstart;col--) {
	System.out.print(matrix[rowend][col]+" ");
}
rowend--;
for(int row=rowend;row>=rowstart;row--) {
	System.out.print(matrix[row][colstart]+" ");
}
colstart++;
	System.out.println();

}

	}
}
	

