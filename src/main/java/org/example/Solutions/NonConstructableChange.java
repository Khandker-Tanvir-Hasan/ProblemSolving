package org.example.Solutions;
import java.util.*;

public class NonConstructableChange {
    public int nonConstructibleChange(int[] coins) {
        if(coins.length<=0){
            return 1;
        }
        Arrays.sort(coins);
        int firstValue =coins[0];
        if(firstValue>1){
            return 1;
        }
        int currentMinChange = firstValue;
        for(int i=1; i<coins.length; i++){
            if(currentMinChange+1 < coins[i]){
                return currentMinChange+1;
            }
            currentMinChange = currentMinChange + coins[i];
        }
        return currentMinChange+1;
    }
}
