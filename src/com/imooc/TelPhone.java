package com.imooc;

public class TelPhone {
    static String name = "TelPhone class";
    
    public static void print(){
      System.out.println("this is from class static");
    }

    float screen;
    float cpu;
    float mem;
    String number;
    int var;

    public TelPhone(){
        System.out.println("无参构造方法执行了");
    }

    public TelPhone(float screen, float cpu, String number, int var){
        System.out.println("有参构造方法执行了");
        this.screen = screen;
        this.cpu = cpu;
        this.number = number;
        this.var = var;
    }

    void  call(){
        int localVar = 0;
        System.out.println("var: " + this.var);
        System.out.println("localVar: " + localVar);
        System.out.println("打电话" + this.number);
        System.out.println(TelPhone.name);
    }

    void  sendMessage(String message){
        System.out.println("var: " + this.var);
        System.out.println("发短信: " + message );
    }
}
