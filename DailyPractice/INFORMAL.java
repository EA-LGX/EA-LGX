import java.util.Scanner;

public class INFORMAL {
    public static void main(String[] args) {
        String[] arr=new String[51];
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        int nameUnicode=0;
        int nameValue;
        for(int i=0;i<name.length();i++){
            nameUnicode=nameUnicode+name.charAt(i);
        }
        nameValue=nameUnicode%51;
        System.out.println(nameValue);


        scanner.close();
    }
}
