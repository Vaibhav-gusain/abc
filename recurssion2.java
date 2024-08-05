//TOWER OF HANOI
/*public class recurssion2
{
    public static void towerofhanoi(int n,String src,String helper, String dest)
    {
        if(n==1)
        {
            System.out.println(" tranfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerofhanoi(n-1, src, dest, helper);
        System.out.println(" tranfer disk "+n+" from "+src+" to "+dest);
        towerofhanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerofhanoi(n, "s", "h", "d");
    }
}*/




//PRINT A STRING IN REVERSE
/*public class recurssion2
{
    public static void printReverse(String str,int ind)
{
    if(ind==0)
    {
        System.out.println(str.charAt(ind));
        return;
    }
    System.out.println(str.charAt(ind));
    printReverse(str,ind-1);
}
    public static void main(String[] args) {
        String str="abcd";
        printReverse(str, str.length()-1);
    }
}*/


// occur of element
public class recurssion2{
    
    public static void main(String[] args) {
        String Str="abaacdaefaah";
    }
}
