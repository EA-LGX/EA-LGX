import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextInt();

        if(n<3){
            System.out.println(n);
        }else if(n%2!=0){
            System.out.println(n*(n-1)*(n-2));
        }else if(n%3!=0){
            System.out.println(n*(n-1)*(n-3));
        }else{
            System.out.println((n-1)*(n-2)*(n-3));
        }
        
        scanner.close();
    }
}
