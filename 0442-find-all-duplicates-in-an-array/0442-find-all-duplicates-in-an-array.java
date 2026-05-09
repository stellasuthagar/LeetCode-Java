class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        // List<Integer> l = new ArrayList<>();

        // int i = 0;
        // int j = nums.length - 1;
        // while(i < nums.length) 
        // {
        //     if(i == j) 
        //     {
        //         i++;
        //         j = nums.length - 1;
        //     }
        //     else if(nums[i] == nums[j]) {

        //         if(!l.contains(nums[i])) {
        //             l.add(nums[i]);
        //         }

        //         i++;
        //         j = nums.length - 1;
        //     }
        //     else {
        //         j--;
        //     }
        // }

        // return l;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                l.add(key);
            }
        }

        return l;

    }

}