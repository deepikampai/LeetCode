package com.leetCode.Arrays;

public class ArraySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ArraySquare = new int[10];
		int square;
		// adding values to array
		for(int i=0; i< ArraySquare.length;i++) {
			square = i * i;
			ArraySquare[i] = square;
		}
		//retrieving array values
		
		for(int result:ArraySquare) {
			System.out.println(result);
		}
 	}

}
