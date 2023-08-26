/*import java.util.Scanner;
public class strings2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the String");
        String s=sc.nextLine();
        int  upper=0;
        int lower=0;
        int symbol=0;
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                upper+=1;

            }
            else if(ch>='A'&&ch<='Z')
            {
                lower+=1;
            }
            else if(ch>='0'&&ch<='9')
            {
                num=num+1;
            }
            else
            {
                symbol=symbol+1;
            }

            
        }
        System.out.println("upper case are "+upper);
        System.out.println("lower case are "+lower);
        System.out.println("numbera are "+num);
        System.out.println("Symbols are "+symbol);
        
    }
}*/
public class strings2{
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("VOWELS are = "+ch);
            }
        }*/
       
       //                                     character count
       
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                System.out.println(s.charAt(i));
                count++;
            }
        }
        System.out.println(count);*/



        ////                              palindrome


        /*String s="nitin";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        if(reverse.equals(s))
        {
            System.out.println(" palindrome");
        }
        else{
            System.out.println(" not a palindromw");
        }*/


//                         AppLE=aPPle



        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the statement");
        String s=sc.nextLine();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                char ch1=Character.toLowerCase(ch);
                s2=s2+ch1;
                
            }
            else if(ch>='a'&&ch<='z')
            {
            char ch1=Character.toUpperCase(ch);
            s2=s2+ch1;
            
            }
            else if(ch==' ')
            {
                s2=s2+' ';
            }
        }
        System.out.println(s2);
*/



                  
                             //count all P if PINEapple
   
   
   
   
   /* Scanner sc=new Scanner(System.in);
    System.out.println("enter the word");
    String s=sc.nextLine();
    System.out.println("enter the character");
    String s1=s.toLowerCase();
    char ch=sc.next().charAt(0);
    int count=0;
    for(int i=0;i<s1.length();i++)
    {
        char ch1=s1.charAt(i);
        if(ch1==ch)
        {
            count=count+1;
        }
        
        
    }
    System.out.println(count);*/




                                   //sorting of string
        
        
        
        /*Scanner sc=new Scanner (System.in);
        System.out.println("enter the word");
        String s=sc.nextLine();
        String s="banana";
        String s1="";
        for(char ch='a';ch<='z';ch++)
        {
            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(ch==ch1)
                {
                    s1+=ch1;
                }
                
            }
            
        }
         System.out.println(s1);*/
        
        
        
        
                                       //count the character presnt in the word
        
        
        
            /*String s="banana";
            
            for(char ch='a';ch<='z';ch++)
            {
                int count=0;
                for(int j=0;j<s.length();j++)
                {
                    char ch1=s.charAt(j);
                    if(ch==ch1)
                    {
                        count=count+1;
                    }
                }
                if(count>0)
                System.out.println(ch+"="+count);
                */
                               //unique banana=ban;
                /*String s="banana";
                String s1="";
                int l1=s.length();
                for(int i=0;i<l1;i++)
                {
                    char ch=s.charAt(i);
                    int t=1;
                    int l2=s1.length();
                    for(int j=0;j<l2;j++)
                    {
                        char ch1=s.charAt(j);
                        if(ch==ch1)
                        {
                            t=0;
                            break;
                        }
                    }
                    if(t==1)
                    {
                        s1=s1+ch;
                    }
                }
                System.out.println(s1);*/




                ///////////////////////piglatin form
                ///////////////////////trouble =oubletray




                /*String s="trouble";
                String s1="ay";
                String s2="";
                String s3="";
                int n=0;
                for(int i=0;i<s.length();i++)
                {
                    
                    char ch=s.charAt(i);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    {
                    n=i;
                    break;
                    }
                    
                }
                s2=s.substring(n,s.length());
                s3=s.substring(0,n);
                System.out.println(s2+s3+s1);*/
               
               
               
               
                //////////////////////subhash chandra bose=s.c.bose;

               
               
               
               
                String s="SUBHASH CHANDRA BOSE";
                s=" "+s;
                int l=s.lastIndexOf(' ');
                for(int i=0;i<l;i++)
                {
                    char ch=s.charAt(i);
                    if(ch==' ')
                    {
                        System.out.print(s.charAt(i+1)+".");
                    }
                }
                System.out.println(s.substring(l));
    }
    }
    

    

