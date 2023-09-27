package de.telran.homework1;

public class Task2 {
    public static void main(String[] args) {
        int number = 345;
        int hundreds = (number / 100);
        int tens = (number / 10 % 10 );
        int units = (number % 10);

        System.out.println("Hundreds:" + hundreds);
        System.out.println("Tens:" + tens);
        System.out.println("Units:" + units);
        System.out.print("Число 345 -> " +hundreds+"," +tens+","+units );


    }
}
//Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5
//В Task2test решил немного усложнить задачу, хотелось бы чтобы тоже проверили.
