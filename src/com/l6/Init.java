package com.l6;

public class Init {
  public static void main(String[] args) {
    Transportation bus0 = new Bus();
    Bus bus1 = new Bus();
    Transportation air0 = new Air();
    Air air1 = new Air();
    bus0.transport();
    air0.transport();
    bus1.run();
    air1.fly();
  }
}