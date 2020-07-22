package com.l14string;
import java.util.Date;

public class StringTest {
  public static void main(String[] args) {
    // Java文件名
    String fileName = "HelloWorld.java";
    // 邮箱
    // String email = "laurenyang@imooc.com";

    int index = fileName.lastIndexOf(".");
    // String prefix = fileName.substring(index + 1);
    // System.out.println(prefix);
    if (index != -1 && index != 0) {
      System.out.println("Java文件名正确");
    } else {
      System.out.println("Java文件名无效");
    }

    // int index2 = email.lastIndexOf(".");

    // 定义一个字符串
    String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
    // 出现次数
    int num = 0;

    // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      System.out.println("char: " + c);
      if (c == 'a') {
        // 累加统计次数
        num++;
      }
    }
    System.out.println("字符a出现的次数：" + num);
    // StringBuffer StringBuilder 就是个数组 所有的操作都是在源空间

    Integer i = new Integer(1);
    System.out.println(i + 1);

    Date d = new Date();
    System.out.println(d);
  }
}