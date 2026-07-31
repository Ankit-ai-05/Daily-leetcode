class Solution {
    public int findNumbers(int[] nums) {
        int totalevenNumber = 0;
        for(int num : nums){
            int digit = 0;
            int temp = num;

            while(temp>0){
                temp = temp /10;
                digit++;
            }
            if(digit % 2==0){
                totalevenNumber++;
            }
        }
        return totalevenNumber;
        
    }
}