package com.imooc;

public class HelloWorld {
  String name;
  String sex;
  static int age;

  public HelloWorld() {
    System.out.println("通过构造方法初始化name");
    this.name = "tom";
  }

  // 初始化块
  {
    System.out.println("通过初始化块初始化sex");
    this.sex = "男";
  }

  // 静态初始化模块
  static {
    System.out.println("通过静态初始化块初始化sex");
    HelloWorld.age = 20;
  }

  public void show(){
    System.out.println("姓名: "+this.name +", 性别: " + this.sex+", 年龄: " + HelloWorld.age);
  }

  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.show();
  }

}