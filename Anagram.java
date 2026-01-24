//package neetcode150.ArraysAndHashing;
//
//public class Anagram {
//    static void main() {
//        String s="listen";
//        String t="ragavi";
//        if(s.length()!=t.length()){
//            System.out.println("not an anagram");
//            return;
//        }
//        int[]freq=new int[26];
//        for(int i=0;i<s.length();i++){
//            freq[s.charAt(i)-'a']++;
//            freq[t.charAt(i)-'a']--;
//        }
//        for(int i=0;i<26;i++){
//            if(freq[i]!=0){
//                System.out.println("not anagram");
//                return;
//            }
//        }
//        System.out.println("anagram");
//
//    }
//}
