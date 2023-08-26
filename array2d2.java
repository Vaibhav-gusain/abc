//pattern print in matrix
import java.util.Scanner;
public class array2d2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int rows=sc.nextInt();
        System.out.println("enter the column");
        int col=sc.nextInt();
        int a[][]=new int [rows][col];
        System.out.println("enter the value");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter"+" "+"1.print"+" "+"2.10 20 30 60 90"+" "+"3. 10 40 70 80 90"+" "+"4. 10 20 30 50 70 80 90");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("print the matrix");
                for(int i=0;i<rows;i++)
                {
                    for(int j=0;j<col;j++)
                    {
                        System.out.print(a[i][j]);
                    }
                }
                
                break;
                case 2:
                    for(int i=0;i<rows;i++)
                    {
                        for(int j=0;j<col;j++)
                        {
                            if(i==0&&j==0 ||i==0&&j==1||i==0&&j==2||i==1&&j==2||i==2&&j==2)
                            {
                                System.out.print(a[i][j]+" ");
                            }
                        }
                    }
                    break;
                case 3:
                        for(int i=0;i<rows;i++)
                    {
                        for(int j=0;j<col;j++)
                        {
                            if(i==0&&j==0 ||i==1&&j==0||i==2&&j==0||i==2&&j==1||i==2&&j==2)
                            {
                                System.out.print(a[i][j]+" ");
                            }
                        }
                    }
                    break;
                    case 4:
                            for(int i=0;i<rows;i++)
                    {
                        for(int j=0;j<col;j++)
                        {
                            if(i==0&&j==0 ||i==0&&j==1||i==0&&j==2||i==1&&j==1||i==2&&j==0||i==2&&j==1||i==2&&j==2)
                            {
                                System.out.print(a[i][j]+" ");
                            }
                        }
                    }
                        
            default:
                System.out.println(" ");;
        }
    }
}