package org.example.Solutions;
import java.util.*;

public class FindClosestValueInBST  {
    public static int findClosestValueInBst(BST tree, int target) {
        int minDiff = Math.abs(tree.value - target);
        if(minDiff == 0){return tree.value;}
        int minDiffNodeValue = tree.value;
        tree = target>tree.value ? tree.right:tree.left;
        while(tree!=null){
            if(tree.value == target){
                return tree.value;
            }
            int currentNodeDiff = Math.abs(tree.value - target);
            if(currentNodeDiff<minDiff){
                minDiff = currentNodeDiff;
                minDiffNodeValue = tree.value;
            }
            tree = target>tree.value?tree.right:tree.left;
        }
        return minDiffNodeValue;
    }

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
