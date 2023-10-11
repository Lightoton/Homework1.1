package de.telran.Homework6;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isEdekaOpen = random.nextBoolean();
        boolean isReweOpen = random.nextBoolean();
        boolean resultCanBuy = canBuy(isEdekaOpen,isReweOpen);
        if (resultCanBuy== true){
            System.out.println("Я могу купить еду!");
        }else System.out.println("Магазины закрыты!");
    }
    static boolean canBuy (boolean edeka, boolean rewe){
        if (edeka==true || rewe==true){
            return true;
        }else
            return false;


    }
}
//В Task1Upgrade написал код так чтобы я мог понять в каком магазине я могу купить еду, но пришлось возвращать не boolean.
//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.