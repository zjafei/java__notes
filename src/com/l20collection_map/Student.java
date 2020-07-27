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

  public boolean hasCourse(Course course) {
    boolean b = this.courses.contains(course);
    System.out.println("已选课程中"+(b==true?"":"不")+"包含课程: " + course.getName());
    return b;
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    boolean b = false;
    if (this == obj) {
      b = true;
    }
    if (obj instanceof Student) {
      Student student = (Student) obj;
      if (this.getName() == null) {
        if (student.getName() == null) {
          b = true;
        }
      } else {
        if (this.getName().equals(student.getName())) {
          b = true;
        }
      }

    }
    return b;
  }
}