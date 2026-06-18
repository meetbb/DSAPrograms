public class NumOfPalindromeSubstrings {
    public int countNumOfPalindromeSubStrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            maxCount = expand(s, i, i, maxCount);
            maxCount = expand(s, i, i + 1, maxCount);
        }
        return maxCount;
    }

    private int expand(String s, int left, int right, int count) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}
