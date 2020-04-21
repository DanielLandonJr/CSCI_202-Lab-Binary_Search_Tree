package app;

import java.util.ArrayList;

// package bsttest; // dcljr

import java.util.Scanner;

public class BSTTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        Integer key;

        System.out.println();

        System.out.println("Binary Search Tree\n");
        Integer[] num ={67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95};//, 81, 66, 40, 53, 84, 77,23,45,67,56,45,34,21,26,19,17,41, 22,20,24,31,14,11,11,3,18,23,4,5,17,25,
         // 67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95, 81, 66, 40, 53, 84, 77};

        for (int i = 0; i < num.length; i++) { System.out.print(num[i]+ " "); }

        System.out.println("\n");
        
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(num);// loads      
         

        // >>>>>>>>>> path <<<<<<<<<<

        lineSeperator(80, '*');

        System.out.println("\n>>>>>>>>>> PATH: START <<<<<<<<<<\n");

        System.out.print("Enter element to search: ");
        key = input.nextInt();
        // arraylist to handla returned value
        ArrayList<Integer> _retVal = new ArrayList<>(tree.path(key)); 
        
        if(_retVal.size() == 0) {
            System.out.println("\nSupplied Value Not Found: " + key + "\n");
        } // end if
        else {
            System.out.println("\nSupplied Value Found: " + key + "\n");

            if(_retVal.size() == 1) {

                // we are at the root
                System.out.println("We are at the root node, it has no ancestor nodes.");

            } // end if
            else {

                System.out.println("Here is the node list from root to supplied value: " + key + "\n");

                for(int _item: _retVal) { System.out.print(_item + " "); }

                System.out.println("\n");

            } // end else

        } // end else

        System.out.println(">>>>>>>>>> PATH: END <<<<<<<<<<\n");

        // >>>>>>>>>> path <<<<<<<<<<

        // >>>>>>>>>> getNumberOfLeaves <<<<<<<<<<

        // >>>>>>>>>> getNumberOfLeaves <<<<<<<<<<

        lineSeperator(80, '*');

        System.out.println("\n>>>>>>>>>> getNumberOfLeaves: START <<<<<<<<<<\n");

        System.out.println("Number of Leaves found: " + tree.getNumberOfLeaves());

        System.out.println("\n>>>>>>>>>> getNumberOfLeaves: END <<<<<<<<<<");





        //  tree.output();  //output tree:inorder, preorder, postorder, # of leaves
         
         
          //search
       
        // System.out.print("Enter element to search:\t");
        // key = input.nextInt();
        // System.out.println("tree.search(key) =\t\t" + tree.search(key));

      
        // System.out.print("Enter a number for rightsubtree:");
        // key = input.nextInt();
        // System.out.println("tree.rightSubTree(key=\t"+tree.rightSubTree(key));
        // System.out.println();

        
        
        // System.out.println("");
        // System.out.print("Enter number for leftsubtree:\t");
        // key = input.nextInt();
        // System.out.println("tree.leftSubTree(key)=\t"+ tree.leftSubTree(key));
        // System.out.println();
        
        //delete
        // System.out.print("\nEnter element to delete:\t");
        // key = input.nextInt();
        // tree.delete(key);
        // System.out.println("The deletion of number\t\t" + key + " is:       Go ahead and look, but it's not there  :)  ");
        // tree.output();

        //complete the code as suggested in Lab document.
        //insert
        // System.out.print("\nEnter an element to insert\t");
        // key = input.nextInt();
        // tree.insert(key);
        // System.out.println("");
        // System.out.println("The insertion of number " + key + " is:");
        // tree.output();
 
         
        // System.out.print("Enter number for path:\t\t");
        // key = input.nextInt();
        // System.out.println(tree.path(key));

        
       /* 
        System.out.print("Enter a number for inorderPredecessor:\t");
        key = input.nextInt();
        System.out.println("number of inorderPredecessor:" + tree.inorderPredecessor(key));
         */
         
        //  System.out.print("Enter a number for inorderPredecessor:\t");
        // key = input.nextInt();
        // System.out.println("number of inorderPredecessor:" + tree.inOrder2(key));
        
         input.close(); // dcljr
         
    }//main

    /**
     * 
     * <p><strong><em>Description: </em></strong>adds a line of characters for console display</p>
     * 
     * <p><strong><em>Method Name: </em></strong>lineSeperator</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>none</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.21.2020</p>
     *
     * @param N how many characters to add
     * @param ch character in line
     */
    public static void lineSeperator(int N, char ch) {
        
        if(N > 1) {
            System.out.print(ch);
            lineSeperator(N - 1, ch);
        } // end if
        else { System.out.println(""); } // end else

    } // end lineSeperator
    
}//class
