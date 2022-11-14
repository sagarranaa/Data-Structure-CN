import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class numberofoccurence {
    public static boolean unique(int arr[]){
        Arrays.sort(arr);
        int count=1;
        ArrayList<Integer>hs=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                if(hs.contains(count)){
                    return false;
                }
                hs.add(count);
                count=1;
            }
            if(arr.length-1==i){
                if(hs.contains(count)){
                    return false;
                }
                hs.add(count);
            }
        }
        return true;
    }
    public static void main(String[] args) {

  int arr[]={1,1,2,2,2,3,4,5,6};
     System.out.println(unique(arr));

    }
}
