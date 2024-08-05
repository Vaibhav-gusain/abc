import java.util.Scanner;
public class binarytree
{
    public static class node
    {
        int data;
        node left,right;
    }
    public static void main(String[] args) {
        node root;
        root=null;
        root=create();
        preorder(root);
        inorder(root);
        postorder(root);
    }
    public static node create()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        node temp=new node();
        System.out.println("enter the value");
        x=sc.nextInt();
        if(x==-1)
        {
            return null;
        }
        temp.data=x;
        System.out.println("Enter the left child of"+x);
        temp.left=create();
        System.out.println("enter the right child of"+x);
        temp.right=create();
        return temp;
    }
    public static void preorder(node temp)
    {
        if(temp==null)
        {
            return;
        }
        System.out.println(temp.data+" ");
        preorder(temp.left);
        preorder(temp.right);
    }
    public static void inorder(node temp)
    {
        if(temp==null)
        {
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data+" ");
        inorder(temp.right);
    }
    public static void postorder(node temp)
    {
        if(temp==null)
        {
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data+" ");
    }
}