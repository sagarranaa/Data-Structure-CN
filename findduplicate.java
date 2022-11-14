import java.util.Arrays;
import java.util.Arrays;
public class findduplicate {
    public static void main(String[] args) {
        int arr[]= {1,3,2,1};
        int result=duplicate(arr);
        System.out.println(result);

    }
    public static int duplicate(int arr[]){
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                ans=arr[i];
            }
        }
        return ans;
    }
}
