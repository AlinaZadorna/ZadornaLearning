package homeWork8_Exceptions.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateDoubleSum {

    /*1. Написать в main метод который вычисляет сумму 5 double. Получает он их со
        сканера. Сделать это в цикле for. Если пользователь вводит неверный тип
        данных - эта ошибка обрабатывается - выводится в консоль инфо и программа
        продолжает свое действие. Важно чтобы даже если число суммируемых чисел
        было 5 (т е если пользователь ввел неверное знач, то счетчик не
        увеличивается)*/

    public static void main(String[] args) {

        calculateSum();
    }

    public static void calculateSum() {
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the numbers");
            try {
                sum = sum + scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Input format is incorrect.");
                i--;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}

