package L06;

public class Wild extends Animal{
    private boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }
    @Override
    protected void greet(){
        super.greet();
        System.out.println("I am a wild animal.");
        if (isPredator == true)
            System.out.println("\tand i am angry");
    }
    @Override
    public void parametrs() {
        super.parametrs();
        System.out.println(", predator - "+isPredator);
    }
}
