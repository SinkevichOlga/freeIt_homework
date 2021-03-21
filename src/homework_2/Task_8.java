package homework_2;

import java.util.Random;

public class Task_8 {
//Имеется целое число
// (задать с помощью Random rand = new Random();
// int x = rand.nextInt() ).
// Это число – количесво денег в рублях.
// Вывести это число, добавив к нему слово «рублей» в правильном падеже.

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();

 switch ( x % 10 ) {
     case 0:
         System.out.println( x + " рублей");
         break;
     case 1:
         System.out.println( x + " рубль");
         break;
     case 2:
     case 3:
     case 4:
       System.out.println( x + " рубля");
       break;
     case 5:
     case 6:
     case 7:
     case 8:
     case 9:
       System.out.println( x + " рублей");
       break;
     default:
       System.out.println( " нет денег");
     }
    }
}
