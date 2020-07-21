package com.l12;

import java.util.ArrayList;
import java.util.List;

public class DadaAutos {
  private List<Auto> list = new ArrayList<Auto>();
  private List<String> selectAutos = new ArrayList<String>();
  private double total;
  public final int maxSelectAutos = 4;

  public void addAuto(Auto auto) {
    this.list.add(auto);
  }

  public double getTotal(int days) {
    String[] autoIndexList = this.selectAutos.toArray(new String[0]);
    Auto[] autos = this.list.toArray(new Auto[0]);
    for (String autoIndex : autoIndexList) {
      this.total = this.total + autos[Integer.parseInt(autoIndex) - 1].getPrice() * days;
    }
    return this.total;
  };

  public int getSelectAutosLength() {
    return this.selectAutos.size();
  }

  public void setSelectAuto(String index) {
    this.selectAutos.add(index);
  }

  public void showAutoList() {
    int i = 1;
    for (Auto auto : this.list) {
      System.out.println(i + "\t" + auto.getInfo());
      i = i + 1;
    }
  }

}