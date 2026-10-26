import java.util.*;
class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxRight=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxRight){
                int temp=maxRight;
                maxRight=arr[i];
                arr[i]=temp;
            }
            else{
                arr[i]=maxRight;
            }

        }
        return arr;
    }
}