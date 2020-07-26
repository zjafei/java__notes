package com.l20collection_map;

public class Course {
  /**
   * 课程类
   */
  private String id;
  private String name;

  public Course(String id, String name){
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
}