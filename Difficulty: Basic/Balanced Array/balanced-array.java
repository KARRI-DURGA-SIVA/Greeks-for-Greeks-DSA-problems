class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n=arr.size();
        int left=0;
        int right=0;
        for(int i=0;i<n/2;i++){
            left+=arr.get(i);
        }
        for(int j=n/2;j<n;j++){
            right+=arr.get(j);
        }
        return Math.abs(left-right);
    }
    
};