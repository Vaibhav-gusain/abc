import java.util.*;
public class array1d
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a[]={10,20,30,40,50,60};
        int b[]={1,2,3,4,5,6};
        int c[]=new int[6];
    System.out.println("enter the number" +" "+"1.add the array "+" "+"2.swap the index 1 with 0"+" "+"3.swap index 0 of array a and index 0 of array b  "+" "+"4.ascending order");
    int ch=sc.nextInt();
    
    switch(ch) {
        case 1:
            
        
            for(int i=0;i<6;i++)
            {
            c[i]=a[i]+b[i];
            System.out.println(c[i]);
            }
            break;
        case 2:
            int temp;
            for(int i=0;i<6;i++)
            {
                if(i==0||i==2||i==4)
                {
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
                System.out.println(a[i]);
            }
            break;
            case 3:
                {
                    for(int i=0;i<6;i++)
                    {
                        if(i==0||i==2||i==4||i==6)
                        {
                            temp=a[i];
                            a[i]=b[i];
                            b[i]=temp;
                        }
                            System.out.print(a[i]+" ");
                        } 
                        System.out.println("");
                        for(int i=0;i<6;i++)
                        {
                            System.out.print(b[i]+" ");
                        }

                    
                }
                break;
                case 4:
                     System.out.println("ascending order is = ");
        for(int i=0;i<6;i++)
        {
            for(int j=i+1;j<6;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);

        }
        break;
        
        default:
            System.out.println("ENTER A VALID NUMBER");
    }
    }
}