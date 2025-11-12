//package dsa;
//
//import java.util.Scanner;
//
//public class Rangeprime {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter starting number");
//        int start = sc.nextInt();
//        System.out.println("enter ending number");
//        int end = sc.nextInt();
//        System.out.println("numbers from" + start + "to" + end);
//        for (int i = start; i <= end; i++) {
//            if (isPrime(i)) {
//                System.out.println(+i);
//            }
//        }
//    }
//    static boolean isPrime(int n){
//        if (n <= 1)
//            return false;
//        for(int i=2;i<Math.sqrt(n);i++){
//            if(n%i==0)
//                return false;
//        }
//return true;
//    }
//}
//
