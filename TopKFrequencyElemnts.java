//package neetcode150.ArraysAndHashing;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.PriorityQueue;
//
//public class TopKFrequencyElemnts {
//    static void main() {
//        int[]nums={1,2,2,3,3};
//        int k=2;
//        Map<Integer,Integer>freq=new HashMap<>();
//        for(int n:nums){
//            freq.put(n,freq.getOrDefault(n,0)+1);
//        }
//        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));
//        pq.addAll(freq.keySet());
//        int[]result=new int[k];
//        for(int i=0;i<k;i++){
//            result[i]=pq.poll();
//        }
//        System.out.println(Arrays.toString(result));
//
//    }
//}
