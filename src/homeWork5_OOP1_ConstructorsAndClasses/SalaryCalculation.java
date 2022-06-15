package homeWork5_OOP1_ConstructorsAndClasses;

public class SalaryCalculation {
    public static void main(String[] args) {

        SalesAgentSalary agent1 = new SalesAgentSalary(170, 12);
        System.out.println("Employee is on trial period. His salary is: " + agent1.getSalary() + " uah");

        SalesAgentSalary agent2 = new SalesAgentSalary(172, 13, 4,
                150, 16500);
        System.out.println("Employee finished trial period. His salary is: " + agent2.getSalary() + " uah");
    }
}
