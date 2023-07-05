package com.reversenum;


public class MitsogoExample1 {
	public static void main(String[] args) {
		int n=21;
		int count=0;
		while(n>0) {
			boolean flag=false;
			for (int i = 2; i < n; i++) {
				if(n%i==0) {
					flag=true;
					break;
				}
			}
			if(flag==true) {
				int gpn=0;
				for (int i = 1; i <= n; i++) {
					if(n%i==0) {
						boolean signal=false;
						for (int j = 2; j < i; j++) {
							if(i%j==0) {
								signal=true;
								break;
							}
						}
						if(signal==false) {
							gpn=i;	
						}
					}
				}
				n=gpn;
			}
			else if(flag==false){
				n=n-1;
			}
			count++;
		}
		System.out.println(count);
		
	}

}
