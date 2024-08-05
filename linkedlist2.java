//deletion from front

// import java.util.Scanner;
// public class linkedlist2 {
//         int data;
//         linkedlist2 addr;
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             linkedlist2 first=new linkedlist2();
//             System.out.println("enter the value");
//             first.data=sc.nextInt();
//             first.addr=null;
//             linkedlist2 temp=first;
//             System.out.println("enter the number of nodes");
//             int n=sc.nextInt();
//             for(int i=1;i<n;i++)
//             {
//                 linkedlist2 last=new linkedlist2();
//                 System.out.println("enter the value");
//                 last.data=sc.nextInt();
//                 last.addr=null;
//                 temp.addr=last;
//                 temp=last;
//             }
//             System.out.println("first element deleted is :"+first.data);
//             first=first.addr;
//             temp=first;
//             while(temp!=null)
//             {
//                 System.out.println(temp.data);
//                 temp=temp.addr;
//             }
//         }
//     }


//deletion from last


// import java.util.Scanner;
// public class linkedlist2
// {
//     int data;
//     linkedlist2 addr;
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         linkedlist2 first=new linkedlist2();
//         System.out.println("enter the value");
//         first.data=sc.nextInt();
//         first.addr=null;
//         linkedlist2 temp=first;
//         System.out.println("enter the number of nodes");
//         int n=sc.nextInt();
//         for(int i=1;i<n;i++)
//         {
//             linkedlist2 last=new linkedlist2();
//             System.out.println("enter the value");
//             last.data=sc.nextInt();
//             last.addr=null;
//             temp.addr=last;
//             temp=last;
//         }
//         System.out.println("last element is :"+temp.data);
//         linkedlist2 z,y;
//         z=first;
//         y=first;
//         y=y.addr;
//         while(y!=null)
//         {
//             if(y.addr==null)
//             {
//                 z.addr=null;
//             }
//             z=z.addr;
//             y=y.addr;
//         }
//         temp=first;
//         while(temp!=null)
//         {
//             System.out.println(temp.data);
//             temp=temp.addr;
//         }
//     }
// }


//deletion from middle

import java.util.Scanner;
public class linkedlist2
{
    int data;
    linkedlist2 addr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist2 first=new linkedlist2();
        System.out.println("enter the value");
        first.data=sc.nextInt();
        first.addr=null;
        linkedlist2 temp;
        temp=first;
        System.out.println("enter the number of nodes");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            linkedlist2 last=new linkedlist2();
            System.out.println("enter the value");
            last.data=sc.nextInt();
            last.addr=null;
            temp.addr=last;
            temp=last;
        }
        System.out.println("enter the element to be deleted");
        int nums=sc.nextInt();
        linkedlist2 z,y;
        z=first;
        y=first;
        y=y.addr;
        while(y!=null)
        {
            if(nums==y.data)
            {
                z.addr=y.addr;
            }
            z=z.addr;
            y=y.addr;
        }
        temp=first;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.addr;
        }
    }
}