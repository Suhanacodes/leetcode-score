class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        long current=1;
        result.add(1);
        for(int i=1;i<=rowIndex;i++){
            current=current*(rowIndex-i+1);
            current=current/(i);
            result.add((int)current);
        }
        return result;

    
        
    }
}