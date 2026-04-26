import java.util.HashSet;

public class LongestConsecutiveSubSequenceSolution {
    public int longestSubSequence(int[] subsequence) {
        if (subsequence.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (int j : subsequence) {
            numSet.add(j);
        }
        int longestSub = 1;

        for (int num: numSet) {
            if (numSet.contains(num - 1)) {
                continue;
            } else {
                int currentNum = num;
                int currentSub = 1;
                while(numSet.contains(currentNum+1)) {
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(currentSub, longestSub);
            }
        }
        return longestSub;
    }
}
