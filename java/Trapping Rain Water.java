class Solution {
    public int trap(int[] height) {
        int left = 0; 
        int right = height.length - 1;
        int ans = 0; 
        int lMax = 0, rMax = 0;
        while(left <= right){
            lMax = Math.max(height[left], lMax);
            rMax = Math.max(height[right], rMax);			  
            
            if (lMax < rMax){
                ans += lMax - height[left++];
            }
            else {
                ans += rMax - height[right--];
            }
        }
        return ans;
    }
}