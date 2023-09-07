package org.example.Solutions;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for(int i=0; i<array.length ;i++){
            for(int j=i; j>0; j--){
                if(array[j]<array[j-1]){
                    array[j]   += array[j-1];
                    array[j-1]  = array[j]-array[j-1];
                    array[j]    = array[j] - array[j-1];
                }
            }
        }
        return array;
    }
}
