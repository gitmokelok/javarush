package com.javarush.test.level00.lesson07.task02;

/* Обмен
Раскоментируйте некоторые строчки, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2).
*/
public class Solution
{
    public static void main(String[] args)
    {
        int x = 2;
        int y = 12;

        //x = x * 3; //x = 6
        y = x + y; //y = 6+12=18
        x = y - x; //x = 18-6 = 12
        y = y - x; //y = 18-12 = 6

        System.out.println(x);
        System.out.println(y);
    }
}
