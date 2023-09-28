package de.telran.homework1;

import java.util.Scanner;

public class Task2test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt;
        do {
            System.out.print("Введите трехзначное число: ");
            myInt= scanner.nextShort();
        } while (myInt<100||myInt>999);
        System.out.println("Вы ввели числo: "+ myInt);
        short hundreds = (short) (myInt/ 100);
        short tens = (short) (myInt%100/ 10);
        short units = (short) (myInt% 10);

        System.out.println("Сотни: "+hundreds);
        System.out.println("Десятки: "+tens);
        System.out.println("Единицы: "+units);
        System.out.println("Число " + myInt+"->"+hundreds+","+tens+","+units);
        scanner.close();

    }
}
//* Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5
// Я решил попробовать усложнить задачу тем, что число должно идти от пользователя.