package connection;
import java.io.*;
import java.util.*;


public class Insertionsorting {
	public  static void Printarry(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
	
	                          
	public static void main(String args[]) {
		
int  arr[]= {7,6,4,9,2};
 for(int i=1;i<arr.length;i++) {
	 int current=arr[i];
	 int j=i-1;
	 while(j>=0 && current <arr[j] ){
		
		 arr[j+1]=arr[j];
		 j--;
	 }
	
		 arr[j+1]=current;
		 
	 }
	
	 
 
Printarry(arr);
	}
	
		
	}
	
