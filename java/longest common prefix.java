class Solution {
    public String longestCommonPrefix(String[] strs) {
        Map<String, Integer> prefixCounts = new HashMap<String, Integer>();
        for(String prefix : strs){
            StringBuilder building = new StringBuilder();
            for(char c : prefix.toCharArray()){
                building.append(c);
                prefixCounts.put(building.toString(), prefixCounts.getOrDefault(building.toString(), 0) + 1);
            }
        }
        int desiredSize = strs.length;
        int longest = 0;
        String toReturn = "";
        for(Map.Entry<String, Integer> prefixCount : prefixCounts.entrySet()){
            if(prefixCount.getValue().equals(desiredSize)){
                int stringSize = prefixCount.getKey().length();
                if(stringSize > longest){
                    longest = stringSize;
                    toReturn  = prefixCount.getKey();
                }
            }
        }
        return toReturn;
    }
}