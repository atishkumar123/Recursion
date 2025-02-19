import java.util.Scanner;

public class Print1ToN_Backtrack {

    public static void nPrint(int i){

        if(i<1){
            return;
        }
        nPrint(i-1);
        System.out.println(i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        nPrint(n);
    }
}
