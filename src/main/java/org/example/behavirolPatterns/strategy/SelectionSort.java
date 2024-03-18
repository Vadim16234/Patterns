package org.example.behavirolPatterns.strategy;

import java.util.Arrays;

class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    int temp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = temp;
                }
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
