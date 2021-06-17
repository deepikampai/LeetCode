package com.leetCode.Arrays;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = {1,2,2,1,1};
//		int[] num = {0,1,2,2,3,0,4,2};
//		int val = 2;
//		int[] num = {3,3};
//		int[] num = {3,3,3};
//		int[] num = {1};
//		int[] num = {4,5};
		int[] num = {0,4,4,0,4,4,4,0,2};
				
		System.out.println(Arrays.toString(num));
		int length= num.length;		
		
		
		for (int i = 0; i <length; i++) {
			if((i+1) < length && num[i+1] == 4) {
				if((i+2) < length && num[i+2] ==4) {
					for(int j = i+2; j < length ; j++) {
						num[j -1] = num[j];
					}
					length--;
				}
//				if((i+1) < length && (i+1) != (length-1)) {
				else if((i+1) < length && (i+1) != (length-1)) {
					for (int j = i + 1; j < length; j++) {
						num[j - 1] = num[j];
					}
				length--;
				}
				else if(num[i+1] ==4) {
					length--;
				}				
			}
			
			if(num[i] ==4) {
				if(((i+1) < length && (i+1) != (length-1)) && num[i+1]!= 4) {
					for (int j = i + 1; j < length; j++) {
						num[j - 1] = num[j];
					}
				length--;
				}
//				if( ((i+1) == (length-1) &&  num[i+1] ==4)) {
				else if(((i+1) == (length-1)) && (num[i] != num[i+1])) {	
					num[i] = num[i+1];
					length--;					
				}
				else if(((i+1) == (length-1)) && (num[i] == num[i+1])) {					
					length =length -2;
					
				}
				else if((i+1) == length) {
					length--;
				}else {
					num[i] = 0;
					length--;
				}
				
			}
			
		}
		System.out.println("length:" +length);
		
		
		for(int i = 0; i< length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println(Arrays.toString(num));
	}

}
