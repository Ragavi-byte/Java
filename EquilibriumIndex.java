//package dsa;
//
//public class EquilibriumIndex {
//    static void main() {
//        int[]a={-7, 1, 5, 2, -4, 3, 0};
//        FindEquilibriumIndex(a);
//    }
//    static void FindEquilibriumIndex(int[]a) {
//        int total = 0;
//        for (int num : a) {
//            total += num;
//        }
//        int leftsum = 0;
//        boolean found = false;
//        for (int i = 0; i < a.length; i++) {
//           int rightsum = total - leftsum - a[i];
//
//            if (leftsum == rightsum) {
//                System.out.println("Equilibrium found" + i);
//                found = true;
//            }
//            leftsum += a[i];
//        }
//        if (!found) {
//            System.out.println("Equilibrium not found");
//        }
//
//    }}
