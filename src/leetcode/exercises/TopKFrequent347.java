package leetcode.exercises;

import java.util.*;
import java.util.stream.Collectors;
public class TopKFrequent347 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int [] nums = new int[] {4,1,-1,2,-1,2,3};
		topKFrequent(nums,2);

	}

	public static int[] topKFrequent(int[] nums, int k) {
		if (nums.length == 0) return nums;

		Map<Integer, Integer> map = new TreeMap<>();
		Set<Integer> duplicate = new HashSet<>();


		for (int num : nums) {
			if (duplicate.add(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}

		Map<Integer, Integer> tmpMap = new TreeMap<>();
		int i = 0;

        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

		for (Integer key : sortedMap.keySet()) {
			Integer value = sortedMap.get(key);
			if (i < k) {
				tmpMap.put(key, value);
				i++;
			} else {
				tmpMap.remove(key);
			}
		}

		int[] response = new int[tmpMap.size()];
		int j = 0;
		for (Integer print : tmpMap.keySet()) {
			response[j] = print;
			j++;
		}

		return response;

	}

}
