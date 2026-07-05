package com.coforge.day4;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		/*
		Rectangle rectangle = new Rectangle();
		rectangle.area();
		
		Square square = new Square();
		square.area();

		Triangle triangle= new Triangle();
		triangle.area();
		
		*/
		
		Figure figure;
		figure = new Rectangle();
		figure.area();
		
		figure = new Square();
		figure.area();
		
		figure = new Triangle();
		figure.area();
		
		
		//Rectangle r = (Rectangle) new Figure(4,5);
		//reverse of Dynamic method Dispatch is not possible.
		//because, all rectangles are figures but all figures are not rectangles.
		
	}

}
