import java.util.Scanner;
public class circularLinkedList {
    public static class listnode
    {
        int data;
        listnode addr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        listnode first=new listnode();
        System.out.println("enter the value:");
        first.data=sc.nextInt();
        first.addr=null;
        listnode temp;
        temp=first;

        listnode last=null;
        System.out.println("enter the number of nodes");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {