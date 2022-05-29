package homeWork3_LoopsAndArrays;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {

        //For task #1
        findMin();

        //For task #2
        findSinus();

        //For task #3
        sortArray();

        //For task #4
        checkIfPalindrome();

        //For task #5
        reverseString();

        //For task #6
        countElements();

        //For task #7
        reverseArray();

        //For task "Кости"
        diceGame();
    }

//1. Написать программу, которая находит минимальное значение в массиве

    public static void findMin() {
        int[] array = {3, 7, 29, 3940, 8, -1, 87, 36, 2, 55, 6};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }

//2. Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов от 0 до 360.

    public static void findSinus() {
        double[] arrayDegrees = new double[36];
        for (int i = 0; i < arrayDegrees.length; i++) {
            arrayDegrees[i] = (i + 1) * 10;
            double sin = Math.sin(Math.toRadians(arrayDegrees[i]));
            System.out.println("Sinus of " + arrayDegrees[i] + " is " + sin);
        }
    }

//3. Написать программу, которая сортирует массив от минимума в максимум

    public static void sortArray() {
        int[] array = {3, 7, 29, 3940, 8, -1, 87, 36, 2, 55, 6};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        System.out.println("This is the sorted array from min to max: " + Arrays.toString(array));
    }

//4. Написать программу, которая проверяет является ли строка палиндромом (используя массив char)
//код как получить массив букв из строки
//char[] arrayOfChars = "ABC".toCharArray();

    public static void checkIfPalindrome() {
        String myString = "Was it a car or a cat I saw";
        String stringWithoutSpaces = myString.replaceAll("\\s", "").toLowerCase();
        char[] arrayOfChars = stringWithoutSpaces.toCharArray();
        boolean isPalindrome = false;
        for (int i = 0; i < arrayOfChars.length / 2; i++) {
            char a = arrayOfChars[i];
            char b = arrayOfChars[arrayOfChars.length - 1 - i];
            if (a != b) {
                System.out.println("The string is NOT palindrome");
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }
        if (isPalindrome)
            System.out.println("The string is palindrome");
    }

//5. Написать программу, которая выводит реверсивную строку

    public static void reverseString() {
        String originalString = "This is the string";
        String reversedString = new StringBuffer(originalString).reverse().toString();
        System.out.println("This is original string: " + originalString + ". " +
                "This is reversed string: " + reversedString + ".");
    }

    //6. Написать программу, которая подсчитывает количество элементов массива int*ов,
//которые делятся на 2, но не делятся на 3 и выводит в консоль

    public static void countElements() {
        int[] arrayOfInts = {4, 78, 21, 12, 6, 14, 488, 7, 2, 56};
        int lengthOfEven = 0;
        for (int i = 0; i < arrayOfInts.length; i++)
            if (arrayOfInts[i] % 2 == 0 && arrayOfInts[i] % 3 != 0) {
                lengthOfEven = lengthOfEven + 1;
            }
        System.out.println("The number of elements that can be divided by 2 and can NOT be divided by 3 is: " + lengthOfEven);
    }

//7. Написать программу, который переворачивает массив

    public static void reverseArray() {
        String stringOfLetters = "a, b , c, d, e, f, g";
        char[] arrayOfletters = stringOfLetters.toCharArray();
        System.out.println("This is the reversed array: ");
        for (int e = arrayOfletters.length - 1; e >= 0; e--) {
            System.out.print(arrayOfletters[e]);
        }
        System.out.println();
    }

//Игра “Кости”
//1. Бросьте кубик за пользователя (сгенерируйте случайное число от 1 до 6) и
//продвиньте пользователя на это количество делений на игровом поле.
//код который возвращает рандомное число от 1 до 6
//Random random = new Random();
//int die = random.nextInt(6) + 1;

//2. После каждого броска вывести инфо в консоль пользователю, на каком игровом
//поле он находится и сколько еще мест ему нужно пройти, чтобы выиграть.
//3. Всего 5 бросков
//4. Если пользователь набирает 20 до 5 бросков, завершите игру - он выиграл.
//5. Если пользователь набирает больше или меньше 20 точно, то он проигрывает.
//6. Помните, что на доске всего 20 делений, поэтому сообщение типа «Вы
//продвинулись на позицию 22» - это баг)

    public static void diceGame() {
        int currentPosition = 0;
        int[] steps = new int[5];
        for (int i = 0; i < steps.length; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            currentPosition = currentPosition + die;
            int stepsLeft = 20 - currentPosition;
            if (currentPosition == 20) {
                System.out.println("Your position is: " + currentPosition + ". Congratulations! You won.");
                break;
            } else if (currentPosition < 20 && i < steps.length - 1) {
                System.out.println("Dice result is: " + die + ". You current position is: " + currentPosition +
                        ". You should pass " + stepsLeft + " more steps to win");
            } else {
                System.out.println("Dice result is: " + die + ". You lost.");
                break;
            }
        }
    }
}