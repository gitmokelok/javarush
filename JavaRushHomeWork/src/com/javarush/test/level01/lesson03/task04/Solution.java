package com.javarush.test.level01.lesson03.task04;

/* Вывод на экран нескольких переменных
Объявите переменную name типа String, переменные age, height типа int.
Сразу же в строке объявления присвойте им любые разные значения.
Выведите на экран все переменные в любом порядке. Каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String name = "MyName";
        int age = 33;
        int height = 183;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
