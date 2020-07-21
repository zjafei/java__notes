package com.l10interface;

public class CellPhone extends TelPhone{
  public void call(){
    System.out.println("通过键盘打电话");
  }
  public void message(){
    System.out.println("通过键盘发短信");
  }
}