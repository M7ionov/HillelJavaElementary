package L06;

public class Animal {
    private int id;
    private int age;
    private int weight;
    private String color;

    public Animal(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    protected void greet(){
        System.out.println(" ");
        System.out.print("Hello, ");
    }

    protected void parametrs(){
        System.out.print("id="+id+", age="+age+" years, weight="+weight+" kg, color is "+color);
    }
}
