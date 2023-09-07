package org.example.Solutions;
import java.util.*;
public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int start = 0;
        int end = array.length-1;
        int mid = (end+start)/2;
        while(start!=end){

            if(array[mid]==target){
                return mid;
            }
            if(array[mid]>target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
}