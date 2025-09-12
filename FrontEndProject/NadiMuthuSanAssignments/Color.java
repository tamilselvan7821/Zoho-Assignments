import java.util.Arrays;
public class Color{
    public static int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int []front=new int[len];
        int []back=new int[len];
        int temp=1,tem=1,j=len-1;
        for(int i=0;i<len;i++){
            temp*=nums[i];
            front[i]=temp;
            tem*=nums[j];
            back[j--]=tem;
        }
        System.out.println(Arrays.toString(front));
        System.out.println(Arrays.toString(back));
        for(int i=0;i<len;i++){
            if(i==0)nums[i]=back[i+1];
            else if(i==len-1)nums[i]=front[i-1];
            else nums[i]=back[i+1]*front[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.print(Arrays.toString(productExceptSelf(arr)));
    }
}