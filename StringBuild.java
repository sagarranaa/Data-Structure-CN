public class StringBuild {
    public static String reversed(String str){
        String s1="";
        for(int i=str.length()-1;i>=0;i--){
            s1=s1+str.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        String s1="abc";
        System.out.println(reversed(s1));
    }
}
