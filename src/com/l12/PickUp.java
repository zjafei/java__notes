package com.l12;

public class PickUp extends Auto implements IBus, ITruck {
  public PickUp(String model, double price, int peopleNumber, int goodsNumber) {
    this.setModel(model);
    this.setPrice(price);
    this.setPeopleNumber(peopleNumber);
    this.setGoodsNumber(goodsNumber);
  }

  private int peopleNumber;
  private int goodsNumber;

  public void setPeopleNumber(int peopleNumber) {
    this.peopleNumber = peopleNumber;
  }

  public int getPeopleNumber() {
    return this.peopleNumber;
  }

  public void setGoodsNumber(int goodsNumber) {
    this.goodsNumber = goodsNumber;
  }

  public int getGoodsNumber() {
    return this.goodsNumber;
  }

  public String getInfo() {
    return super.getInfo() + "\t" + this.getPeopleNumber() + "人 " + this.getGoodsNumber() + "吨";
  }
}