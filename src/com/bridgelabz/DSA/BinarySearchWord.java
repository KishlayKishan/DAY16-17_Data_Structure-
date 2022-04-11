/*@Purpose:Read in a list of words from File. Then prompt the user to enter a word to
           search the list. The program reports if the search word is found in the list.
 *@File: Binary Search the Word from Word List
 *@Author:Kishlay Kishan
 */

package com.bridgelabz.DSA;

import java.util.Arrays;

public class BinarySearchWord {

	/*
	 * @Purpose:Binary Search the Word from Word List
	 * 
	 * @Param:Kishlay,Kishan,Krishna,Mohit,Shubham
	 */
	public static void main(String[] args) {
		String[] arrayElements = { "Kishlay", "Kishan","Krishna", "Mohit", "Shubham" };
		Arrays.sort(arrayElements);
		System.out.println(Arrays.toString(arrayElements));
		String search = "Suraj";
		int result = binarySearch(arrayElements, search);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

	/*
	 * @Purpose:Binary Search the Word from Word List
	 * 
	 * @Param: Array Elements And Element To Search
	 */
	static int binarySearch(String[] arrayElements, String search) {
		int left = 0, right = arrayElements.length - 1;
		while (left <= right) {
			int member = left + (right - left) / 2;
			int result = search.compareTo(arrayElements[member]);
			if (result == 0)
				return member;
			if (result > 0)
				left = member + 1;
			else
				right = member - 1;
		}

		return -1;
	}
}
