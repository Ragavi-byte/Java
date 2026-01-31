//package preparation;
//
//public class ThirdLargest {
//    static void main() {
//        int[] arr = {2, 3, 6, 7, 8, 9};
//        int largest = 0;
//        int secondlargest = 0;
//        int thirdlargest = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest ) {
//                thirdlargest = secondlargest;
//                secondlargest = largest;
//                largest = arr[i];
//            } else if (arr[i] > secondlargest) {
//                thirdlargest = secondlargest;
//                secondlargest = arr[i];
//
//            }else if(arr[i]>thirdlargest){
//                thirdlargest = arr[i];
//            }
//        }
//        System.out.println(thirdlargest);
//
//    }}
//
