package com.l2inner_class;

public class TestPage {
  private String name = "imooc";
  int age = 20;
  public class Inner{
    String name = "爱慕课";
    public void show(){
      System.out.println("TestPage's name: " + TestPage.this.name);
      System.out.println("Inner name: " + Inner.this.name);
      System.out.println("Inner age: " + TestPage.this.age);
    }
  }

  public static void main(String[] args) {
    TestPage testPage = new TestPage();
    Inner inner = testPage. new Inner();
    inner.show();
  }
}