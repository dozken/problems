package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements347 {

    //space O(n+n) => O(n)
    //time O(n+n) => O(n)
    //where n is length of nums array
    public int[] topKFrequent(int[] nums, int k) {
        int []res = new int[k];

        // space O(n)
        // num, freq
        Map<Integer, Integer> map = new HashMap<>();

        // time O(n)
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }


        // space O(n)
        // map <freq, num>
        Map<Integer, List<Integer>> freqNum = new HashMap<>();

        // time O(n)
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer freq = entry.getValue();
            List<Integer> numList = freqNum.getOrDefault(freq, new ArrayList());
            numList.add(entry.getKey());
            freqNum.put(freq, numList);
        }

        // time O(n)
        for(int i = nums.length, j = 0; i >= 0; i--){
            if(freqNum.containsKey(i)){
                for(Integer n : freqNum.get(i)){
                    res[j] = n;
                    j++;

                    if(j == k) return res;
                }
            }
        }
        return res;
    }

    public int[] topKFrequent1(int[] nums, int k) {
        int []res = new int[k];
        if(k == 1) return nums;

        // space O(n)
        Map<Integer, Integer> map = new HashMap<>();

        // time O(n)
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }


        // space O(n)
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((x,y) -> y.getValue() - x.getValue());

        // time O(nlogn)
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }




        // time O(nlogn)
        for(int i = 0; i < k; i++){
            res[i] = maxHeap.poll().getKey();
        }

        return res;

    }

    public int[] topKFrequent2(int[] nums, int k) {
        int []res = new int[k];
        // space O(n)
        Map<Integer, Integer> map = new HashMap<>();

        // time O(n)
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        // space O(n)
        List<Integer> []store = new ArrayList[nums.length+1];


        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(store[entry.getValue()] == null){
                store[entry.getValue()] = new ArrayList();
            }
            store[entry.getValue()].add(entry.getKey());
        }

        System.out.println(Arrays.toString(store));

        for(int i = store.length - 1, j = 0; i >= 0 && j < k; i--){
            if(store[i] != null){
                for(Integer n: store[i]){
                    res[j] = n;
                    j++;
                    if(j==k) return res;
                }
            }
        }
        return res;
    }


}
