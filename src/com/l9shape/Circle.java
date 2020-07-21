package com.l9shape;

public class Circle extends Shape {
  public Circle(int radius) {
    this.radius = radius;
  }

  private int radius;

  public void perimeter() {
    System.out.println("圆的周长: " + (this.radius * 2 * Math.PI));
  }

  public void area() {
    System.out.println("圆的面积: " + (Math.pow(this.radius, 2) * Math.PI));
  }
}