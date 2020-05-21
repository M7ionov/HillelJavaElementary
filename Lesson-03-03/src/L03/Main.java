package L03;

import java.util.Arrays;

public class Main {
    final static int MAX_STUDENTS_IN_GROUP = 20;
    final static int NUMBER_OF_LESSONS = 12;

    public static void main(String[] args) {
        String[] surnames = new String[MAX_STUDENTS_IN_GROUP];
        int[][] marks = new int[MAX_STUDENTS_IN_GROUP][];

        addStudent("Ivanov", surnames, marks);
        addStudent("Petrov", surnames, marks);
        addStudent("Ivanov", surnames, marks);
        print(surnames, marks);
        delete("Ivanov", surnames, marks);
        System.out.println();
        print(surnames, marks);
        System.out.println();
        addMarks("Petrov", surnames, marks );
        addStudent("Sidorov", surnames, marks);
        addMarks("Sidorov", surnames, marks );
        System.out.println();
        print(surnames, marks);
        System.out.println();
        contains("Petrov", surnames, marks);
        System.out.println();
        clearAll(surnames, marks);
        print(surnames, marks);
    }

    public static void addStudent(String newStudentName, String[] surnames, int[][] marks){
        int nextPosition = -1;
        for (int i=0; i<surnames.length; i++){
            if (surnames[i]==null) {
                nextPosition = i;
                break;
            }
        }
        if (nextPosition==-1){
            System.out.println("Couldn't add student "+newStudentName );
            return;
        }
        surnames[nextPosition]=newStudentName;
        marks[nextPosition]=new int [NUMBER_OF_LESSONS];
    }
    public static void print(String[] surnames, int[][] marks){
        System.out.println("Name\tMarks");
        for (int i=0; i<surnames.length; i++){
            if (surnames[i] == null){
                continue;
            }
            System.out.println(surnames[i]+"\t"+Arrays.toString(marks[i]));
        }
    }
    public static void delete(String toDelete, String[] surnames, int[][] marks){
        //1. find
        for (int i=0; i<surnames.length; i++){
            if (surnames[i]!=null && surnames[i].equalsIgnoreCase(toDelete)){
                //2. delete surnames
                surnames[i]=null;
                //3. delete marks
                marks[i]=null;
            }
        }
    }
    public static void contains(String contain, String[] surnames, int[][] marks){
        for (int i=0; i<surnames.length; i++){
            if (surnames[i]!=null && surnames[i].equalsIgnoreCase(contain)){
                System.out.println(surnames[i]);
                System.out.println("His marks = "+Arrays.toString(marks[i]));
            }
            //else
            //    System.out.println("There is no such student"+i);
        }
    }
    public static void addMarks(String toAddMarks, String[] surnames, int[][] marks){
        for (int i=0; i<surnames.length; i++){
            if (surnames[i]!=null && surnames[i].equalsIgnoreCase(toAddMarks)){
                for (int j=0; j<NUMBER_OF_LESSONS; j++) {
                    marks[i][j]=(int)(Math.random()*5);
                }
            }
        }
    }
    public static void clearAll(String[] surnames, int[][] marks){
        for (int i=0; i<surnames.length; i++){
            surnames[i]=null;
            marks[i]=null;
        }
    }
}
