package com.assignment;

import java.util.Scanner;

public class SolidPrincipleTester {

	public static void main(String[] args) {
		
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter the width and height of rectangle: ");
      double m_width = scan.nextDouble();
      double m_height = scan.nextDouble();      
      Rectangle rectObject = new Rectangle();
      rectObject.setM_height(m_height);
      rectObject.setM_width(m_width);
      System.out.println("Area of Rectangle is: " +rectObject.getArea());
      System.out.println("----------------------------------------");
      System.out.println("\nEnter the side square: ");
      double side = scan.nextDouble();
      Square squareObject = new Square();
      squareObject.setSide(side);
      System.out.println("Area of square is: " +squareObject.getArea());

		
	}

}
