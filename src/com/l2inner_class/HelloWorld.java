package com.l2inner_class;

public class HelloWorld {
  public class Inner{
    public void show(){
      System.out.println("welcome to inner class");
    } 
  }
  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    Inner i = helloWorld.new Inner();
    i.show();
  }
}