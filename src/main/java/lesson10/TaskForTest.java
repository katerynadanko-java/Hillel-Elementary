package lesson10;

import java.util.HashSet;
import java.util.Set;

public class TaskForTest {

        public int[] twoSum(int[] nums, int target) {
            Set <Integer>set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                int difference = target - nums[i];
                if(!set.contains(difference)) {
                    set.add(nums[i]);
                    continue;
                }
                for(int j = 0; j < nums.length; j++){
                    if (nums[j] == difference){
                        return new int[] {j, i};
                    }
                }
            }
            return new int[0];
        }
}

