public class bubblesort
{
    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<5;i++)
        {
            int temp;
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<5;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
    }
}