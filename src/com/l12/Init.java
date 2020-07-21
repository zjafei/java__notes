package com.l12;

import java.util.Scanner;

public class Init {
  public static void main(String[] args) {
    DadaAutos autos = new DadaAutos();
    autos.addAuto(new Bus("奥迪A4", 500, 4));
    autos.addAuto(new Bus("马自达6", 400, 4));
    autos.addAuto(new PickUp("皮卡雪6", 450, 4, 2));
    autos.addAuto(new Bus("金龙", 800, 20));
    autos.addAuto(new Truck("松花江", 400, 4));
    autos.addAuto(new Truck("依维柯", 1000, 20));

    System.out.println("欢迎使用答答注册系统: ");
    System.out.println("你是否需要注册: 1是 0否");
    Scanner scan = new Scanner(System.in);

    if (scan.next().equals("1")) {
      System.out.println("你可以租车的类型及其价目表: ");
      System.out.println("序号\t汽车型号\t租金\t\t容量");
      autos.showAutoList();
      int length = 0;
      while(length < autos.maxSelectAutos){
        length = length + 1;
        System.out.println("请选择你的第 " + length + " 辆汽车: ");
        autos.setSelectAuto(scan.next());
      }
      System.out.println("请输入你租用的天数: ");
      System.out.println("你需要支付: " + autos.getTotal(Integer.parseInt(scan.next())) + "元");
    } else {
      System.out.println("欢迎下次光临!!");
    }
  }
}