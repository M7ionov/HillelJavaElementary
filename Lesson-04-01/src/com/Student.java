package com;

public class Student {
    //state - состояние
    String surname;
    int[] marks;
    boolean[] presence;

    public Student(String s){
        this(s, 16);
    }

    public Student(String s, int numOfLessons){
        surname = s;
        marks = new int[numOfLessons];
        presence = new boolean[numOfLessons];
    }

    //behavior - поведение
}
