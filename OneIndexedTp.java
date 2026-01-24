//package neetcode150.ArraysAndHashing;
//
//import java.util.Arrays;
//
//public class OneIndexedTp {
//    static void main() {
//        int[]nums={1,2,3,4};
//        int target=3;
//        int left=0,right=nums.length-1;
//        while(left<right){
//            int sum=nums[left]+nums[right];
//            if(sum==target){
//                int[] result=new int[]{left+1,right+1};
//                System.out.println(Arrays.toString(result));
//                break;
//            }else if(sum<target){
//                left++;
//            }else{
//                right--;
//            }
//        }
//
//
//    }
//}
