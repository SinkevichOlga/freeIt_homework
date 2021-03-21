package homework_2;

public class Task_9 {
//Изменить пример с суммой чисел таким образом,
// чтобы рассчитывалась не сумма, а произведение,
// т.е. факториал числа.

/*double averageSum = 0;
    double sum = 0;
    int n = 0;
    int x = (int)(Math.random() * 20);
while(x != 0) {
        sum += x;
        n ++;
        x = (int)(Math.random()*20);
    }
if(n != 0){
        averageSum = sum / n;
    } else {
        averageSum = 0;
    }
System.out.println("среднее:" + averageSum);
 */

    public static void main(String[] args) {
        double fact = 0;
        int n = 0;
        int x = (int) (Math.random());
        while (x != 0) {
            fact += x * (x - 1);
            n++;
            x = (int) (Math.random());
        }
        if (n != 0) {
            fact = x * n;
            //считаем произведение
            //} else {
            //   fact = 0;
            //}
            System.out.println("факториал числа:" + x + "равен" + fact);

        }
    }
}

