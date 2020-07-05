package KKK;

public class homeworkLesson1 {
    public static void main(String[] args) {
        //2) Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte x1 = 121;
        short x2 = 0;
        int x3 = 1;
        long x4 = 2;
        float x5 = 3.4744f;
        double x6 = 5.67;
        char x7 = 'q';
        String x8 = "Hello world!";

        //3) Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.

        System.out.println(arithmeticExpression(1.01f, 2.01f, 3.01f, 4.01f));

        //4) Написать метод, принимающий на вход два целых числа и проверяющий,
        //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        //Написать метод, которому в качестве параметра передается целое число, метод должен

        System.out.println(sumOfIntegers(10, 15));

        //5) Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        positiveNumber(1);
        positiveNumber(0);
        positiveNumber(-1);

        //6)Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        // если число отрицательное, и вернуть false если положительное.

        System.out.println(positiveNumberV2(-1));
        System.out.println(positiveNumberV2(1));

        //7) Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        helloName("Konstantin");

        //8)*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.


        leapYear(2100);
        leapYear(220);
        leapYear(2300);
        leapYear(2400);
        leapYear(2024);
        leapYear(2015);
        leapYear(2021);
    }

    static float arithmeticExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean sumOfIntegers(int a, int b) {
        return 10 <= a + b && a + b <= 20;
    }

    static void positiveNumber(int a) {
        if (a >= 0)
            System.out.println(a + " - Число положительное");
        else
            System.out.println(a + " - Число отрицательное");
    }

    static boolean positiveNumberV2(int x) {
        return x < 0;
    }

    static void helloName(String name) {
        System.out.println("Hello," + name + "!");
    }

    static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " - високосный год");
        else
            System.out.println(year + " -  невисокосный год");
    }
}
