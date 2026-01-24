//package neetcode150.ArraysAndHashing;
//
//import java.util.Arrays;
//
//public class ProductArray {
//    static void main() {
//        int[]nums={1,2,4,6};
//        int n=nums.length;
//        int[]output=new int[n];
//        int left=1;
//        for(int i=0;i<n;i++){
//            output[i]=left;
//            left*=nums[i];
//        }
//        int right=1;
//        for(int i=n-1;i>=0;i--){
//            output[i]*=right;
//            right*=nums[i];
//
//        }
//        System.out.println(Arrays.toString(output));
//    }
//}
