package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("input number: ");
        number = input.nextInt();

        //todo lucky ticket4

        int sumNumber1 = number / 1000;//921 - первые 3 числа
        int sumNumber2 = number % 1000;//309 - последние 3 числа

        System.out.println("number1 = " + sumNumber1);
        System.out.println("number2 = " + sumNumber2);

        int digit1 = sumNumber1 / 100; // 1 число
        int digit2 = (sumNumber1 % 100) / 10; // 2 число
        int digit3 = sumNumber1 % 10; // 3 число



        int sum1 = digit1 + digit2 + digit3;
        System.out.println("sum1: " + sum1);

        int digit4 = sumNumber2 / 100; // 1 число
        int digit5 = (sumNumber2 % 100) / 10; //2 число
        int digit6 = sumNumber2 % 10; // 3 число



        int sum2 = digit4 + digit5 + digit6;
        System.out.println("sum2: " + sum2);

        if (sum1 == sum2) {
            System.out.println("happy ticket");
        } else {
            System.out.println("unlucky ticket");
        }
    }
}


