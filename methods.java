package assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//public class methods {
//    public static void main(String[] args) {
//        String input = "restart";
//        int lastIndex = input.lastIndexOf("r");
//        if (lastIndex != -1) {
//            String output = input.substring(0, lastIndex) + "$" + input.substring(lastIndex + 1);
//            System.out.println("output: " + output);
//        } else {
//            System.out.println("r not found");
//        }
//    }
//}
//public class methods {
//    public static void main(String[] args) {
//        String input="interviewbit";
//        String output=new StringBuilder(input).reverse().toString();
//        System.out.println(output);
//    }
//}
//public class methods {
//    static void main() {
//        String input="Abcde Bcgd";
//        String[]words=input.split(" ");
//        if(words.length==2){
//            String output= words[0]+ " loves " +words[1];
//            System.out.println(output);
//        }else{
//            System.out.println("Wrong input");
//        }
//    }
//}
//public class methods {
//    static void main() {
//        int[]A={1,2,3,4,4,5,6,5};
//        Set<Integer> uniqueSet=new HashSet< >();
//        for(int num :A) {
//            uniqueSet.add(num);
//        }
//        {
//            System.out.println("unique elements"+uniqueSet);
//        }
//
//    }
//}
//public class methods {
//    public static boolean ispalindrome(int[]arr) {
//        int[]reversed= new int[arr.length];
//        for(int i=arr.length-1,j=0;i>=0;i--,j++)
//        {
//            reversed[j]=arr[i];
//        }
//        for(int i=0;i<reversed.length;i++){
//            System.out.println(i+" "+reversed[i]);
//        }
//        return Arrays.equals(reversed,arr);
//    }
//
//        public static void main(String[] args) {
//           int[] A={1,2,1};
//           int[] B={2,3,4};
//            System.out.println("A1 is palindrome"+ispalindrome(A));
//            System.out.println("B1 is palindrome"+ispalindrome(B));
//        }
//    }
//public class methods {
//    static void main() {
//        int[]a={1,2,1};
//        boolean issorted=true;
//        for(int i=0;i<a.length-1;i++){
//            if(a[i]>a[i+1]){
//                issorted=false;
//                break;
//        }
//    }
//        if(issorted){
//            System.out.println("sorted array");
//        }else{
//            System.out.println("not sorted array");
//        }
//    }
//}
//class methods{
//    static void main() {
//        int top=5;
//        int arr[]={1,2,3,4,5};
//        System.out.println(top+" ");
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=top){
//                System.out.print(arr[i]+ " ");
//            }
//        }
//    }
//}