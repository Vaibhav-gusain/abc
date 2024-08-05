import java.util.Scanner;
public class stackarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        int n=sc.nextInt();
        int ch=0,x=1,top=-1;
        int stack[]=new int[n];
        while(x==1)
        {
            System.out.println("1.push\n 2.pop\n 3.traverse");
            ch=sc.nextInt();
            if(ch==1)
            {
                if(top==n-1)
                {
                    System.out.println("The stack is full(overflow)");
                }
                else
                {
                    top++;
                    System.out.println("enter the value in stack");
                    stack[top]=sc.nextInt();
                }
            }
            if(ch==2)
            {
                if(top==-1)
                {
                    System.out.println("The Stack is empty(underflow)");
                }
                else
                {
                    System.out.println("The deleted element is :"+stack[top]);
                    top--;
                }
            }
            if(ch==3)
            {
                for(int i=top;i>=0;i--)
                {
                    System.out.println("The values of stack are:"+stack[i]);
                }
            }
            System.out.println("press 1 to continue ...... any key to exit");
            x=sc.nextInt();
        }
    }
}