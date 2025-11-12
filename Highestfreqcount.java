//package dsa;
//
//import java.sql.SQLOutput;
//import java.util.HashMap;
//import java.util.Arrays;
//
//public class Highestfreqcount {
//    static void main(){
//        Integer []c={2,3,2,3,8,9,9,6,9,};
//        HashMap<Integer,Integer> freq=new HashMap<>();
//        for(int n:c){
//            freq.put(n,freq.getOrDefault(n,0)+1);
//        }
//Arrays.sort(c,(a,b)->{
//    int diff= Integer.compare(freq.get(b),freq.get(a));
//    return diff!=0?diff:Integer.compare(a,b);
//});
//        System.out.print(Arrays.toString(c));}}
