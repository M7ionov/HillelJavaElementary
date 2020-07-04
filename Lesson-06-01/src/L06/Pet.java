package L06;

import java.sql.SQLOutput;

public class Pet extends Animal {
    private String name;
    private boolean isVaccinated;

    public Pet(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }
    @Override
    protected void greet(){
        super.greet();
        System.out.println("my name is " + name);
    }
    @Override
    protected void parametrs(){
        super.parametrs();
        System.out.println(", Name is " + name + ", Vaccinated - "+isVaccinated);
    }
}
