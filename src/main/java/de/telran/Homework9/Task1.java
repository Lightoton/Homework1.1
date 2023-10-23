package de.telran.Homework9;



import de.telran.Homework9.Methods.HWMethods;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int rangeFrom= 1;
        int rangeUpTo= 10;
        int[] arr = new int[rangeUpTo-1];


        HWMethods.getSortBubbleWithConditions(HWMethods.getArrayWithInterval(arr, rangeFrom, rangeUpTo), rangeFrom, rangeUpTo);
        System.out.println(Arrays.toString(arr));
        System.out.println("Недостающий элемент цифра: "+HWMethods.getMissingNumber(arr));

    }









//  №1
//  Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//          input:
//  arr[] = {1,2,3,5}
//  out: 4
//
//  arr[] = {6,1,2,8,3,4,7,10,5}
//  out: 9

}
