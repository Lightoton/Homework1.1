package de.telran.Homework5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.println(calculationNumber(num1,num2)+" ближе к 10");



    }
    static double calculationNumber (double a, double b){
        double result1 = Math.abs(a-10);
        double result2 = Math.abs(b-10);
        if (result1 < result2){
            return a;
        }else
            return b;

    }






}

//№1
//
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.