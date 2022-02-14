package homeWork1_DataTypes;

public class HomeWork1 {
    public static void main(String[] args) {
        //Formulas: Celsius = 5/9 (F - 32) Kelvin = C + 273.16
        //F = (°C * 9/5) + 32

        //task #1.Convert Fahrenheit to Celsius
        double fahrenheitTemperature = 77;
        double celsiusTemperature = 5.0/9.0 * (fahrenheitTemperature - 32);
        System.out.println("For fahrenheit temperature " + fahrenheitTemperature
                + " celsius temperature is: " + celsiusTemperature);

        //task #2.Convert Celsius to Fahrenheit
        celsiusTemperature = 77;
        fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        System.out.println("For celsius temperature " + celsiusTemperature
                + " fahrenheit temperature is: " + fahrenheitTemperature);

        //task #3.Convert Celsius to Kelvin
        double kelvinTemprature = celsiusTemperature + 273.16;
        System.out.println("For celsius temperature " + celsiusTemperature
                + " kelvin tempature is: " + kelvinTemprature);

        /* Formulas:
        1m = 39.37in
        1mi = 1.609km
        1kg = 2.2046lb
        1km/hr = 0.6214mi/hr */

        //task #4.Convert meters to inches. And reverse
        double meters = 3;
        double inches = meters * 39.37;
        System.out.println(meters + " meters is "
                + inches + " inches");

        inches = 120;
        meters = inches / 39.37;
        System.out.println(inches + " inches is "
                + meters + " meters");

        //task #5.Convert miles to kilometres. And reverse
        double miles = 56;
        double kilometres = miles * 1.609;
        System.out.println(miles + " miles is "
                + kilometres + " kilometres");

        kilometres = 190;
        miles = kilometres / 1.609;
        System.out.println(kilometres + " kilometres is "
                + miles + " miles");

        //task #6.Convert kilograms to pounds. And reverse
        double kilograms = 45;
        double pounds = kilograms * 2.2046;
        System.out.println(kilograms + " kilograms is "
                + pounds + " pounds");

        pounds = 45;
        kilograms = pounds / 2.2046;
        System.out.println(pounds + " pounds is "
                + kilograms + " kilograms");

        //task #7. Convert speed km/hr to mi/hr. And reverse
        double km_hr = 120;
        double mi_hr = km_hr * 0.6214;
        System.out.println(km_hr + " km/hr is "
                + mi_hr + " mi/hr");

        mi_hr = 45;
        km_hr = mi_hr / 0.6214;
        System.out.println(mi_hr + " mi/hr is "
                + km_hr + " km/hr");

        //task #8. Given a mark on a test and the test total, find the percentage
        /* Example:
        Total test = 10;
        marked test = 8;
        Results: 80% */
        double total = 10;
        double mark = 8;
        double result = mark / total * 100;
        System.out.println("The test results are " + result + "%");

        //task #9. Получение ипотеки
        /* Имеем 2 переменные - возраст мужа и жены
        Написать boolean - который возвращает true, если им обоим менее 35 лет (логические
                выражения и операторы сравнения), если кому то больше, то false */
        int manAge = 43;
        int womanAge = 30;
        boolean h;
        if (manAge < 35 && womanAge < 35) {
            h = true;
        } else {
            h = false;
        }
        System.out.println(h);

        //using method
        System.out.println(compareAge(43, 30));

        //task #10. Получение ипотеки
        /* Имеем переменную - доход семьи
        Написать boolean - который возвращает true, если доход меньше 50000 и больше
        20000 */
        System.out.println(income(78000));

        //task #11. Закупка
        /* Имеем 2 переменные - первая - наличие в магазине яблок сорта 1 вторая - наличие в
        магазине яблок сорта 2
        Написать boolean - который возвращает true, если есть в наличии хотя бы один сорт */
        System.out.println(availability("yes", "no"));
        //or
        System.out.println(availability(true, false));
    }

    //for task #9
    public static boolean compareAge(int manAge, int womanAge) {
        if (manAge < 35 && womanAge < 35) {
            return true;
        } else {
            return false;
        }
    }

    //for task #10
    public static boolean income(int familyIncome) {
        if (familyIncome < 50000 && familyIncome > 20000) {
            return true;
        } else {
            return false;
        }
    }

    //for task #11
    public static boolean availability(String gradeOne, String gradeTwo) {
        if (gradeOne == "yes" || gradeTwo == "yes") {
            return true;
        } else {
            return false;
        }
    }

    //or
    public static boolean availability(boolean gradeOneIsPresent, boolean gradeTwoIsPresent) {
        if (gradeOneIsPresent || gradeTwoIsPresent) {
            return true;
        } else {
            return false;
        }
    }
}
