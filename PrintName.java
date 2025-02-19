import java.util.Scanner;

public class PrintName {


    public static void nPrint(int n,int i){
        if(i>n){
            return;
        }
        System.out.println("Atish kumar");
        nPrint(n,i+1);

    }

    public static void main(String[] args) {
        System.out.println("start code");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        nPrint(n,1);




    }
}
