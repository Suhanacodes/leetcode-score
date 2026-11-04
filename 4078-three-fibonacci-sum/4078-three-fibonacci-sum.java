class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n==2) return true;
        if(n<2) return false;
        int a=0,b=1,c=1;
        while(a+b+c<n){
            int temp=b+c;
            a=b;
            b=c;
            c=temp;
        }
        return (a+b+c)==n;

        }
        
    }