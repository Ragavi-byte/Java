//package neetcode150.ArraysAndHashing;
//
//import java.util.*;
//
//public class GroupedAnagrams {
//    static void main() {
//        String[] strs = {"act","pots","tops","cat","stop","hat"};
//        Map<String, List<String>>map = new HashMap<>();
//        for(String str:strs){
//            char[]ch=str.toCharArray();
//            Arrays.sort(ch);
//            String key=new String(ch);
//            map.computeIfAbsent(key,k->new ArrayList<>()).add(str);
//
//        }
//        List<List<String>> groupedAnagrams = new ArrayList<>(map.values());
//        System.out.println(groupedAnagrams);
//    }
//}
