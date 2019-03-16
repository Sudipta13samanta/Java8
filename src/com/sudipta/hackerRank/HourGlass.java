package com.sudipta.hackerRank;

public class HourGlass {
	//public static int arr[][] = {{1, 1, 1, 0, 0, 0},{0, 1, 0, 0, 0, 0},{1, 1, 1, 0, 0, 0},{0, 0, 2, 4, 4, 0},{0, 0, 0, 2, 0, 0},{0, 0, 1, 2, 4, 0}};
	public static int arr[][] = {{-1, -1, 0, -9, -2, -2},{-2, -1, -6, -8, -2, -5},{-1, -1, -1, -2, -3, -4},{-1, -9, -2, -4, -4, -5},{-7, -3, -3, -2, -9, -9},{-1, -3, -1, -2, -4, -5}};
	public static void main(String s[]){
		int maxSum = getHourglass(arr, 1,1);
		int offSet = 4;
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				int hourGlassSum = 0;
				if(i < offSet && j < offSet ){
					hourGlassSum =getHourglass(arr, i, j);
					if(maxSum < hourGlassSum){
						maxSum = hourGlassSum;
					}
				}
				
			}
			
		}
		System.out.println(maxSum);
	}

	private static int getHourglass(int[][] arr2, int i, int j) {
		int sum = arr2[i][j] + arr2[i][j+1] + arr2[i][j+2] 
				+arr2[i+1][j+1] 
						+ arr2[i+2][j] + arr2[i+2][j+1] + arr2[i+2][j+2];
		return sum;
		
	}
}
