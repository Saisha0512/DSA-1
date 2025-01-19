class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++){
            nums[i] += (nums[nums[i]] % n) * n;
            //Here we are storing both the og and the new val in nums[i];
            //new value of nums[i] = (nums[nums[i]]%n)*n
            //nums[i] = original val + (new val*n)
            //Therefore, nums[i]%=n will give the original value
        }

        for (int i = 0; i < n; i++){
            nums[i] /= n;
        }
        return nums;
    }
}
