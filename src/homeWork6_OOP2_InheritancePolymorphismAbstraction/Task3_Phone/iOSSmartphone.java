package homeWork6_OOP2_InheritancePolymorphismAbstraction.Task3_Phone;

public class iOSSmartphone extends Phone {
    private String os;
    private String chargerType;
    private String store;

    public iOSSmartphone(String os, String chargerType, String store) {
        setOperationSystem(os);
        setChargerType(chargerType);
        setApplicationStore(store);
    }

    public void setOperationSystem(String os) {
        this.os = os;
    }

    public String getOperationSystem() {
        return os;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public String getChargeType() {
        return chargerType;
    }

    public void setApplicationStore(String store) {
        this.store = store;
    }

    public String getApplicationStore() {
        return store;
    }
}
