package com.l20collection_map;

public class Course {
  /**
   * 课程类
   */
  private String id;
  private String name;

  public Course(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getId() {
    return this.id;
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
    if (obj instanceof Course) {
      Course course = (Course) obj;
      if (this.getName() == null) {
        if (course.getName() == null) {
          b = true;
        }
      } else {
        if (this.getName().equals(course.name)) {
          b = true;
        }
      }

    }
    return b;
  }
}