package org.example.Solutions;
import java.util.*;
public class EvaluateExpressionTree {
    public static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int evaluateExpressionTree(BinaryTree tree) {
        // Write your code here.
        return evaluate(tree);
    }

    public int evaluate(BinaryTree node){
        if(node.left==null && node.right==null){return node.value;}
        switch (node.value){
            case -1:return evaluate(node.left)+evaluate(node.right);
            case -2:return evaluate(node.left)-evaluate(node.right);
            case -3:return evaluate(node.left)/evaluate(node.right);
            case -4:return evaluate(node.left)*evaluate(node.right);
            default:return 0;
        }
    }
}
