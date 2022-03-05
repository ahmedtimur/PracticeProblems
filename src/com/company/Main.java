package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5,6,8,9,10};

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.println(serchInsert(numbers, target));

    }
    public static int serchInsert(int[] numbers, int target) {
        int temp = 0;
        int index = Arrays.binarySearch(numbers, target);
        if(index < 0) {
            temp = index;
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < target) {
                temp = i+1;
            }
        }
        return temp;
    }
}
