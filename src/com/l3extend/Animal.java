package com.l3extend;

public class Animal {
  public int age;
  public String name = "动物";
  public Animal(){
    System.out.println("动物类");
  }
  public void eat(){
    System.out.println(this.name + "吃东西");
  }
}