package leetcode.easy;

class SingleNumber136 {

    public int singleNumber(int[] nums) {

        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;

        //solution 1
//         Map<Integer, Integer> map = new HashMap<>();

//         for(int i : nums){
//             if(map.get(i)!=null){
//                 map.put(i,map.get(i)+1);
//             }else{
//                 map.put(i,1);
//             }
//         }

//         return map.entrySet().stream()
//           .filter(e -> e.getValue().equals(1))
//           .map(Map.Entry::getKey)
//           .findFirst()
//           .orElse(0);

        //solution 2
        // for(int i=1; i < nums.length; i++){
        //     nums[0]^=nums[i];
        // }
        // return nums[0];

        //solution 3
//        return Arrays.stream(nums).parallel().reduce((a, b) -> a^b).orElse(0);

    }
}
