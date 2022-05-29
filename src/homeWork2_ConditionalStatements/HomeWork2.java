package homeWork2_ConditionalStatements;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        /* Task #1.Написать программу с названием “CheckPassFail”, которая выводит PASS если
        переменная “mark” типа int больше или равно 50 или вывести “FAIL” в противном
        случае. Программа всегда должна перед выходом печатать “DONE”*/

        checkPassFail();

        /* Task #2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
        если переменная “number” типа int нечетная. Или “Even Number” если переменная
        четная. Программа всегда должна перед выходом печатать “BYE”*/

        checkOddEven();

        /* Task #3.Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”,
“TWO”, ..., “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, ... 9, или
любой другой. Решить задачу двумя способами: 1) с использованием if..else if 2) с использованием
switch-case*/

        // a
        printNumberInWordA();
        // b
        printNumberInWordB();

        /* Task #4.Написать программу с названием “PrintDayInWord”, которая печатает “Sunday”,
“Monday”, .... “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 ... 7. В
противном случае программа должна вывести “Not a valid day”. Решить задачу двумя
способами: 1) с использованием if..else if 2) с использованием switch-case*/

        // a
        printDayInWordA();
        // b
        printDayInWordB();

        /* Task #5.Написать программу, которая сравнивает два числа типа int и определяет, какое из
чисел большее, а какое меньшее. Программа должна вывести что-то типа “The number
x has the greatest value”. Где “x” одно из чисел*/

        compareNumbers();

         /*6. Написать программу, которая бы решала уравнение вида a*x + b = 0 Переменные a
        и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
        Программа должна также учитывать варианты, когда или а = 0 или b = 0*/

        findingNumber();

         /*7. Написать программу, для расчёта зарплаты менеджера по продажам. Если
        менеджер совершил более 10 продаж он получает бонус 250$. Базовая ставка 1000$.*/

        salaryCalculation();

        /*8. Написать программу, которая выведет в консоль если количество продаж больше 10
        сообщение что менеджер заработал бонус, если меньше, то выполнит расчёт сколько
        осталось продаж до получения бонуса*/

        bonusCalculation();

         /*9. Получение ипотеки
        Имеем 2 переменные - возраст мужа и жены
        Написать программу, которая выводит в консоль результат.
        Задачу решить используя вложенный if (сначала проверить возраст жены, потом мужа)*/

        mortgageCalculation();

        /*10. Написать метод, используя switch, который принимает в себя номер пальца -
         переменную типа int и в зависимости от номер выводит название пальца (1-”большой”
         и т д)*/

        nameOfFinger();

    }

    // for task #1
    public static void checkPassFail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mark: ");
        int mark = scanner.nextInt();
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }

    // for task #2
    public static void checkOddEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("BYE");
    }

    // for task #3
    // a
    public static void printNumberInWordA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    // b
    public static void printNumberInWordB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    // for task #4
    // a
    public static void printDayInWordA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not a valid day");
        }
    }

    // b
    public static void printDayInWordB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }

    // for task #5
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int b = scanner.nextInt();
        if (a != b) {
            if (a > b) {
                System.out.println("The number" + a + "has the greatest value");
            } else {
                System.out.println("The number" + b + "has the greatest value");
            }
        }
    }

    // for task #6
    public static void findingNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        float a = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        float b = scanner.nextInt();
        if (a == 0) {
            System.out.println("x can be any number");
        } else if (b == 0) {
            System.out.println("x is equal to 0");
        } else {
            float x = -(b / a);
            if (Math.round(a * x + b) == 0) {
                System.out.println("x is equal " + x);
            }
        }
    }

    // for task #7
    public static void salaryCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of sales: ");
        int numberOfSales = scanner.nextInt();
        int salary = 1000;
        int bonus = 250;
        if (numberOfSales > 10) {
            salary += bonus;
        }
        System.out.println("The salary of employee is " + salary);
    }

    // for task #8
    public static void bonusCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of sales: ");
        int numberOfSales = scanner.nextInt();
        int salesLeft;
        if (numberOfSales >= 10) {
            System.out.println("Manager earned bonus.");
            // в умові не вказано expected result коли numberOfSales = 10, тому додумала сама)
        } else {
            salesLeft = 10 - numberOfSales;
            System.out.println("The number of sales left to earn the bonus is " + salesLeft);
        }
    }

    // for task #9
    public static void mortgageCalculation() {
        int ageOfHusband = 30;
        int ageOfWife = 35;
        if (ageOfWife > 35) {
            if (ageOfHusband > 35) {
                System.out.println("The family will receive a mortgage.");
                ;
            } else {
                System.out.println("The family will NOT receive a mortgage.");
            }
        } else {
            System.out.println("The family will NOT receive a mortgage.");
        }
    }

    // for task #10
    public static void nameOfFinger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the finger number :");
        int fingerNumber = scanner.nextInt();
        switch (fingerNumber) {
            case 1:
                System.out.println("thumb");
                break;
            case 2:
                System.out.println("forefinger");
                break;
            case 3:
                System.out.println("middle finger");
                break;
            case 4:
                System.out.println("fourth finger");
                break;
            case 5:
                System.out.println("pinkie");
                break;
            default:
                System.out.println("This is the wrong number");
        }
    }
}
