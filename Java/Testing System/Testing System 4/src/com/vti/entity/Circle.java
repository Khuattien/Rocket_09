package com.vti.entity;

public class Circle {
	private double radius;
	private String color;
	
	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color) {
		this.color= color;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Radius: "+radius +"\nColor: "+color;
	}
}
