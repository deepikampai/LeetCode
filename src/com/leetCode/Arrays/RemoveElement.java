package com.leetCode.Arrays;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int length = nums.length;
//        Arrays.sort(nums);
//        
//        for(int i =0; i< nums.length; i++){
//            if(nums[i] == val){
//                nums[i] = 0;
//                length--;
//            }
//        }
             

		for (int i = 0; i < length; i++) {
			if((i+1) < length && nums[i+1] == val) {
				if((i+2) < length && nums[i+2] == val) {
					for(int j = i+2; j < length ; j++) {
						nums[j -1] = nums[j];
					}
					length--;
				}else if((i+1) < length && (i+1) != (length-1)) {
					for (int j = i + 1; j < length; j++) {
						nums[j - 1] = nums[j];
					}
				length--;
				}
				else if(nums[i+1] == val) {
					length--;
				}					
			}
			
			if(nums[i] == val) {
				if(((i+1) < length && (i+1) != (length-1)) && nums[i+1]!= val) {
					for (int j = i + 1; j < length; j++) {
						nums[j - 1] = nums[j];
					}
				length--;
				}
				else if( ((i+1) == (length-1)) &&  (nums[i] !=nums[i+1])){
					nums[i] = nums[i+1];
					length--;					
				}
				else if(((i+1) == (length-1)) && (nums[i] == nums[i+1])) {					
					length =length -2;
					
				}
				else if((i+1) == length) {
					length--;
					
				}else {
					nums[i] = 0;
					length--;
				}
			}
//			else {
//				continue;
//			}

		}
		
		System.out.println("length:" +length);
        return length;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] nums = {3,2,2,3};
//		int val = 3;
		
//		int[] nums = {0,4,4,0,4,4,4,0,2};
//		int val = 4;
		
//		int[] nums = {4,5};
//		int val = 5;
		
//		int[] nums = {2};
//		int val = 2;
		
//		int[] nums = {0,1,2,2,3,0,4,2};
//		int val = 2;
		
//		int[] nums = {1,2,2,1,1};
//		int val = 1;
		
//		int[] nums = {3,3};
//		int val = 3;
		
		int[] nums = {3,3,3};
		int val = 3;
		
		RemoveElement rm = new RemoveElement();
		int finalLength = rm.removeElement(nums, val);
		System.out.println("Final length:" +finalLength);
		
		for(int i = 0; i< finalLength; i++) {
			System.out.println(nums[i]);
		}
	}

}
