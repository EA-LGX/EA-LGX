import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i < n && i < 26; i++) {
            for (int j = 0; j < m && j < 26; j++) {
                if ('A' + i - j > 'A')
                    System.out.print((char) ('A' + i - j));
                else
                    System.out.print((char) ('A' + j - i));
            }
            System.out.println();
        }
        scanner.close();
    }
}