package homeWork9_StringsAndEnums;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //for Task 1
        System.out.println(afterFeelInUpperCase("Get a modern feel with a smudge-resistant only for $2.50, you can finish now"));

        //for Task 2
        System.out.println(withoutFirstAndLastChar("Hello World"));

        //for Task 3
        System.out.println(repeatRepeatRepeat("This is my string."));

        //for Task 4
        System.out.println(backAround("Hello World"));

        //for Task 5
        Ball football = Ball.FOOTBALL;
        System.out.println(football);
        Ball basketball = Ball.BASKETBALL;
        System.out.println(basketball);
        Ball volleyball = Ball.VOLLEYBALL;
        System.out.println(volleyball);
        Ball tennisball = Ball.TENNISBALL;
        System.out.println(tennisball);
        Ball rugbyball = Ball.RUGBYBALL;
        System.out.println(rugbyball);
    }

    /*1. Написать метод который принимает в себя строку с несколькими словами и
        возвращает строку с одним словом, которое идет за текущим в upper case
        (например мы ищем строке “Get a modern feel with a smudge-resistant only for
        $2.50, you can finish now” слово которой идет после слова “feel” (т.е. должен
        вернуть “WITH” )*/

    public static String afterFeelInUpperCase(String inputString) {
        String[] words = inputString.split(" ");
        String word = null;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("feel")) {
                word = words[i + 1].toUpperCase();
                break;
            }
        } return word;
    }

   /* 2. Для входящей строки вернуть версию без первого и последнего символов
    строки. Строка может быть любой длины, включая 0.
    "Hello" → "ell"
    "abc" → "b"*/

    public static String withoutFirstAndLastChar(String inputString) {
        int endIndex = inputString.length() - 1;
        if (inputString.length() < 3) {
            return "";
        } else
            return inputString.substring(1, endIndex);
    }

        /*3. Если длина строки меньше или равно 3, то она остается без изменений. Если
    больше 3, то нужно вернуть новую строку, которая составляет 3 копии первых
    трех символов
    "Java" → "JavJavJav"
    "Chocolate" → "ChoChoCho"
    "abc" → "abс"*/

    public static String repeatRepeatRepeat(String inputString) {
        if (inputString.length() <= 3) {
            return inputString;
        } else {
            return inputString.substring(0, 3) + inputString.substring(0, 3) + inputString.substring(0, 3);
        }
    }
        /*4. Взять последний символ в строке и вернуть новую строку с последним
    символом, добавленным спереди и сзади, «cat» -> «tcatt».
    "cat" → "tcatt"
    "Hello" → "oHelloo"
    "a" → "aaa"*/

    public static String backAround(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }
}
