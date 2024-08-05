public class selectionSort {
    public static void selectionsort(int arr[])
    {
        for(int i=0;i<5;i++)
        {
            int pos=i,temp;
            for(int j=i+1;j<5;j++)
            {
                if(arr[pos]>arr[j])
                {
                    pos=j;
                }
            }
            temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
        for(int k=0;k<5;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,1,4,2};
        selectionsort(arr);
    }
}
