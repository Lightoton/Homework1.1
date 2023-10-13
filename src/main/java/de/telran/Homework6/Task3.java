package de.telran.Homework6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1= scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2= scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3= scanner.nextInt();
        int resultGetMax = getMax(num1,num2,num3);
        System.out.println(resultGetMax + " наибольшее число!");

    }
    static int getMax (int num1,int num2,int num3){
        if (num1>num2 &&  num1>num3){
            return num1;
        } else if (num2>num1 && num2>num3) {
            return num2;
        } else
            return num3;
    }
}
//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
//Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
//Напечатает максимум из трех чисел.