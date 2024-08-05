//insertion from middle

import java.util.Scanner;
public class linkedlist {
    int data;
    linkedlist addr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist first=new linkedlist();
        System.out.println("enter the value");
        first.data=sc.nextInt();
        first.addr=null;
        linkedlist temp;
        temp=first;
        System.out.println("enter the number of nodes");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the value");
            linkedlist last=new linkedlist();
            last.data=sc.nextInt();
            last.addr=null;
            temp.addr=last;
            temp=last;
        }

        System.out.println("enter the number to be searched");
        int num=sc.nextInt();
        
        linkedlist z,t;
        t=first;
        z=first;
        z=z.addr;
        while(z!=null)
        {
        if(num==t.data)
            {
                linkedlist x=new linkedlist();
                System.out.println("enter the value in middle");
                x.data=sc.nextInt();
                x.addr=null;
                t.addr=x;
                x.addr=z;
            }
                z=z.addr;
                t=t.addr;
        }
        temp=first;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.addr;
        }
    }
}
