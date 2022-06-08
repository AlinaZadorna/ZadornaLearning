package homeWork4_Methods;

import sun.management.Agent;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {

        //For task A

        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseArray(arrayOfNumbers);

        //For task B

        int hours = 167;
        double rate = 21;
        double baseHoursSalary = 160 * rate;
        int workExperience = 3;
        int numberOfSales = 8;
        double sumOfSales = 16000;

        countSalary(hours, rate, baseHoursSalary, workExperience, numberOfSales, sumOfSales);

        //For task C

        double spendGB = 9.5;
        double minutes = 550;
        double sms = 80;
        double foreignCallZoneOne = 28;
        double foreignCallZoneTwo = 30;
        double tax = 1.07;

        countTariffFinalCost(spendGB, minutes, sms, foreignCallZoneOne, foreignCallZoneTwo, tax);
    }

//    A - Написать метод (void) который переворачивает массив.

//    В main должен быть вызван метод который переворачивает массив, потом
//    вывести с помощью sout. Важно - не вывести в консоль с последнего элемента, а
//    проапдейтить существующий массив с помощью void

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
        System.out.println("This is reversed array: " + Arrays.toString(arr));
    }

//    B - Расчёт зарплаты агента по продажам
//    Расчёт зарплаты нужно разбить на несколько методов

    //1. Первый метод получает количество отработанных часов и базовую
//    ставку. если количество отработанных часов больше 160 то каждый
//    последующий час по коэф 1,5 (параметры у метода - входящие часы int, и double
//    rate) , возвращаемое значение - зарплата. Это должна быть сумма базовой
//    зарплаты (до 160 часов) + бонус за переработку свыше 160 часов (если переработка была) (double)

    public static double salary(int hours, double rate) {
        double bonus = 0;
        double coef = 1.5;
        if (hours > 160) {
            bonus = (hours - 160) * coef * rate;
        }
        return rate * 160 + bonus;
    }

//2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
//    зависимости от стажа работы (параметры у метода - стаж работы int, возвращаемое
//            значение double коэффициент) до 2 лет 1 от 2 до 4 - 1.2 от 4 до 6 - 1.3 от 6 лет - 1.4

    public static double coef(int workExperience) {
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

//3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
//    штраф 150 (параметры у метода - количество продаж int, возвращаемое значение
//    double бонус за количество продаж)

    public static double salesBonus(int numberOfSales) {
        double bonus = 0;
        if (numberOfSales > 20) {
            bonus = 250;
        } else if (numberOfSales < 10) {
            bonus = -150;
        }
        return bonus;
    }

//4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже
//    добавляется бонус (параметры у метода - сумма продаж double, возвращаемое значение double бонус за сумму продаж)

    public static double sumBonus(double sumOfSales) {
        double bonus = 0;
        if (sumOfSales > 15000) {
            bonus = 250;
        }
        return bonus;
    }
//В методе main проинициализировать все нужные переменные, вызвать методы
//    и сделать расчет. Результат вывести в консоль

    public static void countSalary(int hours, double rate, double baseHoursSalary, int workExperience,
                                   int numberOfSales, double sumOfSales) {
        double finalSalaryTest = baseHoursSalary * coef(workExperience) + salary(hours, rate) - baseHoursSalary
                + salesBonus(numberOfSales) + sumBonus(sumOfSales);
        System.out.println("The salary of agent is: " + finalSalaryTest);
    }

//    C - Счет за телефон

//    Рассчитать стоимость пакета в месяц. Расчёт по каждому из параметров
//    сделать в отдельном методе. Потом общий подсчёт провести в методе main и вывести
//    в консоль c помощью sout
//1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб
//            (вход параметр кол-во потраченных гб)

    public static double internetCost(double spendGB) {
        double tariffCost = 200;
        double extraPrice;
        if (spendGB > 8) {
            double extraMb = (spendGB - 8) * 1024;
            double countParts = extraMb / 500;
            if (countParts % 0.5 != 0) {
                double countRemains = Math.ceil(countParts);
                extraPrice = countRemains * 50;
            } else {
                extraPrice = countParts * 50;
            }
            tariffCost = tariffCost + extraPrice;
        }
        return tariffCost;
    }
//2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75

    public static double callCost(double minutes) {
        double priceForCalls = minutes * 0.5;
        if (minutes >= 500) {
            priceForCalls = 500 * 0.5 + (minutes - 500) * 0.75;
        }
        return priceForCalls;
    }

    //3. Смс до 50 шт 1 грн после 1,50

    public static double smsCost(double sms) {
        double priceForSms = sms * 1;
        if (sms >= 50) {
            priceForSms = 50 + (sms - 50) * 1.5;
        }
        return priceForSms;
    }

//4. Звонки за рубеж зона 1 1.5 грн/мин

    public static double foreignCallCost_ZoneOne(double minutes) {
        return minutes * 1.5;
    }

//5. Звонки за рубеж зона 2 2 грн/мин

    public static double foreignCallCost_ZoneTwo(double minutes) {
        return minutes * 2;
    }

//    После подсчёта суммы добавляется налог 7 %

    public static void countTariffFinalCost(double spendGB, double minutes, double sms, double foreignCallZoneOne,
                                            double foreignCallZoneTwo, double tax) {
        double tariffFinalCost = (internetCost(spendGB) + callCost(minutes) + smsCost(sms)
                + foreignCallCost_ZoneOne(foreignCallZoneOne) + foreignCallCost_ZoneTwo(foreignCallZoneTwo)) * tax;
        System.out.println("Monthly fee is: " + tariffFinalCost + " uah");
    }
}

