package com.imooc;

public class InitTelPhone {
    public static void main(String[] args) {
        TelPhone telPhone = new TelPhone();
        TelPhone phone = new TelPhone(3.5f, 1.5f, "138443424",12);
        TelPhone.print();

        telPhone.number = "13862444380";
        telPhone.call();
        telPhone.sendMessage("你还好吗!");
        phone.call();
    }
}
