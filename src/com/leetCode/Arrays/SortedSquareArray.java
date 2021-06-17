package com.leetCode.Arrays;

import java.util.Arrays;

public class SortedSquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-7,-3,2,3,11};
		int [] result = sortedSquares(nums);
		System.out.println(Arrays.toString(result));
	}

	public static int[] sortedSquares(int[] nums) {

		System.out.println("nums:" +Arrays.toString(nums));
		int[] sortedOutput = new int[nums.length];
		System.out.println("sortedOutput length:" +sortedOutput.length);

		for (int i = 0; i < nums.length; i++) {
			sortedOutput[i] = nums[i] * nums[i];
		}
		System.out.println("sortedOutput before sort:" +Arrays.toString(sortedOutput));
		Arrays.sort(sortedOutput);
		System.out.println("sortedOutput after sort:" +Arrays.toString(sortedOutput));
		return sortedOutput;
	}
}
