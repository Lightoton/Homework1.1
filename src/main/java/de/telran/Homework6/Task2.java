package de.telran.Homework6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год который вас интересует: ");
        int year = scanner.nextInt();
        if (isLeap(year)) {
            System.out.println("Год " + year + " високосный");

        } else
            System.out.println("Год " + year + " не високосный!");

    }

    static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
//Реализуйте программу, которая попросит пользователя ввести год
//и напечатать этот год. Метод isLeap проверяет високосный год или нет.