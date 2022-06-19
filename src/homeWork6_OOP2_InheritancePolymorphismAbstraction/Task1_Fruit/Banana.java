package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task1_Fruit;

public class Banana extends Fruit {

    public Banana(int calories) {
        setCalories(calories);
    }

    public void peelBanana() {
        System.out.println("Now it's banana peeling");
    }

    public void makeJuice() {
        System.out.println("Banana juice is done");
    }
}
