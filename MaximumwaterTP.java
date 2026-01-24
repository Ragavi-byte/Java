//package neetcode150.ArraysAndHashing;
//
//public class MaximumwaterTP {
//    static void main() {
//        int[] heights = {1, 7, 2, 5, 4, 7, 3, 6};
//        int left = 0, right = heights.length - 1;
//        int maxwater = 0;
//        while (left < right) {
//            int width =right- left;
//            int minheight = Math.min(heights[left], heights[right]);
//            int water = width*minheight;
//            if (water > maxwater) {
//                maxwater = water;
//            }
//            if (heights[left] < heights[right]) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//        System.out.println(maxwater);
//    }
//}
