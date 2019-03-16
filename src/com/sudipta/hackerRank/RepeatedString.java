package com.sudipta.hackerRank;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem
 * @author user
 *
 */
public class RepeatedString {

	public static void main(String[] args) {
		String str = "aba";
		long n =10;
		//total a in origin string 
		long count = 0;
		int countOfSubStr = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a'){
				countOfSubStr++;
			}
		}
		
		//total full string required
		long noOfStr = n/str.length();
		// length of sub string
		long lengthOfSubStr = n %  str.length();
		
		//total count of a's in the full string
		count = count + (noOfStr * countOfSubStr);
		
		
		for(int i=0; i<lengthOfSubStr; i++){
			if(str.charAt(i) == 'a'){
				count++;
			}
		}
		
		System.out.println(" "+count);

	}

}
