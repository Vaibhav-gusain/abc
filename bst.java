import java.util.Scanner;

public class bst {
    public static class node
    {
        node left,right;
        int data;
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
    public static void main(String[] args) {
        node root;
        root=null;
        root=create();
    }
}
