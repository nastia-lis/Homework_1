package geekbrains.homework;

public class Main {
    //1 и 2 задание
    public static void main(String[] args) {
        //примитивные типы данных
        byte a = 5;
        short b = 640;
        int c = 2020;
        long d = 554878493890l;
        double e = 23.3424;
        float f = 75.2352352f;
        char g = '*';
        boolean h = true;
        //ссылочный тип данных
        String string = "Hello";

        System.out.println(result(3,5,8,4));
        System.out.println(summ(15,1));
        positivNegativ(0);
        System.out.println(negativ(-5));
        text("Настя");
        lipYear(2020);
    }
    //3 задание
    static int result(int a, int b, int c, int d) {
        int f;
        f = a * (b + (c / d));
        return f;
    }
    //4 задание
    static boolean summ(int a, int b) {
        int c;
        c = a + b;
        if (c > 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }
    //5 задание
    static void positivNegativ(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //6 задание
    static boolean negativ(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    //7 задание
    static void text(String name) {
        System.out.println("Привет, " + name + "!");
    }
    //8 задание
    static void lipYear(int year) {
        int fourYear;
        int hundredYear;
        int fourHundredYear;
        fourYear = year % 4;
        hundredYear = year % 100;
        fourHundredYear = year % 400;
        if (fourYear == 0 && hundredYear != 0) {
            System.out.println("Високосный год!");
        } else if (fourHundredYear == 0) {
            System.out.println("Високосный год!");
        } else {
            System.out.println("Год не високосный!");
        }
    }

}
