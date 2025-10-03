import java.util.Scanner;
class Main{
    public static void main(String[]args){
        for(int i=10;i>=1;i--){
            System.out.println(i+"*5="+i*5);
        }
    }
}
//
class Table{
    public static void main(String[]args){
        for(int i=1;i<=10;i++) {
            System.out.println(i + "*20=" + i * 20);
        }
    }
}
//
class palindrome
{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        {
            System.out.println("enter a name");
        }String name=scanner.nextLine();

        StringBuilder sb= new StringBuilder(name);

//        String str= sb.reverse().toString();


//        System.out.println(str);

         if((name).equals(sb.reverse().toString())){
            System.out.println("it is palindrome");
         }
            else{
                System.out.println("not a palindrome");
            }

    }
}