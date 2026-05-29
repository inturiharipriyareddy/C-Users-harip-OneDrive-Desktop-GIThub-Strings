import java.util.Arrays;
public ArrayProductExceptSelf{
public Static int[] leetcode238(int[] nums){
int n=nums.length;
int product =1;
int[] res=new int[n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i!=j)
{
product=product*nums[j];
}
}
res[i]=product;
}
return res;
}



public static void main(Strings args[])
{
int[] nums=new int{1,2,3,4};
int[] variable=leetcode238(nums);
}
}