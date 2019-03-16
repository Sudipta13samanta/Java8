package com.geeksForGeeks.practice;

/**
 * Problem statement: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 * 
 * @author Sudipta
 *
 */
public class SubarrayWithGivenSum {
	
	static int noOfElement =5;
	static int givenSum = 12;
	static int arr[] = {1, 2, 3, 7, 5};
	
	public static String subArraySum(){
		int sum = 0, start =0, flag = 1, end = 0;
		
		for(int i=0; i<noOfElement; i++){
			sum = sum + arr[i];
			
			while(sum > givenSum && start < i-1){
				sum = sum - arr[start];
				start++;
			}
			
			if(sum == givenSum){
				flag =0;
				end =i;
				break;
			}
		}
		
		if(flag == 0)
			return start +" "+end;
		else
			return -1+"";
	}

	public static void main(String s[]){
		System.out.println(subArraySum());
	}
}
