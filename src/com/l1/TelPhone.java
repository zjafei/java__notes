package com.l1;

public class TelPhone {

  private float screen; // 私有
  float cpu; // 默认
  protected float memory;// 受保护
  public String number;// 公开

  public TelPhone(){
    System.out.println("this TelPhone2 class.");
  }

  public void setScreen(float screen) {
    this.screen = screen;
  }

  public float getScreen() {
    return this.screen;
  }

}
