public class selectionsort {
    void sort(int arr[]){
        int n=arr.length;
        //one by one move boundary of unsorted subarray
        for(int i=0;i<n-1;i++){
            //find the minimum element in unsorted array
            int min_idx=1;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }

    }
    //print the array
    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        selectionsort ob=new selectionsort();
        int arr[]={64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted Array is:");
        ob.printArray(arr);
    }
}
