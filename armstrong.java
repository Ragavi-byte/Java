//package org.example;
//import java.util.Scanner;
//class Armstrong {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int num = input.nextInt();
//        int orignalnumber = num;
//        int nDigits = String.valueOf(num).length();
//        int sum = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, nDigits);
//            num /= 10;
//        }
//        if (sum == orignalnumber) {
//            System.out.println("The Armstrong number is ");
//        } else {
//            System.out.println("not an armstrong " );
//
//        }
//    }
//}
//import java.util.Scanner;
//public class armstrong {
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("enter the number of arrays");
//        int n= input.nextInt();
//        int a[]=new int[3];
//        System.out.println("enter the array elements");
//        for(int i=0;i<3;i++) {
//            a[i] = input.nextInt();
//        }
//        int largest=a[0];
//        int smallest=a[0];
//        for(int i=0;i<3;i++) {
//            if(a[i]>largest){
//                largest=a[i];
//            }
//            if(a[i]<smallest){
//                smallest=a[i];
//            }
//        }
//        System.out.println("The largest array is: "+largest);
//        System.out.println("The smallest array is: "+smallest);
//
//    }
//}
//class Armstrong
//{
//	public static void main(String[] args)
//	{
//        int a=35;
//        int count=0;
//        while(a>1)
//        {
//           a=a/2;
//           count++;
//        }
//        System.out.println(count);
//    }
//}