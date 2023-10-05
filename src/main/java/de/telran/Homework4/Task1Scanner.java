package de.telran.Homework4;

import java.util.Scanner;

public class Task1Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number= scanner.nextInt();
        System.out.print("В какой системе счисления ваше число: ");
        int scaleOfNotation= scanner.nextInt();
        System.out.print("В какую систему счисления преобразовать: ");
        int notation= scanner.nextInt();
        String resultNotation = convertNumber(number,scaleOfNotation,notation);
        System.out.println("Перевод числа: "+number+" из "+scaleOfNotation+"-ричной "+"в "+notation+"-ричную= "+resultNotation);

    }
    static String convertNumber(int a, int b, int c){
        long result1 = Long.parseLong(String.valueOf(a),b);
        return Long.toString(result1,c);

    }
}
