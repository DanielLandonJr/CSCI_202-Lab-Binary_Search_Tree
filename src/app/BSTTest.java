
package bsttest;

import java.util.Scanner;

public class BSTTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Integer key;
        System.out.println("Binary Search Tree ");
        Integer[] num ={67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95};//, 81, 66, 40, 53, 84, 77,23,45,67,56,45,34,21,26,19,17,41, 22,20,24,31,14,11,11,3,18,23,4,5,17,25,
         // 67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95, 81, 66, 40, 53, 84, 77};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");   
        }
        System.out.println("");
                
        
        
         BinarySearchTree<Integer> tree = new BinarySearchTree<>(num);// loads       

         tree.output();  //output tree:inorder, preorder, postorder, # of leaves
         
         
          //search
       
        System.out.print("Enter element to search:\t");
        key = input.nextInt();
        System.out.println("tree.search(key) =\t\t" + tree.search(key));

      
        System.out.print("Enter a number for rightsubtree:");
        key = input.nextInt();
        System.out.println("tree.rightSubTree(key=\t"+tree.rightSubTree(key));
        System.out.println();

        
        
        System.out.println("");
        System.out.print("Enter number for leftsubtree:\t");
        key = input.nextInt();
        System.out.println("tree.leftSubTree(key)=\t"+ tree.leftSubTree(key));
        System.out.println();
        
        //delete
        System.out.print("\nEnter element to delete:\t");
        key = input.nextInt();
        tree.delete(key);
        System.out.println("The deletion of number\t\t" + key + " is:       Go ahead and look, but it's not there  :)  ");
        tree.output();

        //complete the code as suggested in Lab document.
        //insert
        System.out.print("\nEnter an element to insert\t");
        key = input.nextInt();
        tree.insert(key);
        System.out.println("");
        System.out.println("The insertion of number " + key + " is:");
        tree.output();
 
         
        System.out.print("Enter number for path:\t\t");
        key = input.nextInt();
        System.out.println(tree.path(key));

        
       /* 
        System.out.print("Enter a number for inorderPredecessor:\t");
        key = input.nextInt();
        System.out.println("number of inorderPredecessor:" + tree.inorderPredecessor(key));
         */
         
         System.out.print("Enter a number for inorderPredecessor:\t");
        key = input.nextInt();
        System.out.println("number of inorderPredecessor:" + tree.inOrder2(key));
        
         
         
    }//main
    
}//class
