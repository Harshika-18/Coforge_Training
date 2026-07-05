package com.coforge.day4;

public class Rectangle extends Figure{
	public Rectangle() {
		super(4,5);
	}

	
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle : " + (getLength()*getBreadth()));
	}
}
