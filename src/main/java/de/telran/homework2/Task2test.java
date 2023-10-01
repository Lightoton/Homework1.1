package de.telran.homework2;

import java.util.Scanner;

public class Task2test {
    public static void main(String[] args) {
        int arg1;
        int arg2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную: ");
        arg1 = scanner.nextInt();
        System.out.println("Введите вторую переменную: ");
        arg2 = scanner.nextInt();
        int sum = arg1 + arg2;
        int dif = arg1 - arg2;
        int mult = arg1 * arg2;
        int div = arg1 / arg2;
        System.out.println("Сумма= " + sum);
        System.out.println("Разность= " + dif);
        System.out.println("Произведение= " + mult);
        System.out.println("Частное= " + div);


        }


    }
