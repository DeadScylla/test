package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
       int first, second, result;
        System.out.println("enter first num:");
        first = num.nextInt();
        System.out.println("enter second num:");
        second = num.nextInt();
        result = first * second;
        result /= 2;
        System.out.println("result is - "+ result);
    }
}
