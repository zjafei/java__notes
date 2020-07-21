package com.l12;

public class Auto {
  private String model;
  private double price;
  private final String priceUnit = "元/天";

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public String getInfo() {
    return this.getModel() + "\t\t" + this.getPrice() + this.priceUnit;
  }
}