package L07;

import java.util.Objects;
import java.util.StringJoiner;

public class Student {
    private String name;
    private int[] marks;

    public Student(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void greet() {
        System.out.println("Student");
    }

    @Override
    public String toString(){
        return new StringJoiner(", ", Student.class.getSimpleName() + "[","]")
                .add("surname='" + name + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

}
