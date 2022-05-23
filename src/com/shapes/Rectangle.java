package com.shapes;

public class Rectangle extends Shapes {
	
	public Rectangle(int l, int b) {
		length = l;
		breath = b;
	}

	@Override
	public void draw() {
		int area = length*breath;
		System.out.println("Area of the Rectangle = " +area);
		
	}

}
