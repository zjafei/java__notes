package com.l8abstract;

public class SmartPhone extends TelPhone{
  public void call(){
    System.out.println("通过语音打电话");
  }
  public void message(){
    System.out.println("通过语音发短信");
  }
}