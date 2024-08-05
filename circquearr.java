import java.util.Scanner;
public class circquearr
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element :");
        int n=sc.nextInt();
        int x=1,ch=0,front=-1,rear=-1;
        int queue[]=new int[n];
        while(x==1)
    {
        System.err.println("1.insertion\n 2.deletion\n 3.travesing");
        ch=sc.nextInt();
        if(ch==1)
        {
            if(front==-1&&rear==-1)
            {
                front=rear=0;
                System.out.println("Enter the value");
                queue[rear]=sc.nextInt();
            }
            else if(front==0&&rear==n-1||rear+1==front)
            {
                System.out.println("queue is full");
            }
            else if(rear==n-1)
            {
                rear=0;
                System.out.println("enter the value");
                queue[rear]=sc.nextInt();
            }
            else
            {
                rear++;
                System.out.println("enter the value");
                queue[rear]=sc.nextInt();
            }
        }
        if(ch==2)
        {
            if(front==-1&&rear==-1)
            {
                System.out.println("the elements are already deleted");
            }
            else if(front==rear)
            {
                System.out.println("the deleted element is"+queue[front]);
                rear=front=-1;
            }
            else if(front==n-1)
            {
                System.out.println("the deleted element is"+queue[front]);
                front=0;
            }
            else
            {
                System.out.println("the delete element is:"+queue[front]);
                front++;
            }
        }
        if(ch==3)
        {
            int i=front;
            while(i!=rear)
            {
                System.out.println("the element in the queue is"+queue[i]);
                i=(i+1)%n;
            }
            System.out.println("the element in the queue is"+queue[rear]);
        }
        System.out.println("press 1:to continue any key to exit\n");
        x=sc.nextInt();
    }
    }
}