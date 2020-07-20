package com.l5super;

// final public class Animal {// 添加 final 修饰符将不会被子类继承
public class Animal {
  public int age;
  public String name = "动物";
  // final public String name = "动物"; // 添加 final 修饰符 变为常量
  public Animal(){
    System.out.println("动物类");
  }

  // final public void eat(){// 添加 final 修饰符子类将不能覆盖方法
  public void eat(){
    System.out.println(this.name + "吃东西");
  }
}