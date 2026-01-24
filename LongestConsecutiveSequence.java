//package neetcode150.ArraysAndHashing;
//
//import java.util.HashSet;
//
//public class LongestConsecutiveSequence {
//    static void main() {
//        int[]nums={2, 20, 4, 10, 3, 4, 5};
//        HashSet<Integer>set=new HashSet<>();
//        for(int num:nums){
//            set.add(num);
//        }
//        int longest=0;
//        for(int num:set){
//            if(!set.contains(num-1)){
//                int currentnum=num;
//                int count=1;
//                while(set.contains(currentnum+1)){
//                    currentnum++;
//                    count++;
//                }
//                longest=Math.max(count,longest);
//
//            }
//        }
//        System.out.println(longest);
//    }
//}
