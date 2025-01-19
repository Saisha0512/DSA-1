//ran 100% testcases on leetcode
class Solution {
    public int triangularSum(int[] nums) {
        int summ=sum(nums,nums.length);
        return summ%10;
    }

    int sum(int a[],int n)
    {
        if(n==1)
        return a[0];
        int b[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            b[i]=(a[i]+a[i+1])%10;
        }
        return sum(b,n-1);
    }
}
