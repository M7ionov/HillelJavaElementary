package L06;

public class Main {

    public static void main(String[] args) {

        final Animal[] animals = create();
        for (Animal Animal: animals ) {
            Animal.greet();
            Animal.parametrs();
//            System.out.println(" ");
        }
    }

    public static Animal[] create(){
        Fish fish = new Fish(1, 1, 1, "blue", "Fishka", false);
        Dog dog = new Dog(3, 12, 25, "red", "Gav", true);
        Cat cat = new Cat(5, 2, 5, "black", "Push", true);
        Wolf wolf = new Wolf(7, 5, 15, "black", true);
        Lion lion = new Lion(9, 10, 150, "yellow", true);
        Giraffe giraffe = new Giraffe(2, 9, 120, "specled", false);
        Crocodile crocodile = new Crocodile(4, 50, 300, "green", true);
        Hamster hamster = new Hamster(6, 1, 1, "beige", "Homa", true);
        GuideDog guideDog1 = new GuideDog(8, 7, 25, "white", "Gulyash", true, true);
        GuideDog guideDog2 = new GuideDog(10, 5, 20, "redhead", "Hey", false, false);

        Animal[] animals = new Animal[]{fish, dog, cat,wolf, lion, giraffe, crocodile, hamster, guideDog1, guideDog2};
        return animals;
    }
}
