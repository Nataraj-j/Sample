package com;
class sample1{
	int a;
	public void methods(){
		int a=10;
		System.out.println("The A value:"+a);
	}
}
public class Sample {
	static int a;
public static void main(String[] args) {
	sample1 s = new sample1();
	System.out.println("The value in main class:"+a);
	System.out.println(s.a);
	s.methods();
	
}
}
