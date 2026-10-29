class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int n=0;n<numRows;n++){
            List<Integer> currentRow=new ArrayList<>();
            long current=1;
            currentRow.add(1);
            for(int i=1;i<=n;i++){
                current=current*(n-i+1)/i;
                currentRow.add((int)current);
            }
            triangle.add(currentRow);
        }
        return triangle;
        
    }
}