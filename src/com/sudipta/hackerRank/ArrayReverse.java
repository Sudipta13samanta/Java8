package com.sudipta.hackerRank;

public class ArrayReverse {
	private static int arr[] = {2,3,4,5,6,7};
	
	public static void main(String s[]){
		int reverseArr[] = new int[arr.length];
		int j =0;
		for (int i = arr.length-1; i >= 0; i--, j++){
			reverseArr[j] = arr[i];
		}
	}

}
