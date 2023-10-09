package de.telran.Homework4;

import java.util.Scanner;

public class Task1Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number= scanner.next();
        System.out.print("В какой системе счисления ваше число: ");
        int scaleOfNotation= scanner.nextInt();
        System.out.print("В какую систему счисления преобразовать: ");
        int notation= scanner.nextInt();
        convertNumber(number,scaleOfNotation,notation);


    }
    static void  convertNumber(String a, int b, int c){
        long result1 = Long.parseLong(a,b);
        String str = Long.toString(result1,c);

        System.out.println("Перевод числа: "+a+" из "+b+"-ричной "+"в "+c+"-ричную= "+str);

    }
}
