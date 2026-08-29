class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
                }
            else{
                oddcount++;
        }
       
    }
    return new int[]{oddcount,evencount};
}
}