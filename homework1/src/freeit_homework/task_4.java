package freeit_homework;

public class task_4 {
    //Определить число, полученное выписыванием в обратном порядке цифр
    //любого 4-х значного натурального числа n.

    public static void main (String[] args){
        int n = 8615;
        int n1 = n / 1000;
        int n2 = n / 100 % 10;
        int n3 = n / 10 % 10 ;
        int n4 = n % 10;
        int number = n4 * 1000 + n3 * 100 + n2 * 10 + n1;
        System.out.println( number );
    }
}
