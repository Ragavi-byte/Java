//package dsa;
//
//import java.util.Arrays;
//
//
//public class rotateArray {
//    static void main(){
//        int[]arr={1,2,3,4,5,6};
//        int k=2;
//        leftRotate(arr.clone(),k);
//        rightRotate(arr.clone(),k);
//    }
//    static void rightRotate(int[]arr,int k){
//        int n=arr.length;
//        k%=n;
//        reverse(arr,0,n-1);
//        reverse(arr,0,k-1);
//        reverse(arr,k,n-1);
//    System.out.println(Arrays.toString(arr)+"right rotated");}
//
//    static void leftRotate(int[]arr,int k){
//        int n=arr.length;
//        k%=n;
//        reverse(arr,0,k-1);
//        reverse(arr,k,n-1);
//        reverse(arr,0,n-1);
//        System.out.println(Arrays.toString(arr)+"left rotated");
//    }
//    static void reverse(int[]arr,int start,int end){
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//    }
//}
