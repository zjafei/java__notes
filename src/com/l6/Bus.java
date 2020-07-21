package com.l6;

public class Bus extends Transportation {
  public Bus(){
    this.name = "公共汽车";
    this.number = 40;
  }

  public void run(){
    System.out.println("我可以跑");
  }
}