package L06;

public class Cat extends Pet{
    public Cat(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }
    @Override
    public void greet(){
        super.greet();
        System.out.println("\tMeow");
    }
}
