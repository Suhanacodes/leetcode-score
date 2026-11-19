class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            int result=s.charAt(i);
            if(result==' '){
                if(count>0){
                    break;
                }
            }
                else{
                    count++;
                }

            }
            return count;

        }
        
}