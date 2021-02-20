package freeit_homework;

public class task_5 {
    //Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

    public static void main (String[] args){
        int n = 8645;
        int n1 = n / 1000;
        int n2 = n / 100 % 10;
        int n3 = n / 10 % 10 ;
        int n4 = n % 10;
        boolean numeral = n1  != n2 && n1 != n3 && n1 != n4 && n2 != n3 && n2 != n4 && n3 != n4;
        System.out.println( numeral );

        //если в числе есть одинаковые цифры
        int N = 8665;
        int N1 = N / 1000;
        int N2 = N / 100 % 10;
        int N3 = N / 10 % 10 ;
        int N4 = N % 10;
        boolean Numeral = N1  != N2 && N1 != N3 && N1 != N4 && N2 != N3 && N2 != N4 && N3 != N4;
        System.out.println( Numeral );

    }
}
