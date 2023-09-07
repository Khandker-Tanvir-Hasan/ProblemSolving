package org.example.Solutions;
import java.util.*;

public class ProductSum {
    public static int productSum(List<Object> array) {
        int dept =1;
        return productSum(array, dept);
    }

    public static int productSum(List<Object> array, int dept){
        int sum = 0;
        for(int i=0; i<array.size(); i++){
            sum = sum + (array.get(i) instanceof List ? productSum((ArrayList<Object>)array.get(i), dept+1) : (int)array.get(i)) * dept;
        }
        return sum;
    }
}
