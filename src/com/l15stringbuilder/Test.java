package com.l15stringbuilder;

public class Test {
  public static void main(String[] args) {
    // 创建一个空的StringBuilder对象
    StringBuilder str = new StringBuilder();

    // 追加字符串
    str.append("jaewkjldfxmopzdm");

    int l = str.length();
    // 从后往前每隔三位插入逗号
    for (int i = l; i > 0; i--) {
      if (i != l && (l - i) % 3 == 0) {
        str.insert(i, ",");
      }
    }

    // 将StringBuilder对象转换为String对象并输出
    System.out.print(str.toString());
  }
}