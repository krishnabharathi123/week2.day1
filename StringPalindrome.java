package week2.day1;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("reverse of str is " + reverse);
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("The given string is a Palindrome");
		} else {
			System.out.println("The given string is not a palindrome");
		}
	}

}
