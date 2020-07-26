package com.l20collection_map;

import java.util.Set;
import java.util.HashSet;

public class Student {
  /**
   * 学生类
   */
  private String id;
  private String name;
  private Set<Course> courses;

  public Student(String id, String name) {
    this.id = id;
    this.name = name;
    this.courses = new HashSet<Course>();
  }

  public String getName() {
    return this.name;
  }

  public String getId() {
    return this.id;
  }

  public void selectCourse(Course course){
    this.courses.add(course);
  }

  public void showSelectCourse() {
    int i = 1;
    for (Course course : courses) {
      System.out.println(i + "\t-->\t" + course.getName());
      i = i + 1;
    }
  }
}