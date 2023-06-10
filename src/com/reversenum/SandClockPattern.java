package com.reversenum;


public class SandClockPattern {

	public static void main(String[] args) {
		for(int i = 0; i <3 ; i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j <3;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j <3; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}

	}

}
