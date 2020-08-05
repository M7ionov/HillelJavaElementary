package L08;

import java.util.Scanner;

//Создать свою коллекцию (имплементировать интерфейс Collection)
public class Main {
    private static Container students;

    public static void main(String[] args) {
        Container students = new Container();

        System.out.println(students.add(new Student("ivanov")));
//        addStudentFromUserInput(students);
        students.add(new Student("petrov"));
        students.add(new Student("sidorov"));
        System.out.println(students);
        System.out.println(students.contains(new Student("sidorov")) + " - contains sidorov");
        System.out.println(students.size());
//        System.out.println(students.remove(new Student("petrov")) + " - remove petrov");
        System.out.println(students.size());
        System.out.println(students);

        Container students2 = new Container();
        students2.add(new Student("ivanidze"));
        students2.add(new Student("petridze"));
        students2.add(new Student("sidoridze"));
        System.out.println(students2);

        students.addAll(students2);
        System.out.println(students);
        System.out.println("add all = " + students.size());

        System.out.println(students.contains(new Student("petridze")) + " - contains petridze");
//        System.out.println(students.remove(new Student("petridze")) + " - remove petridze");
        System.out.println(students);
        System.out.println(students.size());

//        Container students3 = new Container();
//        students3.add(new Student("sidorov"));
//        students3.add(new Student("petrov"));
//        students3.add(new Student("ivanidze"));
//        students3.add(new Student("sidoridze"));

//        System.out.println(students.retainAll(students2));
//        System.out.println(students);
//        System.out.println("retainAll = " + students.size());

//        System.out.println(students.removeAll(students2));
//        System.out.println(students);
//        System.out.println("removeAll = " + students.size());
//
        System.out.println(students);
        System.out.println(students.containsAll(students2));
        System.out.println("contains all = " + students.size());
//
//        students.clear();
//        System.out.println(students);
//        System.out.println("is empty = " + students.isEmpty());
    }

    public static void addStudentFromUserInput(Container students) {
        Main.students = students;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please input the student name");
            if (scanner.hasNext()) {
                String name = scanner.next();
                System.out.println("Your input - " + name);
                Student student = new Student(name);
                students.add(student);
                return;
            } else {
                System.out.println("Incorrect entry, exception " + scanner.nextLine());
            }
        }
        while (true);
    }


}


