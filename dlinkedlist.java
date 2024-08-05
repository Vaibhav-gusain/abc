//doubly linked list

import java.util.Scanner;
public class dlinkedlist {
    dlinkedlist preaddr;
    int data;
    dlinkedlist nextaddr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dlinkedlist first=new dlinkedlist();
        System.out.println("enter the value");
        first.preaddr=null;
        first.data=sc.nextInt();
        first.nextaddr=null;
        dlinkedlist temp;
        temp=first;

        System.out.println("enter the number of nodes");
        int n=sc.nextInt();

        for(int i=1;i<n;i++)
        {
            dlinkedlist last=new dlinkedlist();
            System.out.println("enter the value");
            temp.nextaddr=last;
            last.preaddr=temp;
            last.data=sc.nextInt();
            last.nextaddr=null;
            temp=last;
        }

        //traverse from back
        System.out.println("traverse from back");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.preaddr;
        }

        //traverse from front
        System.out.println("traverse from front");
        temp=first;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.nextaddr;
        }
    }
}
