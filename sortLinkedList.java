import java.util.Scanner;
public class sortLinkedList {
    public static class listnode
    {
        int data;
        listnode addr;
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            listnode first=new listnode();
            System.out.println("enter the value");
            first.data=sc.nextInt();
            first.addr=null;
            listnode temp;
            temp=first;
            System.out.println("enter the number of nodes");
            int n=sc.nextInt();
            for(int i=1;i<n;i++)
            {
                listnode last=new listnode();
                System.out.println("enter the value");
                last.data=sc.nextInt();
                last.addr=null;
                temp.addr=last;
                temp=last;
            }

            listnode x,y;
            int z;
            x=first;
            y=null;

            while(x!=null){
                y=x.addr;
            while(y!=null)
            {
                if(x.data>y.data)
                {
                    z=x.data;
                    x.data=y.data;
                    y.data=z;
                }
                y=y.addr;
                
            }
            x=x.addr;
        }

            temp=first;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.addr;
            }
        }
}

