package com.geeksForGeeks.test;

import java.util.Scanner;

public class TwoDArray {
	
	public static void mani(String s[]){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase > 0){
			int n = sc.nextInt();
			int array[][] = new int[n][n];
			int sumOfDiagonal = 0;
			for(int i=0; i< n; i++){
				for(int j=0; j< n; j++){
					array[i][j] =sc.nextInt();
					if(i==j){
						sumOfDiagonal = sumOfDiagonal + array[i][j];
					}
					
				}
				
			}
			int max = 0;
			int arr[] = new int[n]; 
			for(int i=0; i< n; i++){
				if(arr[i] > max){
					max = arr[i];
				}
			}
			testCase--;
		}
		
	}

}
