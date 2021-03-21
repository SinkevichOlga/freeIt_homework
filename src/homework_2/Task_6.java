package homework_2;

import java.util.Scanner;

public class Task_6 {
//Создайте число.
// A) Определите, является ли число трехзначным.
// B) Определите, является ли его последняя цифра семеркой.
// C) Определите, является ли число четным.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        sc.close();

        //A) Определите, является ли число трехзначным.
        if (n > 99 && n < 1000) {
            System.out.println("Введеное число:" + n + " - трехзначное");
        } else {
            System.out.println("Введено неверное число");
        }

        // B) Определите, является ли его последняя цифра семеркой.
        if (n % 10 == 7) {
            System.out.println("Последняя цифра 7");
        } else {
            System.out.println("Последняя цифра не 7");
        }

        // C) Определите, является ли число четным.
        if ((n % 2) == 0) {
            System.out.println("Число " + n + " четное ");
        } else {
            if ((n % 1) == 0) {
                System.out.println("Число " + n + " нечетное ");
            }
        }

    }
}
