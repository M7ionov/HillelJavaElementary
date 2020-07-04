package L06;

public class GuideDog extends Pet{
    private boolean isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }
    @Override
    public void greet(){
        super.greet();
        takeHome(isTrained);
    }
    @Override
    public void parametrs() {
        super.parametrs();
        System.out.println("\tTrained - " + isTrained);
    }

    public void takeHome(boolean isTrained){
        if (isTrained == false)
            System.out.println("\tyou are not my master.");
        else
            System.out.println("\tI can take you home.");


    }
}
