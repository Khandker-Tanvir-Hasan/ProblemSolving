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

    }



}