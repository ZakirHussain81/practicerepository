package com.shapes;

public class Square extends Shapes implements ITwoDShape {
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	public void draw() {
		int area = side*side;
		System.out.println("Area of the square = " +area);
		
	}

	@Override
	public void draw2d() {
		// TODO Auto-generated method stub
		System.out.println("Drawing 2d Square");
	}

	
	
	

}
