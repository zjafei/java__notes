package com.l17date;

import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
  public static void main(String[] args) throws ParseException {
    Date d = new Date();
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String today = sd.format(d);
    System.out.println(d);
    System.out.println(today);
    System.out.println(sd.parse(today));

    Date now = new Date();
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
    System.out.println(sdf3.format(now));
    
    String d2 = "2014-6-1 21:05:36";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
		Date date = sdf.parse(d2);
    System.out.println(date);
    
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int day = c.get(Calendar.DAY_OF_MONTH);
    int hour = c.get(Calendar.HOUR_OF_DAY);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println("当前时间: " + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
    Date d3 = c.getTime();
    Long time =  c.getTimeInMillis(); // 当前毫秒
    System.out.println("当前时间: " + d3);
    System.out.println("当前时间戳: " + time);

    Date date2 = c.getTime();
        
		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
		// 将日期转换为指定格式的字符串
		String now2 = sdf4.format(date2);
		System.out.println("当前时间：" + now2);
  }
}