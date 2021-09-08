import java.util.Scanner;

class B{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    if(2*i+2*j+k==n){
                        System.out.println(""+i+j+k+j+i);
                    }
                }
            }
        }
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    if(2*i+2*j+2*k==n){
                        System.out.println(""+i+j+k+k+j+i);
                    }
                }
            }
        }

        scanner.close();
    }
}