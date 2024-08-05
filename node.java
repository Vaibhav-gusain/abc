// // //linkedlist

// // public class node {
// //     int data;
// //     node addr;
// //     public static void main(String[] args) {
// //         node first=new node();
// //         node second=new node();
// //         node third=new node();
// //         first.data=10;
// //         first.addr=null;

// //         second.data=20;
// //         second.addr=null;

// //         third.data=30;
// //         third.addr=null;

// //         first.addr=second;
// //         second.addr=third;
        
// //         node temp;
// //         temp=first;
// //         while(temp!=null)
// //         {
// //             System.out.println(temp.data);
// //             temp=temp.addr;
// //         }

        
// //     }
// // }



// //linking of linked list
// import java.util.Scanner;
// public class node
// {
//     int data;
//     node addr;
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         node first=new node();
//         System.out.println("enter the value");
//         first.data=sc.nextInt();
//         first.addr=null;
//         node temp;
//         temp=first;
//         System.out.println("enter the number of elements");
//         int n=sc.nextInt();
//         for(int i=1;i<n;i++)
//         {
//             node last=new node();
//             System.out.println("enter the value");
//             last.data=sc.nextInt();
//             last.addr=null;
//             temp.addr=last;
//             temp=last;
//         }
//         temp=first;
//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp=temp.addr;
//         }
//     }
// }


//user defined node
import java.util.Scanner;
public class node
{
    int data;
    node addr;
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        node first=new node();
        System.out.println("enter the value");
        first.data=sc.nextInt();
        first.addr=null;
        node temp;
        temp=first;
        int x=1;
        System.out.println("press 1 to enter\npress 2 to print ");
        int ch=sc.nextInt();
        if(ch==1)
    {
        while(x==1)
        {
            for(int i=1;i<=1;i++)
        {
            node last=new node();
            System.out.println("enter the valuess");
            last.data=sc.nextInt();
            last.addr=null;
            temp.addr=last;
            temp=last;
        }
        System.out.println("press 1 to continue\n any key to exit");
        x=sc.nextInt();
        }
        System.err.println("press 1 to enter \n press 2 to print");
        ch=sc.nextInt();
    }
    if(ch==2)
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
