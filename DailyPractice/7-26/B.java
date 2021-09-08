import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("n=");
        int n=scanner.nextInt();

        System.out.print("nums=");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        
        System.out.print("target=");
        int target=scanner.nextInt();

        int mid=n/2;       //�м��±�
        int left=0;        //���±�
        int right=n-1;     //���±�

        while(true){
            if(nums[mid]>target){  //mid ��target�����
                right=mid;  //���±����  
                mid=(mid+left)/2;    //mid����
            }else if(nums[mid]<target){
                left=mid;
                mid=(mid+right/2);
            }else if(nums[mid]==target){
                System.out.println(mid);
                break;
            }else{
                break;
            }
        }
    }
}
