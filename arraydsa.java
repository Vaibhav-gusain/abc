//a[1,2,3,4,5,6]   b[7,8,9,10,11,12]
//a[8,7,10,9,12,11]  b[2,1,4,3,6,5]

// public class arraydsa
// {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6};
//         int b[]={7,8,9,10,11,12};
//         for(int i=0;i<6;i++)
//         {
//             int temp=0;
//                 if(i%2==0)
//                 {
//                     temp=a[i];
//                     a[i]=b[i+1];
//                     b[i+1]=temp;
//                 }
//                 else
//                 {
//                     temp=a[i];
//                     a[i]=b[i-1];
//                     b[i-1]=temp;
//                 }
//         }
//         for(int k=0;k<6;k++){
//                 System.out.print(a[k]+" ");
//     }
//     System.out.println();
//     for(int z=0;z<6;z++)
//     {
//         System.out.print(b[z]+" ");
//     }
// }
// }


//convert odd into 0 and even into add to next element


// public class arraydsa
// {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6,7};
//         for(int i=0;i<=7;i++)
//         {
//             if(a[i]%2==0)
//             {
//                 a[i]=a[i]+a[i+1];
//             }
//             else
//             {
//                 a[i]=0;
//             }
//             System.out.print(a[i]+" ");
//         }
//     }
// }


//[1,2,3,4,5,6,7]=[6,4,2,1,3,5,7]



// public class arraydsa
// {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6,7};
//         int b[]=new int[7];
//         int mid=6/2;
//         b[mid]=a[0];
//         int z=mid;

//         for(int i=1;i<7;i++)
//         {
//             if(a[i]%2==0)
//             {
//                 z--;
//                 b[z]=a[i];
//             }
//             else
//             {
//                 mid++;
//                 b[mid]=a[i];
//             }
//         }
//         for(int k=0;k<7;k++)
//         {
//             System.out.print(b[k]);
//         }
//     }
// }