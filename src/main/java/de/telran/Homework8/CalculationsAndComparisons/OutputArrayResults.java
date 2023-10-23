package de.telran.Homework8.CalculationsAndComparisons;

import java.util.Arrays;
import java.util.Random;

public class OutputArrayResults {

    public void printArrayWithInterval(int[] arr, int rangeFrom, int rangeUpTo) {
        Random random= new Random();
        for (int i = 0; i< arr.length; i++){
            arr[i]=random.nextInt(rangeUpTo-rangeFrom)+rangeFrom;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void printArrayWithZero(int[] arr){
        for (int i = 0; i< arr.length; i++){
            if (i%2!=0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
  }
    public boolean isArrayIncreases(int[] arr){
        boolean result = true;
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i]>=arr[i+1]) {
                result = false;
                break;
                }
            }
        return result;
    }

    }



