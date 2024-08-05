//insert a linked list in another linked list


import java.util.Scanner;
public class linkedlist3 {
    int data;
    linkedlist3 addr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist3 first=new linkedlist3();
        linkedlist3 second=new linkedlist3();
        System.out.println("enter the value for first linkedlist");
        first.data=sc.nextInt();
        first.addr=null;
        System.out.println("enter the value for second linkedlist");
        second.data=sc.nextInt();
        second.addr=null;
        linkedlist3 temp;
        linkedlist3 temp1;
        temp=first;
        temp1=second;
        System.out.println("enter the number of nodes");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            linkedlist3 last=new linkedlist3();
            System.out.println("enter the value of first node");
            last.data=sc.nextInt();
            last.addr=null;
            temp.addr=last;
            temp=last;
        }
        for(int i=1;i<n;i++)
        {
            linkedlist3 last1=new linkedlist3();
            System.out.println("enter the value of second node");
            last1.data=sc.nextInt();
            last1.addr=null;
            temp1.addr=last1;
            temp1=last1;
        }



        
        System.out.println("enter the value from where the second linkedlist is to be added");
        int nums=sc.nextInt();
        linkedlist3 z,y;
        z=first;
        y=first;
        y=y.addr;
        while(y!=null)
        {
            if(nums==z.data)
            {
                z.addr=second;
                temp1.addr=y;
            }
            z=z.addr;
            y=y.addr;
        }
        temp=first;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.addr;
        }
}
}



