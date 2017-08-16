/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

// A Binary Search Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BST
{   
    int getCountOfNode(Node root, int low, int high) 
    {
        // Your code here
        if(root==null)
            return 0;
            
        if(root.data<low)
            return getCountOfNode(root.right, low, high);
        
        if(root.data>high)
            return getCountOfNode(root.left, low, high);
        
        
        return 1 + getCountOfNode(root.right, low, high) + getCountOfNode(root.left, low, high);
    }
}