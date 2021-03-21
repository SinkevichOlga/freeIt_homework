package homework_2;

public class Task_7 {
//Имеется прямоугольное отверстие размерами a и b,
// определить, можно ли его полностью закрыть круглой картонкой радиусом r.

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int r = 5;
        double c = a^2 + b^2;
        if ( c <= r*r ) {
            System.out.println("Прямоугольное отверстие закрыто круглой картонкой");
        } else {
            System.out.println("Прямоугольное отверстие не закрыто круглой картонкой");
        }

    }
}
