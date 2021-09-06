class Solution {
    public int majorityElement(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            map.put(num, map.getOrDefault(num, 0)+1);

            if (map.get(num) > nums.length/2) {
                answer = num;
                break;
            }
        }
        
        return answer;
    }
}