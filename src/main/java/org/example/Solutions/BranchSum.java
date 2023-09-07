package org.example.Solutions;
import java.util.*;
public class BranchSum {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.

        return sumOfBranch(root, 0, new ArrayList<Integer>());
    }
    public static ArrayList<Integer> sumOfBranch(BinaryTree node, Integer sum, ArrayList<Integer> sums){
        if(node.left==null && node.right==null){
            sums.add(sum+node.value);
        }
        sum=sum+node.value;
        if(node.left!=null){
            sumOfBranch(node.left,sum,sums);
        }
        if(node.right!=null){
            sumOfBranch(node.right,sum,sums);
        }
        return sums;
    }
}

