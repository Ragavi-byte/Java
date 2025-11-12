//package dsa;
//import java.util.Arrays;
//
//
//public class SortbyAnotherarray {
//    static void main() {
//        int []a1={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
//        int []a2={2, 1, 8, 3};
//        int index=0;
//        int []result=new int[a1.length];
//        for(int i=0;i<a2.length;i++){
//            for(int j=0;j<a1.length;j++){
//                if(a1[j]==a2[i]){
//                    result[index]=a1[j];
//                    index++;
//                    a1[j]=-1;
//
//                }
//            }
//        }
//        Arrays.sort(a1);
//        for(int i=0;i<a1.length;i++){
//            if(a1[i]!=-1){
//                result[index]=a1[i];
//                index++;
//            }
//        }
//        for(int num:result){
//            System.out.print(num+" ");
//        }
//
//
//
//
//    }
//
//}
