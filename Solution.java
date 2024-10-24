import java.util.HashMap;

public class Solution {

    public int longestConsecutive(int[] nums){
        HashMap<Integer, Boolean> numMap = new HashMap<>();
        for(int num : nums){
            numMap.put(num, true);  // Mark the number as present
        }

        int longestStreak = 0;

        for(int num : numMap.keySet()){
            // Check if it's the beginning of the squence 
            if(!numMap.containsKey(num -1)){
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the squence
                while(numMap.containsKey(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}