import java.util.Scanner;
public class stack {
    int data;
    stack addr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack top=new stack();
        System.out.println("enter the value");
        top.data=sc.nextInt();
        top.addr=null;
        System.out.println("enter the number of nodes in stack");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            stack temp=new stack();
            System.out.println("enter the value");
            temp.data=sc.nextInt();
            temp.addr=top;
            top=temp;
        }
        System.out.println("the elements are:");
        while(top!=null)
        {
            System.out.println(top.data);
            top=top.addr;
        }
    }
}
