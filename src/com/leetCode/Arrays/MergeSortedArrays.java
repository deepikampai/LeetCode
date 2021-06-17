package com.leetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArrays {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] n1 = Arrays.copyOf(nums1,nums1.length);
		int[] n2 = Arrays.copyOf(nums2,nums2.length);
		
//		nums1 = new int[m+n];
//		List<Integer> n1List = new ArrayList<>();
//		for(int i : n1) {
//			n1List.add(i);
//		}
//		List<Integer> n1List = new ArrayList<>();
//		for(int i : nums1) {
//			n1List.add(i);
//		}
		
		
		for(int i =0; i<n2.length;i++) {
			nums1[m+i]=n2[i];
		}
		Arrays.sort(nums1);
		System.out.println("sorted nums1 array:" + Arrays.toString(nums1));
//		List<Integer> n2List = Arrays.stream(n2).boxed().collect(Collectors.toCollection(ArrayList::new));
//        
//		List<Integer> merge = new ArrayList<>();
//			merge.addAll(n1List);
//			merge.addAll(n2List);
//			
//		
////			merge.toArray();
//			int[] sortedArray = merge.stream().mapToInt(Integer::intValue).toArray();
//			Arrays.sort(sortedArray);
//			System.out.println("sortedArray:" +Arrays.toString(sortedArray));
//			for(int i = 0; i < sortedArray.length; i++) {
//				nums1[i] = sortedArray[i];
//			}
//			System.out.println("num1 data after adding:" +Arrays.toString(nums1));
//			
			
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArrays ms = new MergeSortedArrays();
		
		
//		int m =3, n=3;
//		int m =1, n=0;
		int m =0, n=1;
//		int[] num1 = {1,2,3,0,0,0};
//		int[] num2 = {2,5,6};
//		int[] num1 = {1};
//		int[] num2 = {};
		int[] num1 = {0};
		int[] num2 = {1};
		ms.merge(num1, m, num2, n);
		System.out.println("Lenght of num1:" +num1.length);
		
//		int[] num1Copy = Arrays.copyOf(num1, m);
//		int[] num2Copy = Arrays.copyOf(num2, n);
//		System.out.println("Lenght of num1Copy:" +num1Copy.length);
//		System.out.println(Arrays.toString(num1Copy));
//		 		
//		ArrayList<Integer> num1List = Arrays.stream(num1).boxed().collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(num1List);
//		
//		ArrayList<Integer> num1CopyList = Arrays.stream(num1Copy).boxed().collect(Collectors.toCollection(ArrayList::new));
//		System.out.println("num1CopyList:" +num1CopyList);
////		num1List.removeIf(p -> p.intValue() == 0);
////		System.out.println(num1List);
//		
//		
//		ArrayList<Integer> num2List = new ArrayList<>();
//		for (int i : num2) {
//			num2List.add(i);
//		}
//		System.out.println("num2List value:" +num2List);
//		
//		ArrayList<Integer> merged = new  ArrayList<>();
//
//			merged.addAll(num1CopyList);
//			merged.addAll(num2List);
//		System.out.println("merged arraylist values:" +merged);
//		
//		Integer[] sortedArray = merged.toArray(new Integer[0]);
//		
//		Arrays.sort(sortedArray);
//		System.out.println("sortedArray: " +Arrays.toString(sortedArray));
//		
//		int[] newSortedArray = merged.stream().mapToInt(Integer::intValue).toArray();
//		Arrays.sort(newSortedArray);
//		System.out.println("newSortedArray:" +Arrays.toString(newSortedArray));
//
//		num1 = new int[m+n];
//		System.out.println("num1 data before adding:" +Arrays.toString(num1));
//		
//		for(int i = 0; i < newSortedArray.length; i++) {
//			num1[i] = newSortedArray[i];
//		}
//		System.out.println("num1 data after adding:" +Arrays.toString(num1));
//	
		 
		
	}

}
