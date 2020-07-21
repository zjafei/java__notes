package com.l8abstract;

public class Init {
  public static void main(String[] args) {
    TelPhone tel1 = new CellPhone();
    tel1.call();
    tel1.message();
    TelPhone tel2 = new SmartPhone();
    tel2.call();
    tel2.message();
  }
}