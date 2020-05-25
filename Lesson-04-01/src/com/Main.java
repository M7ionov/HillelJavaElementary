package com;

import java.util.Arrays;

public class Main {
    final static int MAX_STUDENTS_IN_GROUP = 20;
    final static int LESSONS_NUM = 12;

    public static void main(String[] args) {
        Student[] students = new Student[0];
        print(students);
        students = addStudent("Ivanov", students);
        students = addStudent("Petrov", students);
        students = addStudent("Ivanov", students);
        students = addStudent("Sidorov", students);
        addMarks(students);
        print(students);
        Student student = findStudent("Sidorov", students);
        setMark(student, 5, 5);
        contains(student);
        print(students);
        delete("Ivanov", students);
        students = addStudent("Abramov", students);
        addMarks(students);
        print(students);



    }
    public static Student[] addStudent(String newStudentName, Student[] oldStudents) {
        Student[] result = new Student[oldStudents.length +1];
        for (int i=0; i<oldStudents.length; i++) {
            result[i] = oldStudents[i];
        }
        result[oldStudents.length]= new Student(newStudentName);
        return result;
    }

    public static void print(Student[] students){
        System.out.println();
        for (int i=0; i<students.length; i++){
            if (students[i] == null){
                continue;
            }
            System.out.println("Surname - " + students[i].surname+"\nPresence = "+(Arrays.toString(students[i].presence)+"\nMarks = \t"+Arrays.toString(students[i].marks )));
        }
    }

    public static void contains(Student student){
        System.out.println();
        System.out.println(student.surname);
        System.out.println("His marks = "+Arrays.toString(student.marks));
        System.out.println("He present = "+Arrays.toString(student.presence));
    }

    public static void addMarks(Student[] students) {
        for (int i = 0; i < students.length ; i++) {
            if (students[i] != null)  {
                for (int j = 0; j < students[i].marks.length; j++) {
                    if (students[i].marks[j] == 0) {
                        students[i].marks[j] = (int) (Math.random() * 5);
                        if (students[i].marks[j] > 0)
                            students[i].presence[j] = true;
                        else
                            students[i].presence[j] = false;
                    }
                }
            }
        }
    }

    public static Student[] sortAbc(String newStudentName, Student[] oldStudents) {
        Student[] result = new Student[oldStudents.length +1];
        for (int i=0; i<oldStudents.length; i++) {
            result[i] = oldStudents[i];
        }
        result[oldStudents.length]= new Student(newStudentName);
        return result;
    }
     /*   public static void clearAll(String[] surnames, int[][] marks, boolean[][] presence){
            for (int i=0; i<surnames.length; i++){
                surnames[i]=null;
                marks[i]=null;
               presence[i]=null;
            }
        }*/

    public static void delete(String toDelete, Student[] students){
        for (int i=0; i<students.length; i++){
            if (students[i]!=null && students[i].surname.equalsIgnoreCase(toDelete)){
                students[i]=null;
             }
        }
    }

    public static void setMark(Student student, int mark, int lessonNum){
            student.marks[lessonNum-1]=mark;
    }

    public static Student findStudent(String surname, Student[] students){
        for (int i=0; i<students.length; i++){
            if (students[i]!=null && students[i].surname.equalsIgnoreCase(surname)){
                return students[i];
            }
        }
        return null;
    }
}
