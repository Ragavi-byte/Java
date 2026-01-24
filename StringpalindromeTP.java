//package neetcode150.ArraysAndHashing;
//
//public class StringpalindromeTP {
//    static void main() {
//        String s = " was it a car or a cat i saw?";
//        int left = 0, right = s.length()-1;
//        while (left < right) {
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                left++;
//            }
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                right--;
//            }
//            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                System.out.println("false");
//            }
//            left++;
//            right--;
//        }
//        System.out.println("true");
//    }
//    }
//
