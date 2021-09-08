import java.util.Arrays;
import java.util.Scanner;
class A {
    private static int[][] arr_node = new int[100000][2];
    private static int[][] arr_route = new int[100000][100];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Arrays.fill(arr_node, 0);
        for(int i = 1; i <= n; i++){
            arr_node[i][1] = sc.nextInt();
        }
        //Arrays.fill(arr_route, 0);
        int start,end,j,k;
        for(int i = 0; i < n - 1; i++){
            start = sc.nextInt();
            end = sc.nextInt();
            j = 0;
            k = 0;
            while(arr_route[start][j] != 0){
                j++;
            }
            arr_route[start][j] = end;
            while(arr_route[end][k] != 0){
                k++;
            }
            arr_route[end][k] = start;

        }
        sc.close();
        
        dfs(1,0);
        System.out.println(fmax(arr_node[1][0],arr_node[1][1]));
    }
    private static void dfs(int x, int f){
        int i,k;
        k = 0;
        while((i = arr_route[x][k]) != 0){ 
            k++;
            if(i != f){ 
                dfs(i,x);
                arr_node[x][1] += arr_node[i][0]; 
                arr_node[x][0] += fmax(arr_node[i][0],arr_node[i][1]);
                
            }
        }
    }
    private static int fmax(int a, int b){
        return a > b ? a : b;
    }
}