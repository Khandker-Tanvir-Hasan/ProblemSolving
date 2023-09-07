package org.example.Solutions;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        for(int left=0,right=str.length()-1 ; left<=right ; left++,right--){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
        }
        return true;
    }
}
