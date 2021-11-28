package com.company;

public class MergeSort {

    public void sort(int[] bigArray){
        int[] leftBranch = new int[bigArray.length / 2];
        int[] rightBranch = new int[bigArray.length - (bigArray.length / 2)];

        for (int i = 0; i < (bigArray.length / 2); i++) {
            leftBranch[i] = bigArray[i];
        }
        for (int i = (bigArray.length / 2); i < bigArray.length; i++) {
            rightBranch[i - (bigArray.length / 2)] = bigArray[i];
        }

        if(leftBranch.length > 1) {
            sort(leftBranch);
        }
        if(rightBranch.length > 1) {
            sort(rightBranch);
        }

        merge(bigArray, leftBranch, rightBranch);
    }

    public void merge(int[] bigArray, int[] leftBranch, int[] rightBranch){
        int left = 0;
        int right = 0;
        int big = 0;

        while(right < rightBranch.length && left < leftBranch.length){
            if(leftBranch[left] <= rightBranch[right]){
                bigArray[big] = leftBranch[left];
                left++;
            }
            else{
                bigArray[big] = rightBranch[right];
                right++;
            }
            big++;
        }

        while(left < leftBranch.length){
            bigArray[big] = leftBranch[left];
            left++;
            big++;
        }
        while(right < rightBranch.length){
            bigArray[big] = rightBranch[right];
            right++;
            big++;
        }
    }
}
