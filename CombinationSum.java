import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum {


    public static void combinationSum(int curr,int target,int[] arr,ArrayList<Integer> subseq,ArrayList<ArrayList<Integer>>ans){




        if(curr==arr.length){

            if(target==0){

                ans.add(new ArrayList<>(subseq));
            }
            return;
        }



        if(arr[curr]<=target) {
            subseq.add(arr[curr]);
            combinationSum(curr, target - arr[curr], arr, subseq, ans);
            subseq.remove(subseq.size() - 1);
        }
       // System.out.println(arr[curr]);
        combinationSum(curr+1,target,arr,subseq,ans);
       // System.out.println(arr[curr]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }



        ArrayList<Integer>subseq=new ArrayList<Integer>();

        ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();

        combinationSum(0,7,arr,subseq,ans);
        System.out.println(subseq);
        System.out.println(ans);

    }
}
