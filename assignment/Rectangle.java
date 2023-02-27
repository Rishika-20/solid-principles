package com.assignment;

public class Rectangle implements Shape {
	private double m_width;
	 private double m_height;
	  
	public double getM_width() {
		return m_width;
	}
	public void setM_width(double m_width) {
		this.m_width = m_width;
	}
	public double getM_height() {
		return m_height;
	}
	public void setM_height(double m_height) {
		this.m_height = m_height;
	}
	@Override
	public double getArea() {
		return m_height*m_width;
	} 
}
