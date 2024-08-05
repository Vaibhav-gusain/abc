import java.util.Scanner;
public class dqarray {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the element :");
    int n=sc.nextInt();
    int dq[]=new int[n];
    int ch=0,x=1,f=-1,r=-1;
    while(x==1)
    {
        System.out.println("1.Insert from front\n 2.Insert from rear\n 3.Delete from Front\n 4.Delete from Rear\n 5.Traverse");
        ch=sc.nextInt();
            if(ch==1)
                {
                    if(f==0&&r==n-1||r+1==f)
                    {
                        System.out.println("the queue is full");
                    }
                    else if(f==-1&&r==-1)
                    {
                        f=r=0;
                        System.out.println("enter the element");
                        dq[f]=sc.nextInt();
                    }
                    else if(f==0)
                    {
                        f=n-1;
                        System.out.println("enter the element");
                        dq[f]=sc.nextInt();
                    }
                    else
                    {
                        f--;
                        System.out.println("enter the element");
                        dq[f]=sc.nextInt();
                    }
                }
            if(ch==2)
            {
                if(f==0&&r==n-1||r+1==f)
                    {
                        System.out.println("the queue is full");
                    }
                else if(f==-1&&r==-1)
                    {
                        f=r=0;
                        System.out.println("enter the element");
                        dq[r]=sc.nextInt();
                    }
                else if(r==n-1)
                    {
                        r=0;
                        System.out.println("enter the element");
                        dq[r]=sc.nextInt();
                    }
                else
                {
                    r++;
                    System.out.println("enter the element");
                    dq[r]=sc.nextInt();
                }
            }
            if(ch==3)
                {
                    if(f==-1&&r==-1)
                    {
                        System.out.println("the queue is empty");
                    }
                    else if(f==r)
                    {
                        System.out.println("the deleted element is:"+dq[f]);
                        f=r=-1;
                    }
                    else if(f==n-1)
                    {
                        System.out.println("the delete element is:"+dq[f]);
                        f=0;
                    }
                    else
                    {
                        System.out.println("the delete element is:"+dq[f]);
                        f++;
                    }
                }
            if(ch==4)
                {
                    if(f==-1&&r==-1)
                    {
                        System.out.println("the queue is empty");
                    }
                    else if(f==r)
                    {
                        System.out.println("the deleted element is:"+dq[r]);
                        f=r=-1;
                    }
                    else if(r==0)
                    {
                        System.out.println("the deleted element is:"+dq[r]);
                        f=n-1;
                    }
                    else
                    {
                        System.out.println("the deleted element is"+dq[r]);
                        r--;
                    }
                }
            if(ch==5)
                {
                    int i=f;
                    while(i!=r)
                    {
                        System.out.println("the element in queue are"+dq[i]);
                        i=(i+1)%n;
                    }
                    System.out.println("the element in queue are"+dq[r]);
                }
            
            System.out.println("1:to continue\n.... press any key to exit");
            x=sc.nextInt();
    }
    }
}

