package com.l12;

public class Bus extends Auto implements IBus {
  public Bus(String model, double price, int peopleNumber) {
    this.setModel(model);
    this.setPrice(price);
    this.setPeopleNumber(peopleNumber);
  }

  private int peopleNumber;

  public void setPeopleNumber(int peopleNumber) {
    this.peopleNumber = peopleNumber;
  }

  public int getPeopleNumber() {
    return this.peopleNumber;
  }

  public String getInfo() {
    return super.getInfo() + "\t" + this.getPeopleNumber() + "人";
  }
}