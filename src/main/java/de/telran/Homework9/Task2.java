package de.telran.Homework9;

import de.telran.Homework9.Methods.HWMethods;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String car = "model, V-60, country, Germany, city, Berlin, year, null, active, true";
        String users ="{\"id\", 1, \"country\", null, \"city\", \"Helsinki\", \"year\", null}";
        String[] user = HWMethods.getStrArray(users);
        System.out.println(Arrays.toString(user));
        HWMethods.printBottomLine(user);
        String[] cars =HWMethods.getStrArray(car);
        System.out.println(Arrays.toString(cars));
        HWMethods.printBottomLine(cars);
    }






}


//№2
//Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
//1) Берем исходную строку с данными из cars
//{"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//Если значение второго параметра равно null с каждой пары,
//то параметр не должен попадать в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
//Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';