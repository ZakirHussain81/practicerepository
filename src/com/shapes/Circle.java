package com.shapes;

public class Circle extends Shapes {
	
	public Circle(int radius) {
		pi=3.14f;
		this.radius=radius;
	}

	@Override
	public void draw() {
		float area = pi*radius*radius;
		System.out.println("Area of the Circle = " +area);
		
	}

	
}
