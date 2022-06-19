package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task1_Fruit;

public class JuiceMarket {
    public static void main(String[] args) {

        Apple apple = new Apple(23);
        apple.removeSeeds();
        apple.makeJuice();
        System.out.println("Apple has " + apple.getCalories() + " calories.");

        Banana banana = new Banana(13);
        banana.peelBanana();
        banana.makeJuice();
        System.out.println("Banana has " + banana.getCalories() + " calories.");

        Lemon lemon = new Lemon(10);
        lemon.peelLemon();
        lemon.makeJuice();
        System.out.println("Lemon has " + lemon.getCalories() + " calories.");


        Orange orange = new Orange(32);
        orange.peelOrange();
        orange.makeJuice();
        System.out.println("Orange has " + orange.getCalories() + " calories.");

    }
}
