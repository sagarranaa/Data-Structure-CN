public class binarysearch {
    public static int binaryalgo(int arr[],int size,int x){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]==x){
                return mid;
            } else if (x>arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return -1;

    }
    public static void main(String[] args) {

        int arr[]= {1,2,4,6,7,8};
        int n=arr.length;
        int x=4;
        int result=binaryalgo(arr,6,8);
        System.out.println(result);

    }
}
