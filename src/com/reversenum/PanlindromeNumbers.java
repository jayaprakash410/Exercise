package com.reversenum;

public class PanlindromeNumbers {
	public static void main(String[] args) {
		int num=121;
		int reverse_num=0;
		while(num>0) {
			int rem=num%10;
			reverse_num=reverse_num*10+rem;
			num=num/10;
		}
		if(num == reverse_num) {
			System.out.println(reverse_num+" is a palindrome");
		}
		else {
			System.out.println(reverse_num+" is not a palindrome");
		}
	}
}
