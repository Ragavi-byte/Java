import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number of arrays");
        int n= input.nextInt();
        int a[]=new int[3];
        System.out.println("enter the array elements");
        for(int i=0;i<3;i++) {
            a[i] = input.nextInt();
        }
        int largest=a[0];
        int smallest=a[0];
        for(int i=0;i<3;i++) {
            if(a[i]>largest){
                largest=a[i];
            }
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("The largest array is: "+largest);
        System.out.println("The smallest array is: "+smallest);

    }
}
