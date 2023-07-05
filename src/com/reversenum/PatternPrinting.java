package com.reversenum;


public class PatternPrinting {
	public static void main(String[] args) {
		pattern7(5);
	}
	static void pattern1(int n) {
		for(int row=1;row<=n;row++) {
			for (int col =1 ; col <n-row+1 ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern2(int n) {
		for(int row=1;row<=n;row++) {
			for (int col =1 ; col <=row ; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int totalcol=row>n?2*n-row:row;
			for (int col =1 ; col <=totalcol ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		for(int row=1;row<=n;row++) {
			int totalspace=n-row;
			for (int i = 1; i <= totalspace; i++) {
				System.out.print(" ");
			}
			for (int col =1 ; col <=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		for(int row=1;row<=n;row++) {
			for (int col =1 ; col <=row; col++) {
				System.out.print("*");
			}
			int totalspace=n-row;
			for (int i = 1; i <= totalspace; i++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	static void pattern6(int n) {
		for(int row=1;row<=n;row++) {
			int totalspace=n-row;
			for (int i = 1; i <= totalspace; i++) {
				System.out.print(" ");
			}
			for (int col =1 ; col <=row; col++) {
				System.out.print("*");
			}
			for (int col =2 ; col <=row; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	static void pattern7(int n) {
		for(int row=1;row<=n;row++) {
			int tocol=n-row+1;
			int totalspace=n-tocol;
			for (int i = 1; i <= totalspace; i++) {
				System.out.print(" ");
			}
			for (int col =1 ; col <=tocol; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
