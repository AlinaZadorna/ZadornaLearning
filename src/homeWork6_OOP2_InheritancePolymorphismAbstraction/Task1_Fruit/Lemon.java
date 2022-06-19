package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task1_Fruit;

public class Lemon extends Fruit {

    public Lemon(int calories) {
        setCalories(calories);
    }

    public void peelLemon() {
        System.out.println("Now it's lemon peeling");
    }

    public void makeJuice() {
        System.out.println("Lemon juice is done");
    }
}
