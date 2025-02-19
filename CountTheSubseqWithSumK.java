import java.util.Scanner;

public class CountTheSubseqWithSumK {


    public static Integer subseqCount(int curr,int arr[],int[] sum,int k){

        if(curr==arr.length){

            if(sum[0]==k){
                return 1;
            }

            return 0;
        }

        sum[0]=sum[0]+arr[curr];
        int left=subseqCount(curr+1,arr,sum,k);
        sum[0]=sum[0]-arr[curr];
        int right=subseqCount(curr+1,arr,sum,k);

        return left+right;

    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i:arr){
            System.out.println(i);
        }

        int sum[]=new int[1];

        int count=subseqCount(0,arr,sum,2);

        System.out.println("count is"+count);




    }
}
