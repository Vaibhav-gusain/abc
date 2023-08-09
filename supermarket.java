
import java.util.Scanner;


public class supermarket  {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int amount=0;
System.out.println("==================================");
System.out.println("Welcome to Shopping store");
System.out.println("==================================");
System.out.println("no.      item       price");
System.out.println("1.      Apple         70");
System.out.println("2.      Kiwi          150");
System.out.println("3.      Orange        90");
System.out.println("4.      Banana        60");
System.out.println("5.      Pineapple     80");
System.out.println("6.      Peach         100");
System.out.println("7.      Papaya        90");
System.out.println("8.      Watermelon    70");
System.out.println("9.      Grapes        80");
System.out.println("10.     Avocados      120");
System.out.println("==================================");
System.out.println("Enter 1 to proceed forward");
System.out.println("Enter 0 to exit the site");
System.out.println("==================================");
int n=sc.nextInt();
if(n==1)
{
        //TO SELECT APPLE

    System.out.println("Do you want to buy Apple");
    System.out.println("please enter y for yes");
    System.out.println("please enter n for no");
    char ch=sc.next().charAt(0);
     if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=70;
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");
    }
   else if(ch=='n'||ch=='N')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
        //TO SELECT KIWI

    System.out.println("===============================================");
    System.out.println("Do you want to buy Kiwi");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=150; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
        //TO SELECT ORANGE

    System.out.println("===============================================");
    System.out.println("Do you want to buy Orange");
    System.out.println("please enter y for yes");
    System.out.println("please enter n for no");
    ch=sc.next().charAt(0);
   if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=90; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");
    }
   else if(ch=='n'||ch=='N')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
        //TO SELECT BANANA

    System.out.println("===============================================");
    System.out.println("Do you want to buy Banana");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=60; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
        //TO SELECT PINEAPPLE

    System.out.println("===============================================");
    System.out.println("Do you want to buy Pineapple");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=80; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
        //TO SELECT PEACH

    System.out.println("===============================================");
    System.out.println("Do you want to buy Peach");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=100;
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
        //TO SELECT PAPAYA

    System.out.println("===============================================");
    System.out.println("Do you want to buy Papaya");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=90; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
    //TO SELECT WATERMELON

    System.out.println("===============================================");
    System.out.println("Do you want to buy Watermelon");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=70; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
    //TO SELECT GRAPES
    System.out.println("===============================================");
    System.out.println("Do you want to buy Grapes");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=80; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
       System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
    //TO SELECT AVOCADOS
    System.out.println("===============================================");
    System.out.println("Do you want to buy Avocados");
    System.out.println("Please enter y for yes");
    System.out.println("Please enter n for no");
    ch=sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        System.out.println("Please enter the quantity");
        int quant=sc.nextInt();
        int price=120; 
        price = price * quant;
        amount=amount+price;
        System.out.println("The amount is added to your billing list");   
    }
   else if(ch=='N'||ch=='n')
   {
        System.out.println("THANKYOU");
   }
   else
   {
        System.out.println("Please Enter the valid option");
   }
    System.out.println("==================================");
    if(amount==0)
    {
        System.out.println("Item not selected");
    }
    //CODE TO FIND THE GST AND DISCOUNT ON THE ITEMS
    System.out.println("==================================");
    System.out.println("your billing amount is ="+amount);
    if(amount>=0 && amount<=200)
        {
           int discount=amount*5/100;
           amount=amount-discount;
           System.out.println("Discount is = "+discount);
           System.out.println("Gross amount is = "+amount);
           int GST=amount*18/100;
           System.out.println("GST is =" +GST);
           System.out.println("CGST is = " +GST/2);
           System.out.println("SGST is = " +GST/2);
           int netamount=amount+GST;
           System.out.println("net amount is "+netamount);       
        }
    else if(amount>=201 && amount<=1000)
    {
           int discount=amount*10/100;
           amount=amount-discount;
           System.out.println("Discount is = "+discount);
           System.out.println("Gross amount is = "+amount);
           int GST=amount*18/100;
           System.out.println("GST is =" +GST);
           System.out.println("CGST is = " +GST/2);
           System.out.println("SGST is = " +GST/2);
           int netamount=amount+GST;
           System.out.println("net amount is "+netamount); 
    }
    else
    {
           int discount=amount*15/100;
           amount=amount-discount;
           System.out.println("Discount is = "+discount);
           System.out.println("Gross amount is = "+amount);
           int GST=amount*18/100;
           System.out.println("GST is =" +GST);
           System.out.println("CGST is = " +GST/2);
           System.out.println("SGST is = " +GST/2);
           int netamount=amount+GST;
           System.out.println("net amount is "+netamount); 
    }
}
else if(n==0)
{
   System.out.println("Thankyou for visiting the portal");
   System.out.println("Please close the program");  
}
else
{
    System.out.println("Please Enter the valid option");
}

    }
}