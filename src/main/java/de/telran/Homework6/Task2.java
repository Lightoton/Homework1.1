package de.telran.Homework6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год который вас интересует: ");
        int year = scanner.nextInt();
        if (isLeap(year)==Integer.MIN_VALUE ){
            System.out.println("Год "+year+" не високосный!");

        }else
            System.out.println("Год "+year+" високосный");

    }
    static int isLeap(int year){
        if (year%4==0 && year%100!=0 ){
            return Integer.MAX_VALUE;
        }else
                if (year%400!=0){
                    return Integer.MIN_VALUE;
                }else
                    return Integer.MAX_VALUE;
    }
}
//Реализуйте программу, которая попросит пользователя ввести год
//и напечатать этот год. Метод isLeap проверяет високосный год или нет.