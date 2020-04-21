package app; // dcljr

// import java.io.*; // dcljr
import java.util.*;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E> {

  protected TreeNode<E> root;
  protected int size = 0;

  // >>>>>>>>>>>>>>>>>>> PROJECT CODE <<<<<<<<<<<<<<<<<<<
  
    /**
     * 
     * <p><strong><em>Description: </em></strong>none</p>
     * 
     * <p><strong><em>Method Name: </em></strong>path</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>Returns an ArrayList containing elements in the path from the root leading to the specified element, returns an empty ArrayList if no  such element exists.</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.21.2020</p>
     *
     * @param e element to look for
     * @return ArrayList with found data, empty ArrayList if nothing found
     */
    public ArrayList<E> path(E e){
        
        // variables
        java.util.ArrayList<E> list = new java.util.ArrayList<>();
        TreeNode<E> current = root; // Start from the root

        //implement the code here as in search method.

        // loop the list
        while (current != e) {

            // if we hit null e is not in the tree so reset list and get out
            if(current == null) {

                list.clear(); //clear the list

                break; // get out

            } // end if
            else {

                // echo to see the nodes that are searched
                // System.out.println(current.element.toString());

                // build our array of searched nodes
                list.add(current.element);
    
                if (e.compareTo(current.element) < 0) { current = current.left; } // go left
                else if (e.compareTo(current.element) > 0) { current = current.right; } // go right
                else { break; } // found it so get out

            } // end else
        }

        // echo to test list size...any value other than 0 and we found e
        // System.out.println("List size: " + list.size());

        return list; // Return an array of elements

    } // end path

    /**
     * 
     * <p><strong><em>Description: </em></strong>none</p>
     * 
     * <p><strong><em>Method Name: </em></strong>getNumberOfLeaves</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>Returns the number of leaf nodes in this tree, returns 0 if tree is empty</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.21.2020</p>
     *
     * @return number of leaf nodes or 0 if empty
     */
    public int getNumberOfLeaves(){ 
        
        // if we get here nothing was found
        return 0; 

    } // end getNumberOfLeaves

    /**
     * 
     * <p><strong><em>Description: </em></strong>EXTRA CREDIT</p>
     * 
     * <p><strong><em>Method Name: </em></strong>inorderPredecessor</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>Returns the inorder predecessor of the specified element, returns null if tree is empty or element 'e' is not in the tree.</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.21.2020</p>
     *
     * @param e element to look for
     * @return null if tree is empty or "e" is not in the tree, inorder predecessor otherwise
     */
    public E inorderPredecessor(E e){ 
    
        // if we get here assumpiton is nothing was found or invalid search
        return null; 
    
    } // end inorderPredecessor


  // >>>>>>>>>>>>>>>>>>> PROJECT CODE <<<<<<<<<<<<<<<<<<<













  /** Create a default binary tree */
  public BinarySearchTree() { }

  /** Create a binary tree from an array of objects */
  public BinarySearchTree(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      insert(objects[i]);
  }

  /** Returns true if the element is in the tree */
  public boolean search(E e) {
    TreeNode<E> current = root; // Start from the root
    while (current != null) {
      if (e.compareTo(current.element) < 0) { current = current.left; }
      else if (e.compareTo(current.element) > 0) { current = current.right; }
      else // element matches current.element
        return true; // Element is found
    }
    return false;
  }

  /** Insert element o into the binary tree
   * Return true if the element is inserted successfully. 
   *  Uses an iterative algorithm
   */
  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e); // Create a new root
    else {
      // Locate the parent node
      TreeNode<E> parent = null;
      TreeNode<E> current = root;
      while (current != null)
        if (e.compareTo(current.element) < 0) {
          parent = current;
          current = current.left;
        }
        else if (e.compareTo(current.element) > 0) {
          parent = current;
          current = current.right;
        }
        else
          return false; // Duplicate node not inserted
          
      // Create the new node and attach it to the parent node
      if (e.compareTo(parent.element) < 0)
        parent.left = createNewNode(e);
      else
        parent.right = createNewNode(e);
    }
    size++;
    return true; // Element inserted
  }

  protected TreeNode<E> createNewNode(E e) { return new TreeNode<E>(e); }

  /** Inorder traversal from the root*/
  public void inorder() { inorder(root); }

  /** Inorder traversal from a subtree */
  protected void inorder(TreeNode<E> root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.element + " ");
    inorder(root.right);
  }

   
  /** Postorder traversal from the root */
  public void postorder() { postorder(root); }

  /** Postorder traversal from a subtree */
  protected void postorder(TreeNode<E> root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.element + " ");
  }

  /** Preorder traversal from the root */
  public void preorder() { preorder(root); }

  /** Preorder traversal from a subtree */
  protected void preorder(TreeNode<E> root) {
    if (root == null) return;
    System.out.print(root.element + " ");
    preorder(root.left);
    preorder(root.right);
  }

  /** Inner class tree node */
  public static class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e) { element = e; }
  }

  /** Get the number of nodes in the tree */
  public int getSize() { return size; }

  /** Returns the root of the tree */
//   public TreeNode getRoot() { return root; } // dcljr
  public TreeNode<E> getRoot() { return root; }
   


  // dcljr
  // commented out so code can be added at the top of the file. this is stubbed here but we are requred to modify
  // dcljr
    /** Returns an ArrayList containing elements in the path from the root leading to the specified element, returns an empty ArrayList if no  such element exists. */
//     public ArrayList<E> path(E e){
//         java.util.ArrayList<E> list = new java.util.ArrayList<>();
//         TreeNode<E> current = root; // Start from the root
//         //implement the code here as in search method.
//         return list; // Return an array of elements
//   }
  

// dcljr
// commented out, project requirement added to top of file.

    // /* Returns the number of leaf nodes in this tree, returns 0 if tree is empty*/
    // public int  getNumberOfLeaves(){
    //     //left for you to implement in Lab 7

    //     return 0; // dcljr
    // }
    
    /* Returns an ArrayList containing all elements in preorder of the specified element’s left sub-tree, returns an empty ArrayList if no  such element exists. */
    public ArrayList<E> leftSubTree(E e){
        return null; // dcljr
    //left for you to implement in Lab 7
    }
    
    /* Returns an ArrayList containing all elements in preorder of the specified element’s right sub-tree, returns an empty ArrayList if no  such element exists. */
    public ArrayList<E> rightSubTree(E e){
        return null; // dcljr
    //left for you to implement in Lab 7
    }
    
    //dcljr
    // commented out. added to top of file for project requirement

    /* Returns the inorder predecessor of the specified element, returns null if tree is empty or element 'e' is not in the tree. */
    // public E inorderPredecessor(E e){
    //     return e; // dcljr
    // //left for you to implement in Lab 7
    // }
    
    
  /** Delete an element from the binary tree.
   * Return true if the element is deleted successfully
   * Return false if the element is not in the tree */
  public boolean delete(E e) {
    // Locate the node to be deleted and also locate its parent node
    TreeNode<E> parent = null;
    TreeNode<E> current = root;
    while (current != null) {
      if (e.compareTo(current.element) < 0) {
        parent = current;
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        parent = current;
        current = current.right;
      }
      else
        break; // Element is in the tree pointed by current
    }
    if (current == null)
      return false; // Element is not in the tree
    // Case 1: current has no left children
    if (current.left == null) {
      // Connect the parent with the right child of the current node
      if (parent == null) {
         root = current.right;
      }
      else {
        if (e.compareTo(parent.element) < 0)
          parent.left = current.right;
        else
          parent.right = current.right;
      }
    }
    else {
      // Case 2 & 3: The current node has a left child
      // Locate the rightmost node in the left subtree of
      // the current node and also its parent
      TreeNode<E> parentOfRightMost = current;
      TreeNode<E> rightMost = current.left;

      while (rightMost.right != null) {
        parentOfRightMost = rightMost;
        rightMost = rightMost.right; // Keep going to the right
      }
      // Replace the element in current by the element in rightMost
      current.element = rightMost.element;
      
      // Eliminate rightmost node
      if (parentOfRightMost.right == rightMost)
        parentOfRightMost.right = rightMost.left;
      else
        // Special case: parentOfRightMost == current
        parentOfRightMost.left = rightMost.left;
    }
    size--;
    return true; // Element inserted
  }
  
  /** Obtain an iterator. Use inorder. */
//   public java.util.Iterator iterator() { return inorderIterator(); } // dcljr
  public java.util.Iterator<E> iterator() { return inorderIterator(); }

  /** Obtain an inorder iterator */
//   public java.util.Iterator inorderIterator() { return new InorderIterator(); } // dcl jr
  public java.util.Iterator<E> inorderIterator() { return new InorderIterator(); }

  // Inner class InorderIterator
//   class InorderIterator implements java.util.Iterator { // dcljr
  class InorderIterator implements java.util.Iterator<E> {
    // Store the elements in a list
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
    private int current = 0; // Point to the current element in list

     // Traverse binary tree and store elements in list
    public InorderIterator() { inorder(); }

    /** Inorder traversal from the root*/
    private void inorder() { inorder(root); }

    /** Inorder traversal from a subtree */
    private void inorder(TreeNode<E> root) {
      if (root == null)return;
      inorder(root.left);
      list.add(root.element);
      inorder(root.right);
    }

    /** Next element for traversing? */
    public boolean hasNext() {
      if (current < list.size())
        return true;
      return false;
    }

    /** Get the current element and move cursor to the next */
    // public Object next() { return list.get(current++); } // dcljr
    public E next() { return list.get(current++); }

    /** Remove the current element and refresh the list */
    public void remove() {
      delete(list.get(current)); // Delete the current element
      list.clear(); // Clear the list
      inorder(); // Rebuild the list
    }
  }

  /** Remove all elements from the tree */
  public void clear() {
    root = null;
    size = 0;
  }

    // dcljr
    public String inOrder2(Integer key) { return null; }

	public void output() { } // dcljr
}
