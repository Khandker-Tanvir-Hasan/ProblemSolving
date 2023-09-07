package org.example;
import org.example.Solutions.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
//        moveElementToEnd();
//        arrayOfProducts();
//        binarySearch();
//        generateDocument();
//        deptFirstSearch();
//        runLengthEncoding();
//        validateSubsequence();
//        selectionSort();
//        twoNumberSum();
//        sortedSquaredArray();
//        nonConstructableChange();
//        branchSum();
//        nodeDepths();
//        evaluateExpressionTree();
//        removeDuplicateFromLinkedList();
//        middleNode();
//        nthFibonacci();
//        productSum();
//        bubbleSort();
//        insertionSort();
//        palindromeCheck();
//        caesarCypherEncryptor();
//        commonCharacter();
//        firstNonRepeatingCharacter();
//        breathFirstSearch();
    }


    public static void moveElementToEnd() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        MoveElementToEnd myMoveElementToEnd = new MoveElementToEnd();
        System.out.print(myMoveElementToEnd.moveElementToEnd(array, toMove));
    }

    public static void arrayOfProducts(){
        var input = new int[] {5, 1, 4, 2};
        System.out.println(new ArrayOfProducts().arrayOfProducts(input));
    }

    public static void binarySearch(){
        var input = new int [] {1, 5, 23, 111};
        var target = 35;
        System.out.println("the result is:" + new BinarySearch().binarySearch(input, target));
    }

    public static void generateDocument(){
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        System.out.println(new GenerateDocument().generateDocument(characters, document));
    }

    public static void deptFirstSearch(){
        DeptFirstSearch dfs = new DeptFirstSearch();
        DeptFirstSearch.Node graph = new DeptFirstSearch.Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J").addChild(graph);
        graph.children.get(2).children.get(0).addChild("K");
        ArrayList<String> result = (ArrayList<String>) graph.depthFirstSearch(new ArrayList<String>());
        for(int i=0; i< result.size(); i++){
            System.out.print(result.get(i)+" ");
        }
    }

    public static void runLengthEncoding(){
        var input = "........______=========AAAA   AAABBBB   BBB";
        RunLengthEncoding r = new RunLengthEncoding();
        System.out.println(r.runLengthEncoding(input));
    }

    public static void validateSubsequence(){
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(ValidateSubSequence.isValidSubsequence(array, sequence));
    }

    public static void selectionSort(){
        int[] input = {1,2};
        System.out.println(SelectionSort.selectionSort(input));
    }

    public static void twoNumberSum(){
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        TwoNumberSum.twoNumberSum(array, target);
    }

    public static void sortedSquaredArray(){
        var input = new int[] {1, 2, 3, 5, 6, 8, 9};
        SortedSquaredArray sortedSquaredArray = new SortedSquaredArray();
        sortedSquaredArray.sortedSquaredArray(input);
    }

    public static void tournamentWinner(){
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
        new TournamentWinner().tournamentWinner(competitions, results);
    }

    public static void nonConstructableChange(){
        int[] input = new int[] {5, 7, 1, 1, 2, 3, 22};
        int expected = 20;
        var actual = new NonConstructableChange().nonConstructibleChange(input);
    }

    public static void findClosestValueInBst(){
        var root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(13);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);
        var actual = FindClosestValueInBST.findClosestValueInBst(root, 12);
    }

    public static void transposeMatrix(){
        int[][] input = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] actual = new TransposeMatrix().transposeMatrix(input);
    }

    public static void branchSum(){
        BranchSum.BinaryTree tree = new BranchSum.BinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(15, 16, 18, 10, 11));
        BranchSum.branchSums(tree).equals(expected);
    }

    public static void nodeDepths(){
        NodeDepths.BinaryTree root = new NodeDepths.BinaryTree(1);
        root.left = new NodeDepths.BinaryTree(2);
        root.left.left = new NodeDepths.BinaryTree(4);
        root.left.left.left = new NodeDepths.BinaryTree(8);
        root.left.left.right = new NodeDepths.BinaryTree(9);
        root.left.right = new NodeDepths.BinaryTree(5);
        root.right = new NodeDepths.BinaryTree(3);
        root.right.left = new NodeDepths.BinaryTree(6);
        root.right.right = new NodeDepths.BinaryTree(7);
        int recursive = NodeDepths.nodeDepthsRecursive(root);
        int nonRecursive = NodeDepths.nodeDepthsNonRecursive(root);
    }

    public static void evaluateExpressionTree(){
        EvaluateExpressionTree.BinaryTree tree = new EvaluateExpressionTree.BinaryTree(-1);
        tree.left = new EvaluateExpressionTree.BinaryTree(2);
        tree.right = new EvaluateExpressionTree.BinaryTree(-2);
        tree.right.left = new EvaluateExpressionTree.BinaryTree(5);
        tree.right.right = new EvaluateExpressionTree.BinaryTree(1);
        var actual = new EvaluateExpressionTree().evaluateExpressionTree(tree);
    }

    public static void removeDuplicateFromLinkedList(){
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        RemoveDuplicatesFromLinkedList.LinkedList.addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        RemoveDuplicatesFromLinkedList.LinkedList output = new RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(input);

    }

    public static void middleNode(){
        MiddleNode.LinkedList linkedList = new MiddleNode.LinkedList(0);
        linkedList.next = new MiddleNode.LinkedList(1);
        MiddleNode.LinkedList expected = new MiddleNode.LinkedList(2);
        linkedList.next.next = expected;
        expected.next = new MiddleNode.LinkedList(3);
        var actual = new MiddleNode().middleNode(linkedList);
        System.out.println(actual.value);
    }

    public static void nthFibonacci(){

        NthFibonacci.getNthFib(6);

    }

    public static void productSum(){
        List<Object> test = new ArrayList<Object>(Arrays.asList(
                5,
                2,
                new ArrayList<Object>(Arrays.asList(
                        7,
                        -1
                    )
                ),
                3,
                new ArrayList<Object>(
                        Arrays.asList(
                                6,
                                new ArrayList<Object>(Arrays.asList(
                                        -13,
                                        8)
                                ),
                                4)
                )
        ));
        ProductSum.productSum(test);
    }

    public static void bubbleSort(){
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        BubbleSort.bubbleSort(input);
    }

    public static void insertionSort(){
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        InsertionSort.insertionSort(input);
    }

    public static void palindromeCheck(){

        PalindromeCheck.isPalindrome("abcdcba");

    }

    public static void caesarCypherEncryptor(){

        CaesarCypherEncryptor.caesarCypherEncryptor("xyz", 2);

    }

    public static void commonCharacter(){
        String[] input = new String[] {"abc", "bcd", "cbad"};
        new CommonCharacters().commonCharacters(input);
    }

    public static void firstNonRepeatingCharacter(){
        String input = "abcdcaf";
        new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
    }

    public static void breathFirstSearch(){
        BreathFirstSearch.Node graph = new BreathFirstSearch.Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).children.get(0).addChild("K");
        String[] expected = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        List<String> inputArray = new ArrayList<String>();
        graph.breadthFirstSearch(inputArray);
    }

}