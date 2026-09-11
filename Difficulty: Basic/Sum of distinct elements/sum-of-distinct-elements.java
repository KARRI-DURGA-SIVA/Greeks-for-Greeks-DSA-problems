class Solution {
    int findSum(int[] arr) {
        // code here
        int sum=0;
        HashSet<Integer> num=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(num.add(arr[i])){
                 sum+=arr[i];
            }
           
           }
       return sum;
    }
}