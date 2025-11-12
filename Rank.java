//package dsa;
//
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class Rank {
//    static void main() {
//        int[] a = {40, 10, 20, 30};
//        int[] temp = a.clone();
//        Arrays.sort(temp);
//        HashMap<Integer, Integer> rank = new HashMap<>();
//        int r = 1;
//        for (int num : temp) {
//            if (!rank.containsKey(num)) {
//                rank.put(num, r++);
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            a[i] = rank.get(a[i]);
//        }
//        System.out.println("rank" + Arrays.toString(a));
//    }
//}
//
//
//
//
