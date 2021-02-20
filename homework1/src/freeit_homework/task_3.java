package freeit_homework;

public class task_3 {
    //Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
    //А) минут + секунд,
    //В) часов + минут + секунд,
    //С) дней + часов + минут + секунд,
    //D) недель + дней + часов + минут + секунд.

    public static void main (String[] args){
        int s1 = 4500;
        int sec1 = s1 % 60;
        int m1 = (s1-sec1)/60;
        System.out.println("A) " + m1 + " минут " + sec1 + " секунд ");

        int s2 = 4500;
        int sec2 = s2 % 60;
        int m2 = (s2-sec2)/60;
        int min2 = m2 % 60;
        int h2 = (m2-min2)/60;
        System.out.println("B) " + h2 + " часов " + min2 + " минут " + sec2 + " секунд ");

        //в пунктах С) и D) изменила значение 4500 сек, чтобы вывести наглядный результат
        int s3 = 90000;
        int sec3 = s3 % 60;
        int m3 = (s3-sec3)/60;
        int min3 = m3 % 60;
        int h3 = (m3-min3)/60;
        int hour3 = h3 % 24;
        int d3 = (h3-hour3)/24;
        System.out.println("C) " + d3 + " дней " + hour3 + " часов " + min3 + " минут " + sec3 + " секунд ");

        int s4 = 1705100;
        int sec4 = s4 % 60;
        int m4 = (s4-sec4)/60;
        int min4 = m4 % 60;
        int h4 = (m4-min4)/60;
        int hour4 = h4 % 24;
        int d4 = (h4-hour4)/24;
        int days4 = d4 % 7;
        int w4 = d4/7;
        System.out.println("D) " + w4 + " недель " + days4 + " дней " + hour4 + " часов " + min4 + " минут " + sec4 + " секунд ");

    }
}
