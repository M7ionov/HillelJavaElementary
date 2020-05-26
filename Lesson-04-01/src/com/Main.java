package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

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
        assert student != null;
        setMark(student, 5, 5);
        contains(student);
        print(students);
        delete("Ivanov", students);
        students = addStudent("Abramov", students);
        addMarks(students);
        print(students);
        //students = sortAbc(students);
        clearAll(students);
        print(students);

    }
    public static Student[] addStudent(String newStudentName, Student[] oldStudents) {
        Student[] result = new Student[oldStudents.length +1];
        System.arraycopy(oldStudents, 0, result, 0, oldStudents.length);
        result[oldStudents.length]= new Student(newStudentName);
        return result;
    }

    public static void print(Student[] students){
        System.out.println();
        IntStream.range(0, students.length).filter(i -> students[i] != null).mapToObj(i -> "Surname - " + students[i].surname + "\nPresence = " + (Arrays.toString(students[i].presence) + "\nMarks = \t" + Arrays.toString(students[i].marks))).forEach(System.out::println);
    }

    public static void contains(Student student){
        System.out.println();
        System.out.println(student.surname);
        System.out.println("His marks = "+Arrays.toString(student.marks));
        System.out.println("He present = "+Arrays.toString(student.presence));
    }

    public static void addMarks(Student[] students) {
        int i = 0;
        while (i < students.length) {
            if (students[i] != null)  {
                for (int j = 0; j < students[i].marks.length; j++) {
                    if (students[i].marks[j] == 0) {
                        students[i].marks[j] = (int) (Math.random() * 5);
                        students[i].presence[j] = students[i].marks[j] > 0;
                    }
                }
            }
            i++;
        }
    }

    public static Student[] sortAbc(Student[] oldStudents) {
        Student[] result = new Student[oldStudents.length];
        Arrays.sort(oldStudents);
        System.arraycopy(oldStudents, 0, result, 0, result.length);
        return result;

    }
    public static void clearAll(Student[] students){
        Arrays.fill(students, null);
    }

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
        for (Student student : students) {
            if (student != null && student.surname.equalsIgnoreCase(surname)) {
                return student;
            }
        }
        return null;
    }
}