package com.sudipta.hackerRank;

/**
 * https://www.hackerrank.com/challenges/two-strings
 * @author user
 *
 */
public class CommonTwoStrings {

	public static void main(String[] args) {
		String s1 = "writetoyourparents";
		String s2 = "fghmqzldbc";
		
		System.out.println(getTwoString(s1, s2));
	}

	private static String getTwoString(String s1, String s2) {
		int length01 = s1.length();
        int length02 = s2.length();
        int min = 0;
        String mnStr = null;
        String mxStr = null;

        if (length01 > length02){
            min = length02;
            mnStr = s2;
            mxStr = s1;
        }else{
        	min = length01;
        	mnStr = s1;
            mxStr = s2;}

        for (int i = 0; i < min; i++) {
            String s = Character.toString(mnStr.charAt(i));
            if(mxStr.contains(s)){
                return "YES";
            }
        }
        return "NO";
	}

}
