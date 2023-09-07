package org.example.Solutions;
import java.util.*;
public class NthFibonacci {
    public static int getNthFib(int n) {
        // Write your code here.
        if(n==1){
            return 0;
        }
        if(n==2 || n==3){
            return 1;
        }
        return getNthFib(n-1)+getNthFib(n-2);
    }

}