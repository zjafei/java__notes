package com.l0;
// import com.l0.TelPhone;
// import com.l1.TelPhone;

public class InitTelPhone {
  public static void main(String[] args) {
    com.l1.TelPhone phone = new com.l1.TelPhone();
    // phone.screen = 3.5f;
    // System.out.println(phone.screen);
    phone.setScreen(3.5f);
    System.out.println("屏幕: " + phone.getScreen());
  }
}