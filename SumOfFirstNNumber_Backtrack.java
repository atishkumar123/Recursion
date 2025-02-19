import java.util.Scanner;

public class SumOfFirstNNumber_Backtrack {


    public static int nSum(int i){

        if(i<1){
            return 0;
        }
        return nSum(i-1)+ i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println("Sum is "+ nSum(n));
    }
}
