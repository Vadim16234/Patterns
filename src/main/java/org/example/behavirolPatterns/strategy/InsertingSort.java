package org.example.behavirolPatterns.strategy;

import java.util.Arrays;

class InsertingSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка вставками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            while (index - 1 > 0 && arr[index] < arr[index - 1]) {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
