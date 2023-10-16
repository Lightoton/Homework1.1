package de.telran.Homework7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int temperature1 = random.nextInt(150);
        int temperature2 = random.nextInt(150);
        if (isTemperatureHigher(temperature1,temperature2)){
            System.out.println("Прибор работает дальше...");
        }else System.out.println("Текущая температура не соответствует рабочей температуре!");

    }
    public static boolean isTemperatureHigher(int grad1,int grad2){
        return grad1 > 100 && grad2 < 100;
    }
}
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.