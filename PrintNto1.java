import java.util.Scanner;

public class PrintNto1 {

    public static void nPrint(int i){

        if(i<1){
            return;
        }
        System.out.println(i);
        nPrint(i-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        nPrint(n);
    }
}
