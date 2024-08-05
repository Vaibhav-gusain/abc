import java.util.Scanner;
public class queuearray {
    public static void main(String[] args) {
        int max=5;
        int q[]=new int[max];
        int ch,x=1,f=-1,r=-1;
        while(x==1)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("press 1:insertion\n press 2:deletion\n press 3:traversing");
            ch=sc.nextInt();
            if(ch==1)
            {
                if(r==max-1)
                {
                    System.out.println("queue is full");
                }
                else if(f==-1&&r==-1)
                {
                    f=r=0;
                    System.out.println("enter the value:");
                    q[r]=sc.nextInt();
                }
                else
                {
                    r++;
                    System.out.println("enter the value");
                    q[r]=sc.nextInt();
                }
            }
            if(ch==2)
            {
                if(f==-1&&r==-1)
                {
                    System.out.println("queue is empty");
                }
                else if(f==r)
                {
                    System.out.println("delete the element is"+q[f]);
                    f=r=-1;
                }
                else
                {
                    System.out.println("deleted element is"+q[f]);
                    f++;
                }
            }
            if(ch==3)
            {
                for(int i=f;i<=r;i++)
                {
                    System.out.println(q[i]);
                }
            }
            System.out.println("press 1:to continue\n press 2:exit");
            x=sc.nextInt();
        }
    }
}
