//print serious of alphabets and vowels....

// public class recurssion1 {
//     public static void show(int ch)
//     {
//         if(ch<=90)
//         {
//             if(ch==65||ch==69||ch==73||ch==79||ch==85){
//             System.out.println((char)ch);
//             }
//             show(ch+1);
//         }
//     }
//     public static void main(String[] args) {
//         show(65);
//     }
// }



//series of 1+2+3+4+5

// public class recurssion1
// {
//     public static int add(int x)
//     {
//         if(x==1)
//         {
//             return 1;
//         }
//         int n=x+add(x-1);
//         return n;
//     }
//     public static void main(String[] args) {
//         System.out.println(add(5));
//     }
// }

//series of 1*2*3*4*5....

// public class recurssion1
// {
//     public static int multi(int x)
//     {
//         if(x==1)
//         {
//             return 1;
//         }
//         int n=x*multi(x-1);
//         return n;
//     }
//     public static void main(String[] args) {
//         System.out.println(multi(4));
//     }
// }


//fatorial of the given number


// public class recurssion1
// {
//     public static int fact(int n)
//     {
//         if(n==0)
//         {
//             return 1;
//         }
//         int fn=n*fact(n-1);
//         return fn;
//     }
//     public static void main(String[] args) {
//         System.out.println(fact(4));
//     }
// }


//fibonacii series
// public class recurssion1
// {
//     public static int fib(int n)
//     {
//         if(n==0)
//         {
//             return 0;
//         }
//         if(n==1)
//         {
//             return 1;
//         }
//         int fibn=fib(n-1)+fib(n-2);
//         return fibn;
//     }
//     public static void main(String[] args) {
//         System.out.println(fib(10));
//     }
// }


//series print a-z
// public class recurssion1
// {
//     public static void series(int ch)
//     {
//         if (ch<=90)
//         {
//             System.out.print((char)ch+" ");
//             series(ch+1);
//         }
//     }
//     public static void main(String[] args) {
//         series(65);
//     }
// }

//series of z-a

// public class recurssion1
// {
//     public static void series(int ch)
//     {
//         if(ch>=65)
//         {
//             System.out.print((char)ch+" ");
//             series(ch-1);
//         }
//     }
//     public static void main(String[] args) {
//         series(90);
//     }
// }


//print 1!,2!,3!,4!,5!

// public class recurssion1
// {
//     public static int show(int x)
//     {
//             if(x==1)
//             {
//                 return 1;
//             }
//         int fn=x*show(x-1);
//         return fn;
//     }
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//         System.out.println(show(i));
//         }
//     }
// }

//add 1!+2!+3!+4!

// public class recurssion1
// {
//     public static int add(int x) {
//         if(x==1)
//         {
//             return 1;
//         }
//         int fn=x*add(x-1);
//         return fn;
//     }
//     public static void main(String[] args) {
//         int sum=0;
//         for(int i=1;i<=5;i++){
//         sum=add(i)+sum;
//         }
//         System.out.println(sum);
//     }
// }

//breakdown a number 1234

// public class recurssion1
// {
//     public static void breakdown(int n)
//     {
//         if(n==0)
//         {
//             return;
//         }
//         int print=n%10;
//         System.out.print(print);
//         n=n/10;
//         breakdown(n);
//     }
//     public static void main(String[] args) {
//         breakdown(12345);
//     }
// }

//add reverse of 1234 = 10

// public class recurssion1
// {
//     public static int reverseadd(int n)
//     {
//         if(n==0)
//         {
//             return 0 ;
//         }
//         else{
//         return(n%10)+reverseadd(n/10);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(reverseadd(1234));
//     }
// }


//add square of the digit of the number

// public class recurssion1
// {
//     public static int add(int n)
//     {
//         if(n==0) return 0;
//         else
//         {
//             return(n%10*n%10)+add(n/10);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(add(123));
//     }
// }


//armstrong number

// public class recurssion1
// {
//     public static int armstrong(int n)
//     {
//         int sum=0;
//         if(n==0) return 0;
//         else
//         {
//             int r=n%10;
//             sum=sum+r*r*r;
//             return sum+armstrong(n/10);
//         }
//     }
//     public static void main(String[] args) {
//         int n=153;
//         int r=armstrong(n);
//         if(r==n)
//         {
//             System.out.println("armstrong");
//         }
//     }
// }

//check whether the number is niven 

// public class recurssion1
// {
//     public static int  niven(int n)
//     {
//         int sum=0;
//         if(n==0) return 0;
//         else
//         {
//             int r=n%10;
//             sum=sum+r;
//             niven(n/10);
//             return sum;
//         }
//     }
//     public static void main(String[] args) {
//         int n=81;
//         int r=niven(n);
//         if(n%r==0)
//         {
//             System.out.println("niven number");
//         }
//         else
//         {
//             System.out.println("not niven");
//         }
//     }
// }


//check whether the number is neon number;

public class recurssion1
{
    public static int neon(int n)
    {
        if(n==0)
        {
            return 0;
        }

        else
        {
            return n%10+neon(n/10);
        }
    }
    public static void main(String[] args) {
        int n=9;
        int sq=n*n;
        int r=neon(sq);
        System.out.println(r);
        if(r==n)
        {
            System.out.println("neon number");
        }
        else
        {
            System.out.println("not neon");
        }
    }
}