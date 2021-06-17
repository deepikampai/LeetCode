package com.leetCode.Arrays;

import java.util.Arrays;
import java.util.StringJoiner;

public class IntArrayToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,-2,3,4};
		String[] str = new String[input.length];
		
		for(int i = 0; i< input.length; i++) {
			str[i] = String.valueOf(input[i]);
		}
		
		for(String s : str) {
			System.out.println(s);
		}
		
		String s = Arrays.toString(input);
		String newStr = s.replaceAll("\\s", "").replaceAll("-","");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(newStr);
		System.out.println(newStr.length());
		
		String[] newStrArray = newStr.substring(1,(newStr.length())-1).split(",");
		System.out.println(Arrays.toString(newStrArray));
		
		
		
		String[] strStream = Arrays.stream(input).mapToObj(String::valueOf).toArray(String[]::new);
		System.out.println(Arrays.toString(strStream));
	}

}
