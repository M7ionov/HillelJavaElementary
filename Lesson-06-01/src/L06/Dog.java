package L06;

public class Dog extends Pet{
    public Dog(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }
    @Override
    protected void greet(){
        super.greet();
        System.out.println("\tWoof");
    }
}
