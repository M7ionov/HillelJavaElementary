package L07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

//Реализовать простой контейнер (MyCollection) для всего (кроме примитивов) на базе массива.
public class Main {

    public static void main(String[] args) {
        Container students = new Container();

        students.add(new Student("ivanov"));
        addStudentFromUserInput(students);
        students.add(new Student("sidorov"));
        System.out.println(students);
        System.out.println(students.contains(new Student("sidorov")));

        Container students2 = new Container();
        students2.add(new Student("ivanidze"));
        students2.add(new Student("petridze"));
        students2.add(new Student("sidoridze"));
        System.out.println(students2);

        students.addAll(students2);
        System.out.println(students);

        System.out.println("add all = " + students.size());
        System.out.println(students.remove(new Student("petridze")));
        System.out.println(students);
        System.out.println("remove = " + students.size());

        Container students3 = new Container();
        students3.add(new Student("sidorov"));
        students3.add(new Student("petrov"));
        students3.add(new Student("ivanidze"));
        students3.add(new Student("sidoridze"));

//        students.retainAll(students3);
        System.out.println(students);
        System.out.println("retainAll = " + students.size());

//        students.removeAll(students2);
//        System.out.println(students);
//        System.out.println(students.size());

        System.out.println("out s - " + students.remove(new Student("sidorov")));
        System.out.println("remove si = " + students.size());

        System.out.println("out i - " + students.remove(new Student("ivanov")));
        System.out.println("remove iv = " + students.size());

        System.out.println(students);
//        System.out.println(students.containsAll(students2));
        System.out.println("contains all = " + students.size());

        students.clear();
        System.out.println(students);
        System.out.println("is empty = " + students.isEmpty());
    }

    public static void addStudentFromUserInput(Container students){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please input the student name");
            if (scanner.hasNext()){
                String name = scanner.next();
                System.out.println("Your input - " + name);
                Student student = new Student(name);
                students.add(student);
                return;
            } else{
                System.out.println("Incorrect entry, exception " + scanner.nextLine());
            }
        }
        while (true);
    }



}
