import java.util.Scanner;

public class Print1ton {

    public static void nPrint(int i,int n){

        if(i>n){
            return;
        }
        System.out.println(i);
        nPrint(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        nPrint(1,n);



    }



}
