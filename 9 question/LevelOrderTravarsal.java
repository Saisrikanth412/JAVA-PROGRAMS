/*9.Write a Java program that displays node values in a level order traversal (Traverse the tree one level at a time, starting at the root node) for a binary tree. */
class Node
{
    Object data;
    Node left;
    Node right;
    Node(Object d)
    {
        data =d;
    }
}
class BinaryTree
{
    Object tree[];
    int maxSize;
    java.util.LinkedList<Node> que = new java.util.LinkedList<Node>();
    
    BinaryTree(Object a[], int n)
    {
        maxSize = n;
        tree = new Object[maxSize];
        for(int i=0;i<maxSize;i++)
            tree[i]=a[i];
    }
    
    public Node buildTree(int index)
    {
        Node p = null;
        if(tree[index]!=null)
        {
            p=new Node(tree[index]);
            p.left=buildTree(2*index+1);
            p.right = buildTree(2*index+2);
        }
        return p;
    }
    
    public void levelorder(Node p)
    {
        que.addLast(p);
        while(!que.isEmpty())
        {
            p=que.removeFirst();
            System.out.print(p.data + " ");
            if(p.left!=null)
                que.addLast(p.left);
            if(p.right!=null)
                que.addLast(p.right);
        }
    }
}
public class LevelOrderTravarsal 
{
    public static void main(String []args)
    {
        Object arr[] = {'E','C','G','A','D','F','H',
            null,'B',null,null,null,null,
            null,null,null,null,null,null};
        
        BinaryTree t = new BinaryTree(arr,arr.length);
        Node root = t.buildTree(0);
        
        System.out.print("\n Level Order Tree Travarsal : ");
        t.levelorder(root);
    }
}


/*


Level Order Tree Travarsal : E C G A D F H B 


 */