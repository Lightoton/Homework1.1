package de.telran.homework2;

import java.util.Scanner;

public class Task1test {
    public static void main(String[] args) {
        String myStr = new String("I study Basic Java!");
        processString(myStr);
    }
    public static void processString(String myStr) {
        System.out.println("Пред-последний символ строки: " + myStr.charAt(myStr.length()-2));
        System.out.println("Содержит ли строка подстроку Java: " + myStr.contains("Java"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово или символ который нужно вырезать из строки: ");
        String searchStr = scanner.next();
        int startIndex = myStr.indexOf(searchStr);
        int endIndex = startIndex+ searchStr.length();
        if (startIndex !=-1) {
            String myStr1 = myStr.substring(startIndex, endIndex);
            System.out.println(myStr1);
        } else {
            System.out.println("Слово или символ не найдены!");

        }
        String myStr2 = myStr.replace('a', 'o');
        System.out.println(myStr2);
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());
    }
}
