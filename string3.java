public class string3
{
    public static void main(String[] args) {
    /*  String s="apple banana apple apple";
        String s1="apple";
        s=s+" ";
        int l=s.length();
        int count=0;
            String s2="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(s2.equals(s1))
                {
                    count++;
                }
                s2="";
            }
            else{
                s2=s2+ch;
            }
        }
        System.out.println(count);*/
                           //5digit word
        /*String s="i am heros vaibhav apple";
        s=s+" ";
        String s1="";
        String s2="a";
        int l=s.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(s1.length()==5)
                {
                    if(s1.charAt(0)=='a')
                    {
                        System.out.println(s1);
                        count++;
                    }
                    
                }
                
                s1="";
                
            }
            else
            {
                s1=s1+ch;
            }
        }
System.out.println(count);*/
                //palindrome word in a statement
                /*String s="nitin madam madam radar and radar";
                s=s+" ";
                int l=s.length();
                String s1="";
                String s2="";
                int count=0;
                for(int i=0;i<l;i++)
                {
                    char ch=s.charAt(i);
                    if(ch==' ')
                    {
                        int l1=s1.length();
                        for(int j=l1-1;j>=0;j--)
                        {
                            char ch1=s1.charAt(j);
                            {
                                s2=s2+ch1;
                            }
                            
                        }
                        if(s1.equals(s2))
                        {
                            count++;
                        }
                        s1="";
                        s2="";
                    }
                    
                    
                    else
                    {
                        s1=s1+ch;
                    
                    }
                }
                System.out.println(count);*/



                //print the max length string


                    String s="he loves pineapple juice";
                    s=s+" ";
                    String s1="";
                    String s2="";
                    int l=s.length();
                    for(int i=0;i<l;i++)
                    {
                        char ch=s.charAt(i);
                        if(ch==' ')
                        {
                            if(s1.length()>s2.length())
                            
                                s2=s1;
                            s1="";
                        }
                        else
                        {
                            s1=s1+ch;
                        }
                    }
                        System.out.println(s2);
                        

                                                             // reversal of the string

                                    /*String s="New Delhi is Capital of India";
                                    s=s.toLowerCase();
                                    s=s+" ";
                                    int l=s.length();
                                    String s1="";
                                    String s2="";
                                    for(int i=0;i<l;i++)
                                    {
                                        char ch=s.charAt(i) ;
                                        if(ch==' ')
                                        {
                                            int l1=s1.length();
                                            for(int j=l1-1;j>=0;j--)
                                            {
                                                char ch1=s1.charAt(j);
                                                s2=s2+ch1;
                                            }
                                            System.out.print(s2+' ');
                                    
                                            s1="";
                                            s2="";
                                        }
                                        else
                                        {
                                            s1=s1+ch;
                                        }
                                    }*/
        }
}
