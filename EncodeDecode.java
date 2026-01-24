//package neetcode150.ArraysAndHashing;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class EncodeDecode {
//    static void main() {
//        List<String>input= Arrays.asList( "hello", "world", "this is Java", "123", ""
//        );
//        StringBuilder encoded=new StringBuilder();
//        for(String s:input){
//            encoded.append(s.length()).append('#').append(s);
//        }
//        String encodedstring =encoded.toString();
//        System.out.println(encodedstring);
//        List<String>decoded= new ArrayList<>();
//        int i=0;
//        while(i<encodedstring.length()){
//            int j=i;
//            while(encodedstring.charAt(j)!='#'){
//                j++;
//            }
//            int length=Integer.parseInt(encoded.substring(i,j));
//            i=j+1;
//            decoded.add(encodedstring.substring(i,i+length));
//            i+=length;
//        }
//        System.out.println("decoded:"+decoded);
//    }
//}
