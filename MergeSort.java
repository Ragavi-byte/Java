package dsa;

//public class MergeSort {
//    void merge(int[]arr, int left, int mid, int right){
//        int i=left;
//        int j=mid+1;
//        int k=0;
//        int temp[]=new int[right-left+1];
//        while(i<=mid&&j<=right){
//            if(arr[i]<=arr[j]) {
//                temp[i] = arr[i];
//                i++;
//            }
//        else{
//            temp[j] = arr[j];
//            j++;
//        }
//        while(i<=mid){
//        temp[k] = arr[i];
//        i++;
//            k++;
//        }while(j<=right){
//            temp[k] = arr[j];
//            j++;
//        }
//        }
//        for(int x=0;x<temp.length;x++){
//            arr[left+x]=temp[x];
//        }
//    }
//    void sort(int[]arr, int left, int right){
//        if(left<right){
//            int mid=left+right/2;
//            sort(arr,left,mid);
//            sort(arr,mid+1,right);
//            merge(arr,left,mid,right);
//        }
//    }
//    void printarray(int[]arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//    static void main() {
//        int arr[]={12,11,13,6,7,5};
//        MergeSort ob=new MergeSort();
//        ob.sort(arr,0,arr.length-1);
//        ob.printarray(arr);
//
//    }
//}
//public class MergeSort {
//
//    // Merge two parts of the array
//    void merge(int arr[], int left, int mid, int right) {
//        int i = left;      // starting index of left part
//        int j = mid + 1;   // starting index of right part
//        int k = 0;         // index for temp array
//        int temp[] = new int[right - left + 1]; // temporary array
//
//        // Compare elements from both parts and put smaller one in temp[]
//        while (i <= mid && j <= right) {
//            if (arr[i] <= arr[j]) {
//                temp[k] = arr[i];
//                i++;
//            } else {
//                temp[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements from left part (if any)
//        while (i <= mid) {
//            temp[k] = arr[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements from right part (if any)
//        while (j <= right) {
//            temp[k] = arr[j];
//            j++;
//            k++;
//        }
//
//        // Copy temp[] back to arr[]
//        for (int x = 0; x < temp.length; x++) {
//            arr[left + x] = temp[x];
//        }
//    }
//
//    // Divide array into two halves and call merge
//    void sort(int arr[], int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;   // find middle
//            sort(arr, left, mid);           // sort left half
//            sort(arr, mid + 1, right);      // sort right half
//            merge(arr, left, mid, right);   // merge both halves
//        }
//    }
//
//    // Print the array
//    void printArray(int arr[]) {
//        for (int num : arr)
//            System.out.print(num + " ");
//        System.out.println();
//    }
//
//    // Main function
//    public static void main(String[] args) {
//        int arr[] = {12, 11, 13, 5, 6, 7};
//
//        System.out.println("Before sorting:");
//        MergeSort ob = new MergeSort();
//        ob.printArray(arr);
//
//        ob.sort(arr, 0, arr.length - 1);
//
//        System.out.println("After sorting:");
//        ob.printArray(arr);
//    }
//}
