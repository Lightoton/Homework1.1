package de.telran.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый аргумент: ");
        int arg1 = scanner.nextInt();
        System.out.print("Введите второй аргумент: ");
        int arg2 = scanner.nextInt();
        int sumReturn = sum(arg1, arg2);
        System.out.println("Cумма: "+ sumReturn);
        int difReturn = dif(arg1, arg2);
        System.out.println("Разность: "+ difReturn);
        int multReturn = mult(arg1, arg2);
        System.out.println("Произведение: "+ multReturn);


        int divResult = div(arg1,arg2);
        if (divResult != 0) {
            System.out.println("Частное: " + divResult);
        }else System.out.println("Частное: ошибка! Делить на ноль нельзя!");
    }

     static int sum(int a, int b){
        return a+b;
    }
     static int dif(int a, int b){
        return a-b;
    }
     static int mult(int a, int b){
        return a*b;
    }
     static int div(int a, int b) {
        if (b!=0) {
            return a / b;
        } else
            return 0;
     }


}
//Я так понял так нужно прописать через методы. И написал простым способом в Task2test.
//№ 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль
//В Task2test сделал без создания метода
