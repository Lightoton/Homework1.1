package de.telran.Homework8;

import de.telran.Homework8.CalculationsAndComparisons.OutputArrayResults;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        OutputArrayResults outputArrayResults = new OutputArrayResults();
        outputArrayResults.printArrayInterval(arr,10,99);
        if (outputArrayResults.getArrayIncreases(arr)){
            System.out.println("Массив является строго возрастающей последовательностью.");
        }else
            System.out.println("Массив не является строго возрастающей последовательностью.");



    }


}

//№2.
//
//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.