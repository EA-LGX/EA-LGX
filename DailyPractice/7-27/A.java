import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if((a*b)%c==0){
            System.out.println(a*b);
        }else if((a*c)%b==0){
            System.out.println(a*c);
        }else if((b*c)%a==0){
            System.out.println(b*c);
        }else{
            System.out.println(a*b*c);
        }
        scanner.close();
    }
}
