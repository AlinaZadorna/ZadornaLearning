package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task1_Fruit;

public class Orange extends Fruit {

    public Orange(int calories) {
        setCalories(calories);
    }

    public void peelOrange() {
        System.out.println("Now it's orange peeling");
    }

    public void makeJuice() {
        System.out.println("Orange juice is done");
    }
}
