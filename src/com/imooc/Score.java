package com.imooc;

public class Score {
  static int score1 = 86; 
  static int score2 = 92; 

  private int num;
  
  public int getNum(){
    return this.num;
  }

  int sum(){
    int sum = Score.score1 + Score.score2;
    return sum;
  }

  int num1;
  int num2;
  static int num3;

  public Score(){
    num1 = 91;
    System.out.println("通过改造函数为变量num1赋值");
  }

  // 初始化块
  {
    num2 = 74;
    System.out.println("通过初始化块为变量num2赋值");
  }

  // 静态初始化块
  static{
    num3 = 83;
    System.out.println("通过静态初始化块为变量num3赋值");
  }

  public static void main(String[] args) {
    Score sum = new Score();
    System.out.println("num1: " + sum.num1);
    System.out.println("num2: " + sum.num2);
    System.out.println("num3: " + Score.num3);
    // Score sum2 = new Score()
  }
}