public class A {
    public static void main(String[] args) {
        int[] a = new int[4];

        for (int i = 1000; i < 10000; i++) {
            // 9999
            a[0] = i / 1000;
            a[1] = (i / 100) % 10;
            a[2] = (i % 100) / 10;
            a[3] = i % 10;

            if (a[0] == a[3] && a[1] == a[2])
                System.out.println(i);
        }

    }
}