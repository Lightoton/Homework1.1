package de.telran.Homework8;

import de.telran.Homework8.CalculationsAndComparisons.OutputArrayResults;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        OutputArrayResults outputArrayResults = new OutputArrayResults();
        outputArrayResults.printArrayInterval(arr,1,50);
        outputArrayResults.printWithZero(arr);


    }
}
//№1.
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.