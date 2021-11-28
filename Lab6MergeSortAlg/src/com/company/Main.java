package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Random rng = new Random();
        MergeSort ms = new MergeSort();
        int[] nums = new int[100000];

        for(int i = 0; i < nums.length; i++){
            nums[i] = rng.nextInt(1000);
        }

        System.out.println(Arrays.toString(nums));

        ms.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
