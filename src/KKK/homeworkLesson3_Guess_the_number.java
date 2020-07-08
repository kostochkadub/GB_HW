package KKK;
import java.util.Scanner;

public class homeworkLesson3_Guess_the_number {
    public static void main(String[] args) {
        //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        // создание объекта класса Scanner

        Scanner scanner = new Scanner(System.in);

        do {
            int mysteriousNumber = (int) (Math.random()*9);
            numberGuessedRight(3, mysteriousNumber);
            System.out.println("Повторить игру? 1 - Да, 0 - Нет.");
        } while (scanner.nextInt() == 1);

        scanner.close();

    }


    public static void numberGuessedRight(int numberOfAttempts, int mysteriousNumber)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9. У вас " + numberOfAttempts +" попытки.");
        int i = 0;
        int a=-1;
        while(i<numberOfAttempts)
        {
            a = getNumberFromScanner(sc,"Введите число в пределах от 0 до 9", 0, 9);

            if(mysteriousNumber == a){
                System.out.println("Победа, вы угадали!");
                break;
            }
            else if (mysteriousNumber < a){
                System.out.println("Загаданной число меньше. У вас осталось попыток - " + (numberOfAttempts-i-1) );
            }
            else if (mysteriousNumber > a){
                System.out.println("Загаданной число больше. У вас осталось попыток - " + (numberOfAttempts-i-1) );
            }
            i++;
        }
        if(mysteriousNumber!=a){
            System.out.println("Вы проиграли!");
        }

    }


    public static int getNumberFromScanner(Scanner sc, String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);

        return x;
    }
}