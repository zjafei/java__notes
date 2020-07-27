package com.l20collection_map;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
// import java.util.Scanner;

public class CourseList {
  private ArrayList<Course> list = new ArrayList<Course>();

  public String getUUID() {
    Calendar c = Calendar.getInstance();
    return c.getTimeInMillis() + "_" + Math.random();
  }

  public boolean isNumeric(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public boolean hasCourse(Course course) {
    boolean b = this.list.contains(course);
    System.out.println(
        "备选课程中" + (b == true ? "第" + (this.list.indexOf(course) + 1) + "位置" : "不") + "包含课程: " + course.getName());
    System.out.println();
    return b;
  }

  public void showList() {
    Iterator<Course> it = this.list.iterator();
    int i = 1;
    while (it.hasNext()) {
      Course course = it.next();
      System.out.println(i + ".\t" + (course.getId()) + "\t-->\t" + course.getName());
      i = i + 1;
    }
    // int i = 1;
    // for (Course course : this.list) {
    // System.out.println(i + ".\t" + (course.getId()) + "\t-->\t" +
    // course.getName());//
    // i = i + 1;
    // }
  }

  public void addCourse(String name) {
    this.list.add(0, new Course(this.getUUID(), name));
    // int s = this.list.size();
    // if ((this.list.size() - s) == 1) {
    // Course temp = this.list.get(0);
    // System.out.println("添加了课程: " + (temp.getId()) + " --> " + temp.getName());//
    // }
  }

  public void addCourses(String[] names) {
    int l = names.length;
    Course[] courses = new Course[l];
    for (int i = 0; i < names.length; i++) {
      courses[i] = new Course(this.getUUID(), names[i]);
    }
    this.list.addAll(0, Arrays.asList(courses));
    // int s = this.list.size();
    // int l2 = this.list.size();
    // if((l2 - s) == l){
    // System.out.println("添加了课程:");
    // for (int i = 1; i <= l; i++) {
    // Course temp = this.list.get(l2 - i);
    // System.out.println(i + ". "+(temp.getId()) + " --> " + temp.getName());//
    // }
    // }
  }

  public void remove(int index) {
    if (index < this.list.size()) {
      this.list.remove(this.list.get(index));
    }
  };

  public void modify(int index, String name) {
    if (index < this.list.size()) {
      this.list.set(index, new Course(this.list.get(index).getId(), name));
    }
  };

  public void studentSort() {
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student("2", "eric"));
    students.add(new Student("4", "tom"));
    students.add(new Student("3", "bob"));
    students.add(new Student("1", "polo"));
    System.out.println("------------------排序前------------");
    for (Student student : students) {
      System.out.println(student.getId() + " " + student.getName());
    }

    System.out.println("------------------排序后------------");
    Collections.sort(students);
    for (Student student : students) {
      System.out.println(student.getId() + " " + student.getName());
    }

    System.out.println("------------------自定义排序后------------");
    Collections.sort(students, new Comparator<Student>() {
      @Override
      public int compare(Student s1, Student s2) {
        /* 按员工编号正序排序 */
        // return o1.getEmpno()-o2.getEmpno();
        /* 按员工编号逆序排序 */
        // return o2.getEmpno()-o1.getEmpno();
        /* 按员工姓名正序排序 */
        return s1.getName().compareTo(s2.getName());
        /* 按员工姓名逆序排序 */
        // return o2.getEname().compareTo(o1.getEname());
      }
    });
    for (Student student : students) {
      System.out.println(student.getId() + " " + student.getName());
    }
  }

  public static void main(String[] args) {
    // this.studentSort();
    CourseList l = new CourseList();
    // StudentList sl = new StudentList();
    l.studentSort();
    // Student s = new Student(l.getUUID(), "小马");
    // Student s1 = new Student(l.getUUID(), "小王");
    // Student s2 = new Student(l.getUUID(), "小明");

    // sl.addStudent(s);
    // sl.addStudent(s1);
    // sl.addStudent(s2);
    // sl.showList();
    // System.out.println("--------------------------");

    // sl.deleteStudent(s1.getId());
    // sl.showList();
    // System.out.println("--------------------------");

    // sl.setStudent(s.getId(), s2);
    // sl.showList();
    // System.out.println("--------------------------");

    // l.addCourse("前端知识");
    // l.addCourses(new String[] { "C语言", "数据结构", "高等数学", "大学英语", "离散数学", "汇编语言" });
    // l.showList();
    // Course c = l.list.get(2);
    // l.hasCourse(new Course(c.getId(), c.getName()));
    // System.out.println("欢迎" + s.getName() + "(学号:" + s.getId() + ")同学来选课:");

    // Scanner scan = new Scanner(System.in);
    // int i = 0;
    // while (i < 3) {
    // int num = i + 1;
    // System.out.println("请输入第" + num + "门科的序号: ");
    // String no = scan.next();
    // if (l.isNumeric(no)) {
    // int noInt = Integer.parseInt(no) - 1;
    // if (noInt < 0 || noInt >= l.list.size()) {
    // System.out.println("输入有误");
    // } else {
    // s.selectCourse(l.list.get(noInt));
    // i = i + 1;
    // }

    // } else {
    // System.out.println("输入有误");
    // System.out.println("请重新输入第" + num + "门科的序号: ");
    // }
    // }
    // scan.close();
    // System.out.println(s.getName() + "(学号:" + s.getId() + ")同学选择了以下课程:");
    // s.showSelectCourse();
    // s.hasCourse(new Course(c.getId(), c.getName()));
    // System.out.println("------------------------------------");
    // l.modify(1, "sss");
    // l.showList();
    // System.out.println("------------------------------------");
    // l.remove(1);
    // l.showList();

    // remove(1) //是删除索引为1的元素
    // remove(new Integer(1)) //则删除元素1

    // ArrayList<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(2);
    // numbers.add(5);
    // numbers.add(4);
    // numbers.add(8);
    // numbers.add(4);
    // for (Integer i : numbers) {
    // System.out.println("int: " + i);
    // }
    // System.out.println("------------------------------------");
    // numbers.remove(new Integer(2));
    // for (Integer i : numbers) {
    // System.out.println("int: " + i);
    // }
  }
}