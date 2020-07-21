package com.l12;

public class Truck extends Auto implements ITruck {
  public Truck(String model, double price, int goodsNumber) {
    this.setModel(model);
    this.setPrice(price);
    this.setGoodsNumber(goodsNumber);
  }

  private int goodsNumber;

  public void setGoodsNumber(int goodsNumber) {
    this.goodsNumber = goodsNumber;
  }

  public int getGoodsNumber() {
    return this.goodsNumber;
  }

  public String getInfo() {
    return super.getInfo() + "\t" + this.getGoodsNumber() + "吨";
  }
}