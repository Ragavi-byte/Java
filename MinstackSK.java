//package neetcode150.ArraysAndHashing;
//
//import java.util.Stack;
//
//public class MinstackSK {
//    private Stack<Integer> stack;
//    private Stack<Integer> minstack;
//
//
//    public MinstackSK(){
//     stack=new Stack<>();
//     minstack=new Stack<>();
//    }
//    public void push(int val){
//        stack.push(val);
//        if(minstack.isEmpty()){
//            minstack.push(val);
//        }else{
//            minstack.push(Math.min(val,minstack.peek()));
//        }
//    }
//    public void pop(){
//        if(!stack.isEmpty()){
//            stack.pop();
//            minstack.pop();
//        }
//    }
//    public int top(){
//        return stack.peek();
//    }
//    public int getMin(){
//        return minstack.peek();
//    }
//
//    static void main() {
//        MinstackSK sk = new MinstackSK();
//        sk.push(1);
//        sk.push(2);
//        sk.push(3);
//        sk.pop();
//        System.out.println(sk.top());
//        System.out.println(sk.getMin());
//    }
//
//}
