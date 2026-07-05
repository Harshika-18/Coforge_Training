package com.coforge.day4;

public class Square extends Figure {
	public Square() {
		super(4);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Square : " + (getSide()*getSide()));
	}

}
