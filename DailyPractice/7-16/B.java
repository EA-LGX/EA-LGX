import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int dValue = 0;

        for (int i = 0; i < t.length(); i++)
            dValue = dValue + t.charAt(i);

        for (int i = 0; i < s.length(); i++)
            dValue = dValue - s.charAt(i);

        System.out.println((char) (dValue));
        scanner.close();
    }
}