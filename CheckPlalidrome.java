import java.util.Scanner;

public class CheckPlalidrome {

//    public static boolean isPlaidrome(String str,int a,int b){
//
//        if(a>=b){
//            return true;
//        }
//        if(str.charAt(a)!=str.charAt(b)){
//            return false;
//        }
//        return isPlaidrome(str,a+1,b-1);
//    }

    //function with single parameter

    public static boolean isPlaidrome(String str,int a){
        if(a>=str.length()/2){
            return true;
        }
        if(str.charAt(a)!=str.charAt(str.length()-1-a)){
            return false;
        }
        return isPlaidrome(str,a+1);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int a=0;
        int b=str.length()-1;
        System.out.println(isPlaidrome(str,a));


    }

}
