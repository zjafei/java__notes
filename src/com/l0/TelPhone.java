package com.l0;

public class TelPhone {

  private float screen;   // 私有:    本类
  float cpu;              // 默认:    本类 同一包
  protected float memory; // 受保护:  本类 同一包 子类
  public String number;   // 公开:    本类 同一包 子类 其他类

  public TelPhone(){
    System.out.println("this TelPhone class.");
  }

  public void setScreen(float screen) {
    this.screen = screen;
  }

  public float getScreen() {
    return this.screen;
  }

}
