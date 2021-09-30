package model.entities;

import entities.enums.Color;

public class Circle extends AbstractShape {
	
	private Double radius;

	public Circle() {
		super();
	}
	
	public Circle(Double radius) {
		this.radius = radius;
	}	

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getRadius(),2);
	}
	
}
