package homeWork5_OOP1_ConstructorsAndClasses;

public class SalesAgentSalary {

    private int hours;
    private double rate;
    private int workExperience;
    private int numberOfSales;
    private double sumOfSales;
    private double salary;

    public SalesAgentSalary(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
        setSalary(hours, rate);
    }

    public SalesAgentSalary(int hours, double rate, int workExperience, int numberOfSales,
                            double sumOfSales) {
        this.hours = hours;
        this.rate = rate;
        this.workExperience = workExperience;
        this.numberOfSales = numberOfSales;
        this.sumOfSales = sumOfSales;
        setSalary(hours, rate, workExperience, numberOfSales, sumOfSales);
    }

    private double salary(int hours, double rate) {
        double bonus = 0;
        double coef = 1.5;
        if (hours > 160) {
            bonus = (hours - 160) * coef * rate;
        }
        return rate * 160 + bonus;
    }

    private double coef(int workExperience) {
        double coef;
        if (workExperience < 2) {
            coef = 1;
        } else if (workExperience < 4) {
            coef = 1.2;
        } else if (workExperience < 6) {
            coef = 1.3;
        } else {
            coef = 1.4;
        }
        return coef;
    }

    private double salesBonus(int numberOfSales) {
        double bonus = 0;
        if (numberOfSales > 20) {
            bonus = 250;
        } else if (numberOfSales < 10) {
            bonus = -150;
        }
        return bonus;
    }

    private double sumBonus(double sumOfSales) {
        double bonus = 0;
        if (sumOfSales > 15000) {
            bonus = 250;
        }
        return bonus;
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(int hours, double rate) {
        this.salary = salary(hours, rate);
    }

    private void setSalary(int hours, double rate, int workExperience,
                          int numberOfSales, double sumOfSales) {
        double baseHoursSalary = 160 * rate;
        this.salary = baseHoursSalary * coef(workExperience) + salary(hours, rate) - baseHoursSalary
                + salesBonus(numberOfSales) + sumBonus(sumOfSales);
    }
}
