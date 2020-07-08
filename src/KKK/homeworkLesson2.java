package KKK;

public class homeworkLesson2 {
    public static void main(String[] args) {
        // 1) Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array1 = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(array1);
        swapNumber(array1);
        printArray(array1);
        System.out.println();
        // 2) Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] array2 = new int[8];

        for (int i = 0; i < array2.length; i++){
            array2[i]=i*3;
        }

        printArray(array2);
        System.out.println();

        // 3)Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] array3 = new int[] {  1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++){
            if(array3[i]<6){
                array3[i]=array3[i]*2;
            }
        }
        printArray(array3);
        System.out.println();

        //4)Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] array4 = new int[][]
                {
                        {11, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };


        for (int i = 0; i < array4.length; i++) {
            array4[i][i]=1;
        }

        for (int i = 0; i < array4.length; i++){
            for(int j=0; j < array4.length; j++){
                System.out.print(array4[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //5) Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] array5 = new int[] {  1, 5, 3, 2, 11, 4, 5, 2, 4, 18, 9, -1};
        int max = array5[0];
        int min = array5[0];
        for (int i = 0; i < array5.length; i++){
                if(max < array5[i]) {
                    max = array5[i];
                }
                if(min > array5[i]) {
                    min = array5[i];
                }
        }
        System.out.print("max = " + max + "\nmin = " + min);

        System.out.print("\n");

        //**** 7) Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        int[] array7 = new int[] { 3, 4, 5, 6, -1};
        int n=-20;
        shiftNumbers(array7, n);
        printArray(array7);

    }



    static int[] shiftNumbers(int[] array, int n)
    {
        int length = array.length;
        //убираем лишние перестановки
        n = n - ((int)(n/length)) * length;

        //если n отрицательное, то результат сдвига влева можно получить cдвигом врправо. Вычистяется как n=length+n;
        if(n<0){
            n=length+n;
        };

        //Каждый раз смещаем массив на 1 и храним первое значение.
        for (int k = 0; k < n; k++) {
            int temp = array[0];
            array[0] = array[array.length - 1];

            for (int i = 1; i < array.length - 1; i++) {
                array[array.length - i] = array[array.length - i - 1];
            }

            array[1] = temp;
        }


        System.out.println(n);

        return array;
    }



    static int[] swapNumber(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1){
                array[i]=0;
            }
            else  array[i]=1;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}

