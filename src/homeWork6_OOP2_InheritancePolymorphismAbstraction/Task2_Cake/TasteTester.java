package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task2_Cake;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(15);
        System.out.println("Birthday Cake has " + birthdayCake.getCandles() + " candles.");

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(3);
        System.out.println("Wedding Cake has " + weddingCake.getTiers() + " tiers.");
    }
}
