/*8. Write Java programs that use recursive and non-recursive functions to traverse the given binary tree in (a) Preorder (b) In order and (c) Post order.*/ 

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
    java.util.Stack<Node> stk = new java.util.Stack<Node>();
    
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
    
    //recursive method - Binary Tree Travarsal
    public void inorder(Node p)
    {
        if (p!=null)
        {
            inorder(p.left);
            System.out.print(p.data + " ");
            inorder(p.right);
        }
    }
    
    public void preorder(Node p)
    {
        if (p!=null)
        {
            System.out.print(p.data + " ");
            preorder(p.left);
            preorder(p.right);
        }
    }
    
    public void postorder(Node p)
    {
        if (p!=null)
        {
            postorder(p.left);
            postorder(p.right);
            System.out.print(p.data + " ");
        }
    }
    
    //Non-Recursive methods - Binary tree travarsals
    public void preorderIterative(Node p)
    {
        if(p==null)
        {
            System.out.println("Tree is Empty");
            return;
        }
        stk.push(p);
        while(!stk.isEmpty())
        {
            p=stk.pop();
            if(p!=null)
            {
                System.out.print(p.data + " ");
                stk.push(p.right);
                stk.push(p.left);
            }
        }
    }
    
    public void inorderIterative(Node p)
    {
        if(p==null)
        {
            System.out.println("Tree is Empty");
            return;
        }
        
        while(!stk.isEmpty() || p!=null)
        {
            if(p!=null)
            {
                stk.push(p);
                p=p.left;
            }
            else
            {
                p=stk.pop();
                System.out.print(p.data + " ");
                p=p.right;
            }
        }
    }
    
    public void postorderIterative(Node p)
    {
        if(p==null)
        {
            System.out.println("Tree is Empty");
            return;
        }
        Node tmp = p;
        while (p!=null)
        {
            while(p.left!=null)
            {
                stk.push(p);
                p=p.left;
            }
            while(p!=null && (p.right==null || p.right==tmp))
            {
                System.out.print(p.data + " ");
                tmp = p;
                if(stk.isEmpty())
                    return;
                p=stk.pop();
            }
            stk.push(p);
            p=p.right;
        }
    }
}

public class BinaryTreeDemo
{
    public static void main(String [] args)
    {
        Object arr[] = {'E','C','G','A','D','F','H',
        null,'B',null,null,null,null,
        null,null,null,null,null,null};

        BinaryTree t = new BinaryTree(arr,arr.length);
        Node root = t.buildTree(0);
        
        System.out.print("\n Recursive Binary Tree Travarsals: ");
        System.out.print("\n inorder :");
        t.inorder(root);
        
        System.out.print("\n preorder :");
        t.preorder(root);
        
        System.out.print("\n postorder :");
        t.postorder(root);
        
        System.out.print("\n Non - Recursive Binary Tree Travarsals: ");
        System.out.print("\n inorder :");
        t.inorderIterative(root);
        
        System.out.print("\n preorder :");
        t.preorderIterative(root);
        
        System.out.print("\n postorder :");
        t.postorderIterative(root);
    }
}


/*  OUTPUT

 Recursive Binary Tree Travarsals: 
 inorder :A B C D E F G H 
 preorder :E C A B D G F H 
 postorder :B A D C F H G E 
 Non - Recursive Binary Tree Travarsals: 
 inorder :A B C D E F G H 
 preorder :E C A B D G F H 
 postorder :B A D C F H G E 
 
 */