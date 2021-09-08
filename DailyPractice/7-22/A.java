import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        for (int i = 1; i < n; ++i) {
            int temp = a[i];
            int j = 0;
            for (j = i-1; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = temp;
        }

        int m=scanner.nextInt();
        int[] l=new int[m];
        int[] r=new int[m];
        int[] k=new int[m];
        for(int i=0;i<m;i++){
            l[i]=scanner.nextInt();
            r[i]=scanner.nextInt();
            k[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                if(r[i]==a[j]){
                    System.out.println(a[j-k[i]+1]);
                }
            }
        }

        scanner.close();
    }
}
