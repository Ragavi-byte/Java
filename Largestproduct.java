//package dsa;
//
//
//public class Largestproduct {
//    static void main() {
//        int a[]={2,4,-2,6};
//        int max=a[0];
//        int min=a[0];
//        int result=a[0];
//        for(int i=0;i<a.length;i++) {
//            if(a[i]<max) {
//                int t=max;
//                max=min;
//                min=t;
//            }
//            max=Math.max(a[i],max*a[i]);
//            min=Math.min(a[i],min*a[i]);
//            result=Math.max(result, max);
//        }
//        System.out.println(result);
//
//    }
//}
