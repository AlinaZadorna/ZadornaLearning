package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task3_Phone;

public abstract class Phone {

    public void dialNumber (){
        System.out.println("User dials the number");
    }

    public abstract void setChargerType(String chargerType);

    public abstract void setOperationSystem(String os);

    public abstract void setApplicationStore(String store);
}
