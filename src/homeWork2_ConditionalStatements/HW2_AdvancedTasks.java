package homeWork2_ConditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class HW2_AdvancedTasks {
    public static void main(String[] args) {

        //for Task #1
        checkSale();

        //for Task #2
        checkArea();

        //for Task #3
        checkDivider();

        //for Task #4
        checkNumber();

        //for Task #5
        compareNumbers();
    }

    /* Task #1.Сумма покупки составляет а гривен. Если а больше 1000 гривен, то предоставляется
        скидка 15%. Вывести на экран сумму покупки с учетом скидки либо сообщение о том,
        что скидка не предоставляется.*/
    public static void checkSale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount you spent: ");
        double a = scanner.nextDouble();
        if (a > 1000) {
            double b = a * 0.85;
            System.out.println("The amount of the purchase including the discount is: " + b);
        } else {
            System.out.println("No discount");
        }
    }

    /* Task #2.Известны площади круга и квадрата. Определить: уместится ли круг в квадрате
    уместится ли квадрат в круге */
    public static void checkArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the area of square: ");
        double areaOfSquare = scanner.nextDouble();
        System.out.println("Enter the area of circle: ");
        double areaOfCircle = scanner.nextDouble();
        //r = √ (S / π).
        double diameter = Math.sqrt(areaOfCircle / Math.PI) * 2;
        //а = √ S
        double squareSide = Math.sqrt(areaOfSquare);
        //d = √2S
        double squareDiagonal = Math.sqrt(2 * areaOfSquare);
        if (diameter <= squareSide) {
            System.out.println("The circle will fit in the square.");
        } else {
            System.out.println("The circle will NOT fit in the square.");
        }
        if (squareDiagonal <= diameter) {
            System.out.println("The square will fit in the circle.");
        } else {
            System.out.println("The square will NOT fit in the circle.");
        }
    }

    /* Task #3.Определить, является ли число а делителем числа b */
    public static void checkDivider() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        if (b % a == 0) {
            System.out.println(a + " is divider of " + b);
        } else {
            System.out.println(a + " is NOT divider of " + b);
        }
    }

    /* Task #4.Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3). */
    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double number = scanner.nextDouble();
        if (number >= -5 && number <= 3) {
            System.out.println("Number " + number + " belongs to the interval from -5 to 3.");
        } else {
            System.out.println("Number " + number + " does NOT belong to the interval from -5 to 3.");
        }
    }

    /* Task #5.Даны три различных числа. Определить, какое из них (первое, второе или третье) -
        самое большое - самое маленькое - является средним */
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the Third number:");
        int num3 = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        }
        if (num2 >= num1 && num2 >= num3) {
            max = num2;
        }
        if (num3 >= num2 && num3 >= num1) {
            max = num3;
        }
        System.out.println("The largest number is: " + max);
        int min = Integer.MIN_VALUE;
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        }
        if (num2 <= num1 && num2 <= num3) {
            min = num2;
        }
        if (num3 <= num2 && num3 <= num1) {
            min = num3;
        }
        System.out.println("The smallest number is: " + min);
        int average = Integer.MIN_VALUE;
        if (num1 != max && num1 != min) {
            average = num1;
        }
        if (num2 != max && num2 != min) {
            average = num2;
        }
        if (num3 != max && num3 != min) {
            average = num3;
        }
        System.out.println("The average number is: " + average);
    }
}
