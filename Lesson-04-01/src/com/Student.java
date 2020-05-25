package com;

public class Student {
    String surname;
    int[] marks;
    boolean[] presence;

    public Student(String surname){
        this.surname = surname;
        this.marks = new int[Main.LESSONS_NUM];
        this.presence = new boolean[Main.LESSONS_NUM];
    }




}
