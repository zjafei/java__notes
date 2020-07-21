package com.l9shape;

public class Init {
  public static void main(String[] args) {
    Shape shape0 = new Rectangle(20, 10);
    shape0.perimeter();
    shape0.area();
    Shape shape1 = new Circle(10);
    shape1.perimeter();
    shape1.area();
  }
}