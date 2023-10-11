package de.telran.Homework6;

import java.util.Random;

public class Task1Upgrade {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isEdekaOpen = random.nextBoolean();
        boolean isReweOpen = random.nextBoolean();
        int resultCanBuy = canBuy(isEdekaOpen,isReweOpen);
        if (resultCanBuy== 1){
            System.out.println("Я могу купить еду в Edeka!");
        }else
            if (resultCanBuy==2){
                System.out.println("Я могу купить еду в Rewe!");
            }else
                System.out.println("Магазины закрыты!");
    }
    static int canBuy (boolean edeka, boolean rewe){
        if (edeka==true){
            return 1;
        }else
            if (rewe==true){
                return 2;
            }else
                return 0;


    }
}

