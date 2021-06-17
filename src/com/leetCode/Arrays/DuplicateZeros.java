package com.leetCode.Arrays;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,0,2,3,0,4,5,0};
//		int[] input = {1,2,3};
//		int[] input = {0,0,0,0,0,0,0};
		
		int[] output = new int[input.length];
		System.out.println("output length:" +output.length);
//		for(int i =0; i<input.length;i++) {
//			output[i] = input[i];
//		}
		
//		int[] output = Arrays.copyOf(input,input.length);
//		int[] output =input.clone();
		System.out.println("input:" + Arrays.toString(input));
		System.out.println("output:" +Arrays.toString(output));
		
		int length = 0;
		for (int i = 0; i < input.length; i++) {
			if (length < output.length) {
				output[length] = input[i];
				length++;
				while (length < output.length) {
					if (input[i] == 0) {
						output[length] = 0;
						length++;
					}
					break;
				}
			} else
				break;

		}
		System.out.println("output:" +Arrays.toString(output));
		
		input = Arrays.copyOf(output, output.length);
		System.out.println("input:" + Arrays.toString(input));
	}

}
