package de.telran.homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Напишите первое слово с чётным количеством символов: ");
        String myStr1 = scanner.next();
        int myLength1 = myStr1.length();
        if (myLength1%2 ==0  ){
            System.out.println("Вы написали: "+myStr1);
        } else {
            System.out.println("Вы написали слово с нечётным количеством букв!!! Ошибка!!!");
            return;
        }

        System.out.print("Напишите  второе слово с чётным количеством символов: ");
        String myStr2 = scanner.next();
        int myLength2 = myStr2.length();
        if (myLength2 %2 ==0){
            System.out.println("Вы написали: "+myStr2);
        } else {
            System.out.println("Вы написали слово с нечётным количеством букв!!! Ошибка!!!");
            return;
        }
        int myHalfStr1 = myLength1/2;
        int myHalfStr2 = myLength2/2;

        System.out.println("Ваше новое слово состоящее из половинок первого и второго: "+myStr1.substring(0,myHalfStr1)+myStr2.substring(myHalfStr2));

    }
}
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa
