//package neetcode150.ArraysAndHashing;
//
//import java.util.Stack;
//
//public class ValidParanthesisSTACK {
//    static boolean isvalid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char ch : s.toCharArray()) {
//            if (ch == '{' || ch == '[' || ch == '(') {
//                stack.push(ch);
//            } else {
//                if (stack.isEmpty())return false;
//
//            char top = stack.pop();
//            if (ch == '}' && top != '{' || ch == ']' && top != '[' || ch == ')' && top != '(') {
//                return false;
//
//            }
//        }
//    }
//
//        return stack.isEmpty();
//    }
//
//
//static void main() {
//    System.out.println(isvalid("{[()]"));
//}
//}
