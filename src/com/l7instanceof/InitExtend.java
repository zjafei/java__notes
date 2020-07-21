package com.l7instanceof;

public class InitExtend {
  public static void main(String[] args) {
    Dog dog = new Dog();

    if (dog instanceof Animal) {
      Animal animal = (Animal) dog;// 强制类型转换
      animal.eat();
    } else {
      System.out.println("无法转换");
    }
  }
}