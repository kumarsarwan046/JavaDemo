package com.java;

public class Increment {
	int x;
	public Increment(){
		x=5;
	}
	void pre(){
		int y= ++x;
		System.out.println("The pre increment value is" + x+ " "+ y);
	}
	void post()
	{
		x++;
		System.out.println("The post increment value is" +  x);
	}
		
	

	public static void main(String[] args) {
		Increment i= new Increment();
		i.post();
		i.pre();
	}

}
