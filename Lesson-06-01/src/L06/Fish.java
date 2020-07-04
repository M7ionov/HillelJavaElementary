package L06;

public class Fish extends Pet{
    public Fish(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }
    @Override
    public void greet(){
        //super.greet();
        System.out.println("....");
    }
}
