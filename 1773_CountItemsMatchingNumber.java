class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        if( ruleKey.equals("type")){
            for(int i =0; i < items.size(); i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
        } else if( ruleKey.equals("color")){
            for(int i = 0; i < items.size(); i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
        }else if( ruleKey.equals("name")){
            for(int i =0; i < items.size(); i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
// 2nd Solution 
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans =0 ;
        int index =0;
        if( ruleKey.equals("type")) index =0;
        else if( ruleKey.equals("color")) index =1;
        else {
            index =2;
        }
        for( int i =0; i < items.size(); i++){
            if( items.get(i).get(index).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
    
}
