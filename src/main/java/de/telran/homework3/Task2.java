package de.telran.homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый аргумент: ");
        int arg1 = scanner.nextInt();
        System.out.print("Введите второй аргумент: ");
        int arg2 = scanner.nextInt();
        printSum(arg1,arg2);
        printDif(arg1,arg2);
        printMult(arg1,arg2);
        printDiv(arg1,arg2);

    }

    static void printSum(int arg1, int arg2){
        int sum = arg1+arg2;
        System.out.println("Сумма= "+sum);
    }
    static void printDif(int a, int b){
        int dif = a-b;
        System.out.println("Разность= "+dif);

    }
    static void printMult(int a, int b){
        int mult = a*b;
        System.out.println("Произведение= "+mult);
    }
    static void printDiv(int a, int b) {
        if (b != 0) {
            double div = (double) a / b;

            System.out.println("Частное= " + div);
        } else
            System.out.println("Частное= Ошибка!!! Делить на ноль нельзя!!!");

    }
}
//Реализовать программу, выводящую на экран результаты:
//Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.
//***Сделал другим методом в отличии от прошлого ДЗ(homework/Task2)