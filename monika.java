//to check wheather the cycle is doubly linked list
import java.util.Scanner;
public class monika
{
    public static class node{
        int data;
        node next;
    }
    public static boolean cycleCheck()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  number of node to be entered");
        int n=sc.nextInt();
        node temp;
        node first=new node();
        temp=first;
        System.out.println("enter the value");
        first.data=sc.nextInt();
        first.next=null;
        for(int i=1;i<n;i++)
        {
            node last=new node();
            last.data=sc.nextInt();
            last.next=null;
            temp.next=last;
            temp=last;
        }
        temp.next=first;
        if(temp.next==first)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        System.out.println(cycleCheck());
    }
}