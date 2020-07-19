package com.l2inner_class;

public class TestPage1 {
  private static int score = 84;
  public  static class SInner{
    int score = 91;
    public void show(){
      System.out.println("TestPage1 score: " + TestPage1.score);
      System.out.println("Sinner score: " + this.score);
    }
  }

  public static void main(String[] args) {
    SInner sInner = new TestPage1.SInner();
    sInner.show();
  }
}