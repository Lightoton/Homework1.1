package de.telran.Homework4;

public class Task1 {
    public static void main(String[] args) {
        int number;
        int scaleOfNotation;
        int notation;
        number=333;
        scaleOfNotation= 16;
        notation = 10;
        String resultNotation = convertNumber(number,scaleOfNotation,notation);
        System.out.println("Перевод числа: "+number+" из "+scaleOfNotation+"-ричной "+"в "+notation+"-ричную= "+resultNotation);
        number = 819;
        scaleOfNotation = 10;
        notation = 16;
        String resultNotation2 = convertNumber(number,scaleOfNotation,notation);
        System.out.println("Перевод числа: "+number+" из "+scaleOfNotation+"-ричной "+"в "+notation+"-ричную= "+resultNotation2);
        number = 101101;
        scaleOfNotation= 2;
        notation = 10;
        String resultNotation3 = convertNumber(number,scaleOfNotation,notation);
        System.out.println("Перевод числа: "+number+" из "+scaleOfNotation+"-ричной "+"в "+notation+"-ричную= "+resultNotation3);
        number = 124;
        scaleOfNotation = 10;
        notation = 2;
        String resultNotation4 = convertNumber(number,scaleOfNotation,notation);
        System.out.println("Перевод числа: "+number+" из "+scaleOfNotation+"-ричной "+"в "+notation+"-ричную= "+resultNotation4);



    }
    static String convertNumber(int a, int b, int c){
        long result1 = Long.parseLong(String.valueOf(a),b);
        return Long.toString(result1,c);

    }


}
//В Task1Scanner сделал тоже самое, только с вводом пользователя.
//Переведите число 333 из 16-ричной в 10-ричную
//Переведите число 819 из 10-ричной в 16-ричную
//101101 в двоичной, переведите в 10-ричную
//124 в десятичной, переведите в 2-ичную