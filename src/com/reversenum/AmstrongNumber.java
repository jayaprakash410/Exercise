package com.reversenum;

public class AmstrongNumber {
	public static void main(String args []) {
		int num=153;
		int temp_num=num;
		int sum=0;
		while(temp_num>0) {
			int rem=temp_num%10;
			sum=sum+(rem*rem*rem);
			temp_num=temp_num/10;
		}
		if(num==sum) {
			System.out.println(num+" is a Amstrong Number");
		}
		else {
			System.out.println(num+" is not a Amstrong Number");
		}
	}
	

}
