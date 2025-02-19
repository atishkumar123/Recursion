import java.util.Scanner;

public class FactorialOfN {
///by calling fun
    public static int fact(int i){

        if(i<1){
            return 1;
        }
        return i*fact(i-1);
    }

    //with parameter
    public static void fact(int i,int fac){
        if(i<1){
            System.out.print(fac);
            return;
        }
        fact(i-1,fac*i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(fact(n));
        fact(n,1);
    }
}
