package com.leetCode.Arrays;

public class EvenNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {12,345,2,6,7896,1254};
//		 System.out.println(nums[0]);
//		 System.out.println(String.valueOf(nums[0]).length());
		 int result = findNumbers(nums);
		 System.out.println("result" +result);
	}

	public static int findNumbers(int[] nums) {
        int[] lengthOfElements = new int[nums.length];
//        System.out.println(lengthOfElements.length);
        for(int i=0; i< nums.length; i++){
            lengthOfElements[i] = String.valueOf(nums[i]).length();
            System.out.println(lengthOfElements[i]);
        }
        
        int count = 0;
        for(int i =0;i <lengthOfElements.length; i++){
            if((lengthOfElements[i])% 2 == 0){
                count++;
            }
        }
        return count;
//        return 1;
    }
}
