package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task1_Fruit;

public class Apple extends Fruit {

    public Apple(int calories) {
        setCalories(calories);
    }

    public void removeSeeds() {
        System.out.println("Now it's apple pitting");
    }

    public void makeJuice() {
        System.out.println("Apple juice is done");
    }
}
