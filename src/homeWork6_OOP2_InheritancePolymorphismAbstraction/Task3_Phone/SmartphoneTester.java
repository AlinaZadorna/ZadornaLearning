package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task3_Phone;

public class SmartphoneTester {
    public static void main(String[] args) {
        iOSSmartphone iOSSmartphone = new iOSSmartphone("iOS", "lightning", "AppStore");
        System.out.println("Operation system is: " + iOSSmartphone.getOperationSystem()
                + ". Charger type is: " + iOSSmartphone.getChargeType()
                + ". Application store is: " + iOSSmartphone.getApplicationStore() + ".");

        AndroidSmartphone androidSmartphone = new AndroidSmartphone("Android", "USB-C", "PlayMarket");
        System.out.println("Operation system is: " + androidSmartphone.getOperationSystem()
                + ". Charger type is: " + androidSmartphone.getChargeType()
                + ". Application store is: " + androidSmartphone.getApplicationStore() + ".");
    }

}
