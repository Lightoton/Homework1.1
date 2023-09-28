package de.telran.homework2;

public class Task1 {
    public static void main(String[] args) {
        String myStr = new String("I study Basic Java!");

        System.out.println("Пред-последний символ строки: "+myStr.charAt(18));
        System.out.println("Содержит ли строка подстроку Java: "+myStr.contains("Java"));
        String myStr1 = myStr.substring(14,18);
        System.out.println(myStr1);
        String jovo = myStr1.replace('a', 'o');
        System.out.println(jovo);
        System.out.println(jovo.toUpperCase());
        System.out.println(jovo.toLowerCase());

        //№ 1
        //Создайте строку через new - I study Basic Java!
        //Распечатать пред-последний символ строки. Используем метод String.charAt().
        //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        //Вырезать строку Java c помощью метода String.substring().
        //Заменить все символы “а” на “о”.
        //Преобразуйте строку к верхнему регистру.
        //Преобразуйте строку к нижнему регистру.



    }


}
