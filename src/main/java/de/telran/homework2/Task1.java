package de.telran.homework2;

public class Task1 {
    public static void main(String[] args) {
        String myStr = new String("I study Basic Java!");
        processString(myStr);
    }
        public static void processString(String myStr) {
        System.out.println("Пред-последний символ строки: " + myStr.charAt(myStr.length()-2));
        System.out.println("Содержит ли строка подстроку Java: " + myStr.contains("Java"));
        String searchStr = "Java";
        int startIndex = myStr.indexOf(searchStr);
            System.out.println(startIndex);
        int endIndex = startIndex+ searchStr.length();
            System.out.println(endIndex);
        String myStr1 = myStr.substring(startIndex, endIndex);
            System.out.println(myStr1);
        String myStr2 = myStr.replace('a', 'o');
        System.out.println(myStr2);
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());




    }

}
//№ 1
//Создайте строку через new - I study Basic Java!
//Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.

//*Можно было найти место "Java" в строке с помощью indexOf()
//Вместо указания константы 17 в коде лучше оттолкнуться от длины строки.
// Тогда предпоследний индекс в строке можно найти как myStr.charAt(myStr.length() - 2).
// Если исходная строка изменится, то такой подход всё равно позволит вернуть предпоследний символ корректно.


