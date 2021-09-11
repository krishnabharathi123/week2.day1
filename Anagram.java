package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			// Method1
			/*
			 * if(Arrays.equals(arr1, arr2)) {
			 * System.out.println("The given strings is an anagram"); } else {
			 * System.out.println("The given strings is not an anagram"); }
			 */

			// Method2

			text1 = String.valueOf(arr1);
			text2 = String.valueOf(arr2); //
			// System.out.println(text1 + text2);
			if (text1.equals(text2)) {
				System.out.println("The given strings is an anagram");
			} else {
				System.out.println("The given string is not an anagram");
			}

		} else {
			System.out.println("The length of the strings doesn't match");
		}

	}

}
