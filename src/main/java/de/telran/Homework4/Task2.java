package de.telran.Homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диаметр первой пиццы: ");
        int pizza1 = scanner.nextInt();
        System.out.print("Введите диаметр второй пиццы: ");
        int pizza2 = scanner.nextInt();
        int resultCalories = thereWillBeExtraCalories(pizza1,pizza2);
        System.out.println("Лишних каллорий будет: " +resultCalories);
    }
    static int thereWillBeExtraCalories (int a, int b){
        int caloriesPerSquareCm= 40;
        int caloriesInFirstPizza= (int) ((Math.PI * a*a/4))*caloriesPerSquareCm;
        int caloriesInSecondPizza= (int) ((Math.PI * b*b/4))*caloriesPerSquareCm;
        int thereWillBeExtraCalorie= Math.abs(caloriesInFirstPizza-caloriesInSecondPizza);
        return thereWillBeExtraCalorie;

    }
}
//Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.