//package dsa;
//import java.util.*;
//
//    public class Repeated {
//        public static void main(String[] args) {
//            int arr[] = {4, 5, 1, 2, 5, 3, 1, 2};
//            HashSet<Integer> seen = new HashSet<>();
//            int firstRepeated = -1;
//
//            for (int num : arr) {
//                if (seen.contains(num)) {
//                    firstRepeated = num;
//                    break;
//                } else {
//                    seen.add(num);
//                }
//            }
//
//            if (firstRepeated != -1)
//                System.out.println("First repeated number is: " + firstRepeated);
//            else
//                System.out.println("No repeated elements found.");
//        }
//    }
//
//
