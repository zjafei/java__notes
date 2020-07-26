package com.l20collection_map;

import java.util.HashMap;

public class StudentList {
  private HashMap<String, Student> list;

  public StudentList() {
    this.list = new HashMap<String, Student>();
  }

  public void addStudent(Student student) {
    Student s = this.getStudent(student.getId());
    if (s == null) {
      int l = this.list.size();
      this.list.put(student.getId(), student);
      if (this.list.size() - l == 1) {
        System.out.println("学生" + student.getName() + "添加成功!");
      }
    } else {
      System.out.println("学生" + s.getName() + "已存在");
    }
  }

  public void deleteStudent(String studentId) {
    this.list.remove(studentId);
  }

  public void setStudent(String studentId, Student student) {
    if (this.getStudent(studentId) != null) {
      this.list.put(studentId, student);
    } else {
      System.out.println("学生不存在!");
    }
  }

  public Student getStudent(String studentId) {
    Student s = null;
    for (String key : this.list.keySet()) {
      if (studentId == key) {
        s = this.list.get(studentId);
      }
    }
    return s;
  }

  public void showList() {
    int i = 1;
    for (String key : this.list.keySet()) {
      Student s = this.list.get(key);
      System.out.println(i + ". " + s.getName() + "(" + s.getId() + ")");
      i = i + 1;
    }
  }

  public HashMap<String, Student> getList() {
    return list;
  }
}