/*10. Write a Java program that uses recursive functions. (a) To create a binary search tree. (b) To count the number of leaf nodes. (c) To copy the above binary search tree. */
class BSTNode
{
    int data;
    BSTNode left;
    BSTNode right;
    
    BSTNode(int d)
    {
        data=d;
    }
}

class BinarySearchTree
{
    public BSTNode insertTree(BSTNode p, int key) //create BST
    {
        if (p==null)
            p=new BSTNode (key);
        else if(key<p.data)
            p.left=insertTree(p.left,key);
        else
            p.right = insertTree(p.right,key);
        return p; // return root
    }
    
    public int leafNodes(BSTNode p)
    {
        int count=0;
        if (p!=null)
        {
            if ((p.left==null) && (p.right==null))
                count=1;
            else
                count=count + leafNodes(p.left) + leafNodes(p.right);
        }
        return count;
    }
}

public class BinarySerachTreeDemo1 
{
    public static void main(String[] args)
    {
        int arr[] = {45,25,15,10,20,30,65,55,50,60,75,80};
        BinarySearchTree bst = new BinarySearchTree();
        
        BSTNode root = null;
        //build tree by repeated insertions
        for(int i=0;i<arr.length;i++)
            root = bst.insertTree(root,arr[i]);
        
        BSTNode root2 = root; //copy BST
        
        System.out.print("\n Number of Leaf Nodes: " + bst.leafNodes(root));
        
    }
}


/*
    OUTPUT 

    
     Number of Leaf Nodes: 6
 */