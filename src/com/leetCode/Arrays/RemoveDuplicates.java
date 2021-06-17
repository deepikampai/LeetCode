package com.leetCode.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,4};
		int arrResult = removeDuplicate2(arr);
		for(int i =0;i < arrResult; i++) {
			System.out.println(arr[i]);
		}
		
//		int[] input = {0,0,1,1,1,2,2,3,3,4};
//		int result = removeDuplicate1(input);
//		System.out.println("result:" +result);
//		
//		for(int i =0;i < result; i++) {
//			System.out.println(input[i]);
//		}
	}

	private static int removeDuplicate2(int[] arr) {
		// TODO Auto-generated method stub
		int j = 1;
		for(int i = 0 ;i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j] = arr[i+1];
				j++;
			}
		}
		
		return j;
	}

	private static int removeDuplicate1(int[] input) {
		// TODO Auto-generated method stub
		int length = 0;
		
		for(int i = 0 ;i < input.length; i++) {
			
			if( input[i] != input [length]) {
				length++;
				input[length] = input[i];
			}
		}
		
		return length+1;
	}

}
