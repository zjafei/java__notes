package com.l2inner_class;

public class Outer {
  private int a = 99; // 外部类的私有属性
  private int c = 10;
  public class Inner{
    int b = 2; // 内部类的成员属性
    int c = 20;
    public void show(){
      System.out.println("outer a:" + a);
      System.out.println("inner b:" + b);
      System.out.println("outer c:" + Outer.this.c);
      System.out.println("inner c:" + c);
    } 
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    Inner inner = outer. new Inner();
    inner.show();
  }
}