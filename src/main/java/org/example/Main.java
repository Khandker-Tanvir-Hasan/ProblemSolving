package org.example;
import org.example.Solutions.*;

import java.util.*;

public class Main {

    public static void main(String[] args){
//        moveElementToEnd();
//        arrayOfProducts();
//        binarySearch();
//        documentGenaration();
//        deptFirstSearch();
//        runLengthEncoding();
//        validateSubsequence();
//        selectionSort();
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

    public static void documentGenaration(){
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        System.out.println(new DocumentGenaration().generateDocument(characters, document));
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

}