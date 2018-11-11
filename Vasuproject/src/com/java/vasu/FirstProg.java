package com.java.vasu;

public class FirstProg {
	
	int a=20,b=30;
	float f=3.24f;
	long l=30009;
	char ch='c';
	boolean b1=true;
	String s="hello";
	byte b2=12;
	short sh=350;
	
	void getSum()
	{
		
		
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProg obj=new FirstProg();
		System.out.println(obj.a);
		System.out.println(obj.b2);
		obj.getSum();
		
		Demo d=new Demo();
		d.print();
	
		int a=50;
		
		System.out.println(a++);//50
		System.out.println(a);
		System.out.println(--a);
		
	}

}
