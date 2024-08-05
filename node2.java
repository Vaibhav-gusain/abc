//user defined linkedlist

import java.util.Scanner;
public class node2 {
    int data;
    node2 addr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node2 first=new node2();
        System.out.println("enter the value");
        first.data=sc.nextInt();
        first.addr=null;
        node2 temp;
        temp=first;
        int x=1;
        System.out.println("press 1:insert at last\n press 2:insert at Start\n press 3:insert at middle\n press 4:travese");
        int ch=sc.nextInt();
        while(x==1)
        {
        if(ch==1)
        {
                for(int i=1;i<=1;i++)
                {
                    node2 last=new node2();
                    System.out.println("enter the value");
                    last.data=sc.nextInt();
                    last.addr=null;
                    temp.addr=last;
                    temp=last;
                }
                System.out.println("press 1:to continue\n press any key to exit");
                x=sc.nextInt();
                System.out.println("press 1:insert at last\n press 2:insert at Start\n press 3:insert at middle\n press 4:traverse");
                ch=sc.nextInt();
        }
        if(ch==2)
        {
            for(int i=1;i<=1;i++)
            {
                node2 z=new node2();
                System.out.println("enter the value");
                z.data=sc.nextInt();
                z.addr=null;
                z.addr=first;
                first=z;
            }
            System.out.println("press 1:to continue\n press any key to exit");
            x=sc.nextInt();
            System.out.println("press 1:insert at last\n press 2:insert at Start\n press 3:insert at middle\n press 4:traverse");
            ch=sc.nextInt();
        }
        if(ch==3)
        {
            node2 t,z1;
            t=first;
            z1=first.addr;
            System.out.println("enter the number to be searched");
            int n=sc.nextInt();
            if(n==t.data)
            {
                node2 y;
                y=t.addr;
                y.addr=z1;
            }
            else
            {
                t.addr=z1;
            }
            System.out.println("press 1:to continue\n press any key to exit");
            x=sc.nextInt();
            System.out.println("press 1:insert at last\n press 2:insert at Start\n press 3:insert at middle\n press 4:traverse");
            ch=sc.nextInt();
        }
        if(ch==4)
        {
            temp=first;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.addr;
            }
        }
    }
}
}
