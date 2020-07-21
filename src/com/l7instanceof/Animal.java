package com.l7instanceof;

public class Animal {
  public Animal(){
    this.name = "动物类";
    this.eat();
  }

  public String name;

  public void eat(){
    System.out.println(this.name + "吃东西");
  }
}