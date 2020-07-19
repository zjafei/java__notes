package com.l3extend;

public class Dog extends Animal {
  public Dog(){
    System.out.println("狗类");
  }
  public void eat(String str){
    System.out.println(str + "狗可以吃东西");
  }
}