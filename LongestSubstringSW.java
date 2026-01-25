//package neetcode150.ArraysAndHashing;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class LongestSubstringSW {
//    static void main() {
//        String s="xyzxy";
//        Set<Character> set=new HashSet<>();
//        int left=0;
//        int maxlength=0;
//        for(int right=0;right<s.length();right++){
//            char ch=s.charAt(right);
//            while(set.contains(ch)){
//                set.remove(s.charAt(left));
//                left++;
//            }
//            set.add(ch);
//            maxlength=Math.max(maxlength,right-left+1);
//        }
//        System.out.println(maxlength);
//    }
//}
