import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] map = new int[125][125];
        int N = 5 + 4 * n;
        for (int i = N / 2 - 1; i <= N / 2 + 3; i++)
            map[N / 2 + 1][i] = map[i][N / 2 + 1] = 1;
            for(int i=1;i<=n;i++)
            {
                int x=2*i+1,y=2*i+1;
                map[x][y]=map[x][y-1]=map[x-1][y]=1; 
      
                y=N-2*i;
                map[x][y]=map[x][y+1]=map[x-1][y]=1;
       
                x=N-2*i;
                map[x][y]=map[x][y+1]=map[x+1][y]=1;
     
                y=2*i+1;
                map[x][y]=map[x][y-1]=map[x+1][y]=1;
                
                for(int j=2*i+1;j<=N-2*i;j++)
                    map[2*i-1][j]=map[j][N-2*(i-1)]=map[N-2*(i-1)][j]=map[j][2*i-1]=1; 
            }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++)
                if (map[i][j]==1) {
                    System.out.print("$");
                } else {
                    System.out.print(".");
                }
            System.out.println();
        }

        scanner.close();
    }
}
