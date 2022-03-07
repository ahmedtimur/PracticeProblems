package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{10,20,30,40,50,60,80,90,100};

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.println(serchInsert(numbers, target));

    }
    public static int serchInsert(int[] numbers, int target) {
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < target) {
                temp = i+1;
            }
        }
        return temp;
    }
}
