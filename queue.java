import java.util.Scanner;
public class queue {
    int data;
    queue addr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue front=new queue();
        System.out.println("enter the value");
        front.data=sc.nextInt();
        front.addr=null;
        queue temp;
        temp=front;
        System.out.println("enter the number of nodes");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            queue rear=new queue();
            System.out.println("enter the value");
            rear.data=sc.nextInt();
            rear.addr=null;
            temp.addr=rear;
            temp=rear;
        }

        System.out.println("the elements are:");
        temp=front;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.addr;
        }
    }
}
