package de.telran.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arg1;
        int arg2;
        System.out.println("Введите первую переменную: ");
        arg1 = scanner.nextInt();
        System.out.println("Введите вторую переменную: ");
        arg2 = scanner.nextInt();
        int sum = arg1 + arg2;
        int dif = arg1 - arg2;
        int mult = arg1 * arg2;
        int div = arg1 / arg2;
        System.out.println("Сумма= "+sum);
        System.out.println("Разность= "+dif);
        System.out.println("Произведение= "+mult);
        System.out.println("Частное= "+div);


    }
}
//№ 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль