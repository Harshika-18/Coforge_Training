package com.coforge.day4;

public class Triangle extends Figure{
	
	public Triangle() {
		super(4l,5l);
	}

	@Override
	public void area() {
		System.out.println("Area of Triangle : " + (0.5*getBase()*getHeight()));
	}
}
