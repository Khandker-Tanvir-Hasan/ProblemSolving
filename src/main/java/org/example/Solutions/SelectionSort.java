package org.example.Solutions;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        // Write your code here.
        for(int i=0; i<array.length; i++){
            int smallIndex = i;
            for(int j=i; j<array.length; j++){
                if(array[j]<array[smallIndex]){
                    smallIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallIndex];
            array[smallIndex] = temp;

        }
        return array;
    }
}
