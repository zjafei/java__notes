package com.l10interface;

public class Init {
  public static void main(String[] args) {
    TelPhone tel1 = new CellPhone();
    tel1.call();
    tel1.message();

    TelPhone tel2 = new SmartPhone();
    tel2.call();
    tel2.message();

    SmartPhone tel3 = new SmartPhone();
    tel3.call();
    tel3.message();
    tel3.playGame();

    if(tel2 instanceof SmartPhone){
      SmartPhone tel4 = (SmartPhone)tel2;
      tel4.call();
      tel4.message();
      tel4.playGame();
    }else{
      System.out.println("不可以转型");
    }

    IPlayGame ip0 = new SmartPhone();
    ip0.playGame();

    IPlayGame ip1 = new Psp();
    ip1.playGame();

    IPlayGame ip3 = new IPlayGame(){
      public void playGame(){
        System.out.println("匿名内部类 实现接口");
      };
    };

    ip3.playGame();

    new IPlayGame(){
      public void playGame(){
        System.out.println("匿名内部类 实现接口 对象实例也是匿名的");
      };
    }.playGame();
  }
}