//package dsa;
//import java.sql.SQLOutput;
//import java.util.Scanner;
//public class Armstrong {
//    static void main() {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number to be armstrong");
//        int n = sc.nextInt();
//        int digits=String.valueOf(n).length();
//        int temp=n;
//        int sum=0;
//        while(temp>0){
//            int rem=temp%10;
//            sum+=Math.pow(rem,digits);
//            temp/=10;
//        }if(sum==n){
//            System.out.println("Armstrong number");
//        }else{
//            System.out.println("Not an Armstrong number");
//        }
//
//    }
//}
