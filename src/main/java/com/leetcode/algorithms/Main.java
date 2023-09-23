package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args)  {


        Student student = new Student(1,15,"q");
        Student student1 = new Student(2,19,"w");
        Student student2 = new Student(3,13,"e");
        Student student3 = new Student(4,14,"r");
        Student student4 = new Student(5,11,"t");


        List<Student> stList = new ArrayList<>();

        stList.add(student);
        stList.add(student1);
        stList.add(student2);
        stList.add(student3);
        stList.add(student4);

        System.out.println(stList);


        Student.IdComparator q = new Student.IdComparator();

        Collections.sort(stList, q);


        System.out.println(stList);
    }
}

class Student   {

    int id;
    int age;
    String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    static class IdComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {

            if (o1.id==o2.id){
                return 0;
            }else if(o1.id<o2.id){
                return -1;
            }else {
                return 1;
            }

        }
    }
}
