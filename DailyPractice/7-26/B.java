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

        int mid=n/2;       //中间下标
        int left=0;        //左下标
        int right=n-1;     //右下标

        while(true){
            if(nums[mid]>target){  //mid 在target的左边
                right=mid;  //右下标更新  
                mid=(mid+left)/2;    //mid更新
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
