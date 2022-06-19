package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task1_Fruit;

public class Fruit {
    private int calories;

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void makeJuice() {
        System.out.println("Juice is done");
    }
}
