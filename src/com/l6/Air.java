package com.l6;

public class Air extends Transportation {
  public Air(){
    this.name = "飞机";
    this.number = 200;
  }

  public void fly(){
    System.out.println("我可以飞");
  }
}