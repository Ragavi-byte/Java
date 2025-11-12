//package dsa;
//
//import java.util.Scanner;
//
//public class MaximumandMinimum {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n=sc.nextInt();
//        int max=0;
//        int min=9;
//        for (int i = 1; i <= n; i++) {
//            int digit=n%10;
//            if(digit>max)max=digit;
//            if(digit<min)min=digit;
//            n=n/10;
//        }
//        System.out.println("max="+max);
//        System.out.println("min="+min);
//    }
//}
