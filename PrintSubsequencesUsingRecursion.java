import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequencesUsingRecursion {

     public static void printSubseq(int curr,int[]arr,ArrayList<Integer>subseq,ArrayList<ArrayList<Integer>>res){


         if(curr==arr.length){
             res.add(new ArrayList<>(subseq));
             System.out.println(subseq);
             return;
         }
         subseq.add(arr[curr]);
         printSubseq(curr+1,arr,subseq,res);
         subseq.remove(subseq.size()-1);
         printSubseq(curr+1,arr,subseq,res);
     }


     public static void sumOfSeq(int curr,int[] arr,int[] sum,int k,ArrayList<Integer>subseq1,ArrayList<ArrayList<Integer>>res){
         if(sum[0]>k){
             return;
         }
         if(curr==arr.length){

             if(sum[0]==k){
                 System.out.println(subseq1);
                 res.add(new ArrayList<>(subseq1));
             }
             return;
         }

         sum[0]=sum[0]+arr[curr];
         subseq1.add(arr[curr]);
         sumOfSeq(curr+1,arr,sum,k,subseq1,res);

         subseq1.remove(subseq1.size()-1);
         sum[0]=sum[0]-arr[curr];
         sumOfSeq(curr+1,arr,sum,k,subseq1,res);


     }
     public static boolean printFirstSubseq(int curr,int[]arr,ArrayList<Integer>subseq,int[] sum,int k){

         if(k-sum[0]==0){
             System.out.println(subseq);
             return true;

         }
         if(curr==arr.length){


             return false;
         }

         sum[0]=sum[0]+arr[curr];
         subseq.add(arr[curr]);
         if(printFirstSubseq(curr+1,arr,subseq,sum,k)){
             return true;
         }
         sum[0]=sum[0]-arr[curr];
         subseq.remove(subseq.size()-1);

         if(printFirstSubseq(curr+1,arr,subseq,sum,k)){
             return true;
         }


          return false;
     }


     


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Print Array");
        for(int i:arr){
            System.out.println(i);
        }

        ArrayList<Integer>subseq1=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();

       // printSubseq(0,arr,subseq1,res);

        int[]sum=new int[1];

        //sumOfSeq(0,arr,sum,3,subseq1,res);

        //System.out.println(res);

        boolean result=printFirstSubseq(0,arr,subseq1,sum,2);

        System.out.println("first element is"+ result);





    }
}
