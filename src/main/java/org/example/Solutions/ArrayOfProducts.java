package org.example.Solutions;
import java.util.*;
public class ArrayOfProducts {
    public int[] arrayOfProducts(int[] array) {
        int totalZero = 0;
        int totalProduct = 1;
        int [] productArray = new int[array.length];

        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                totalZero++;
                if(totalZero>1){
                    return productArray;
                }
                continue;
            }
            totalProduct = totalProduct*array[i];
        }
        for(int i=0; i<array.length; i++){
            if(array[i]==0){
                productArray = new int[array.length];
                productArray[i]=totalProduct;
                return productArray;
            }
            productArray[i]=totalProduct/array[i];
        }
        return productArray;
    }
}
