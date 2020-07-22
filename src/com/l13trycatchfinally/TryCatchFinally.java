package com.l13trycatchfinally;

public class TryCatchFinally {
  public static void main(String[] args) {
    TryCatchFinally tcf = new TryCatchFinally();
    // int r = tcf.test();
    // System.out.println("test方法执行完毕!返回值为: " + r);
    int r2 = tcf.test2();
    System.out.println("test方法执行完毕!返回值为: " + r2);
  }

  public int test() {
    int d = 10;
    int r = 100;

    try {
      while (d > -1) {
        d = d - 1;
        r = r + 100 / d;
      }
      return r;
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("循环抛出异常了");
      return -1;
    }
  }

  public int test2() {
    int d = 10;
    int r = 100;

    try {
      while (d > -1) {
        d = d - 1;
        r = r + 100 / d;
      }
      return r;
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("循环抛出异常了");
      return 999;
    }finally{
      System.out.println("这是finally");
    }
  }
}
