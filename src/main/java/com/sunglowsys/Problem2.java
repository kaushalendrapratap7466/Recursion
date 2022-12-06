package com.sunglowsys;

public class Problem2 {
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void PrintDigit(int number ){
        if (number == 0){
            return;
        }
        int lastDigit = number % 10;
        PrintDigit(number / 10);
        System.out.println(digit[lastDigit] + " ");
    }
    public static void main(String[] args) {
        PrintDigit(1234);
        System.out.println();
    }
}
