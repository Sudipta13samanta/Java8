package com.sudipta.hackerRank;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 * @author user
 *
 */
public class Staircase {

	public static void main(String[] args) {
		int n = 6;
		for(int i = 0; i<n;i++){
			for(int j=0; j<= (n-i)-1; j++){
				System.out.print(" ");
			}
			
			for(int j=0; j< i+1; j++){
				System.out.print("#");
			}
			System.out.println();
			
		}
	}
}
