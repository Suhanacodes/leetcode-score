class Solution {
    public int missingNumber(int[] nums){
        long n=nums.length;
        long expectedSum=n*(n+1)/2;
        long actualSum=0;
        for(int value:nums){
        actualSum+=value;
        }
        return (int)(expectedSum-actualSum);
        }
        }