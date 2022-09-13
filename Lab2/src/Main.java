import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*В массиве хранится информация о баллах, полученных спортсменом-десятиборцем в каждом из десяти видов спорта.
    Для выхода в следующий этап соревнований общая сумма баллов должна превысить некоторое известное значение.
    Определить, вышел ли данный спортсмен в следующий этап соревнований. */
    private static void task1() {
        Random rnd = new Random();
        int checkpoint = 120, sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += rnd.nextInt(21);
        }
        if (sum < checkpoint) {
            System.out.print("\n  The athlete did not pass ");
        } else {
            System.out.print("\n  The athlete passed");
        }
    }

    /*Задана последовательность N вещественных чисел. Вычислить значение выражения  pow(|a1*a2*...*an|, 1/n) */
    private static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n Input the number of float elements:");
        int n = in.nextInt();
        int j = 0;
        float[] array = new float[n];
        Random rnd = new Random();
        float rezult = 1;
        do {
            array[j] = rnd.nextFloat(20.0F);
            System.out.print("\n" + array[j]);
            rezult *= array[j];
            j++;
        }
        while (j < n);
        System.out.print("\n" + Math.pow(Math.abs(rezult), 1.0 / n));
    }

    /*Дана последовательность вещественных чисел а1, a2, ..., а15.
    Определить, есть ли в последовательности отрицательные числа.
    В случае положительного ответа определить порядковый номер первого из них. */
    private static void task3() {
        int n = 45, index = 0, c = 0;
        float[] array = new float[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextFloat(141) - 40;
        }
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                index = i;
                c = 1;
                break;
            } else {
                c = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        if (c == 1) {
            System.out.print("\n The index of negative number in subsequence is  " + index);
        } else {
            System.out.print("\n There no negatives in subsequence");
        }
    }

    /*Удалить элемент массива целых чисел больший куба первого элемента этого массива.
    Если таких элементов нет, выдать сообщение «удаление не произведено»,
    иначе удалить последний элемент из найденных*/
    private static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n Input the number of int elements:");
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[0];
        int quantity_del = 0;
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(25);
        }
        System.out.println(Arrays.toString(arr));
        int compare = arr[0] * arr[0] * arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (compare < arr[i]) {
                arr2 = ArrayUtils.add(arr2, arr[i]);
                quantity_del++;
            } else {
                continue;
            }
        }
        System.out.println(Arrays.toString(arr2));
        if (quantity_del == 0) {
            System.out.println("Deleting haven't been done");
        } else {
            arr2 = ArrayUtils.remove(arr2, arr2.length - 1);
            System.out.println(Arrays.toString(arr2));
        }
    }

    /*Последовательность а1, а2, ..., an состоит из нулей и единиц.
    Поставить в начало этой последовательности нули, а затем единицы. */
    private static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n Input the quantity of elements of array :");
        int n = in.nextInt();
        Random rnd = new Random();
        short[] arr_zeros_ones = new short[n];
        for (int i = 0; i < n; i++) {
            arr_zeros_ones[i] = (short) rnd.nextInt(2);
        }
        System.out.println(Arrays.toString(arr_zeros_ones));
        Arrays.sort(arr_zeros_ones);
        System.out.println(Arrays.toString(arr_zeros_ones));
    }

    public  static  void  main (String[] args)
    {
        System.out.print("\n Task 1 \n");
        task1();
        System.out.print("\n Task 2 \n");
        task2();
        System.out.print("\n Task 3 \n");
        task3();
        System.out.print("\n Task 4 \n");
        task4();
        System.out.print("\n Task 5 \n");
        task5();
    }
}

