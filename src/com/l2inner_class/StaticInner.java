package com.l2inner_class;

public class StaticInner {
  int a = 10;
  static int b = 100;
  
  public static class SInner{
    int b = 1000;
    StaticInner staticInner =  new StaticInner();

    public void show(){
      System.out.println("StaticInner a: " + staticInner.a);
      System.out.println("StaticInner b: " + StaticInner.b);
      System.out.println("SInner b: " + b);
    }
  }

  public static void main(String[] args) {
    SInner sInner = new  StaticInner.SInner();
    sInner.show();
  }
}