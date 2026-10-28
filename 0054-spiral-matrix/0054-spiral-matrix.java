class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(matrix.length==0 || matrix[0].length==0){
            return new ArrayList<>();
        }
        List<Integer>order=new ArrayList<>();
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;
        while(top<=bottom && left<=right){
            for(int col=left;col<=right;col++){
                order.add(matrix[top][col]);
            }
            top++;
            for(int row=top;row<=bottom;row++){
                order.add(matrix[row][right]);
            }
            right--;
            if(top<=bottom){
                for(int col=right;col>=left;col--){
                    order.add(matrix[bottom][col]);
                }
                bottom--;
            }
            if(left<=right){
                for(int row=bottom;row>=top;row--){
                    order.add(matrix[row][left]);
                }
                left++;
            }
        }
        return order;
        
    }
}