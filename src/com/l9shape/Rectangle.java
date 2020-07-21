package com.l9shape;

public class Rectangle extends Shape{
  public Rectangle(int length, int weight){
    this.length = length;
    this.weight = weight;
  }

  private int length;
  private int weight;

  public void perimeter(){
    System.out.println("矩形的周长: " + ((this.length + this.weight)*2));
  }

  public void area(){
    System.out.println("矩形的面积: " + (this.length * this.weight));
  }
}