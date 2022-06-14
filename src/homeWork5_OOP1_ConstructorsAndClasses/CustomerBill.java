package homeWork5_OOP1_ConstructorsAndClasses;

public class CustomerBill {
    public static void main(String[] args) {
        CustomerBill customer1 = new CustomerBill();
    }

    private double billSum;

    private CustomerBill() {
        this.billSum = new BillCalculation(9.5, 550, 80,
                28, 30).getPhoneBill();
        System.out.println("Monthly fee is: " + billSum + " uah");
    }
}
