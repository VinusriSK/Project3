package com.app;

public class Opera {
	
	public static void main(String[] args) {
		int a =1,b=2;
		String s1 = "Yuvaraj";
		String s2 = "Yuvaraj";
		String s3 = new String("Yuvaraj");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(a>b & a<b);
		System.out.println(a>b | a<b);
		
	}

}
