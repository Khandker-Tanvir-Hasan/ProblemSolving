package org.example.Solutions;
import java.util.*;
//--------- Solution 2----------
//public class MoveElementToEnd {
//    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
//        // Write your code here.
//        if(array.isEmpty()){
//            return array;
//        }
//        for(int i=0, j=array.size()-1; i!=j;){
//            if(array.get(j)==toMove){
//                j--;
//                continue;
//            }
//            if(array.get(i)==toMove){
//                array.set(i,array.get(j));
//                array.set(j, toMove);
//                i++;
//                continue;
//            }
//            i++;
//        }
//        return array;
//    }
//}

//-------------- Solution 1---------------
public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        for(int i=array.size()-1,j=array.size()-1; i>=0;i--){
            if(array.get(i) == toMove){
                int jValue = array.get(j);
                array.set( j , array.get(i));
                array.set(i,jValue);
                j--;
            }
        }
        return array;
    }
}
