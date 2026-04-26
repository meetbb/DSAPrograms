public class ValidPalindromeSolution {
    // We will solve this problem using Two Pointer solution
    // 1, 2, 3, 4
    public boolean isValidPalindrome(String s) {
        // First of all, we will create two pointers.
        int left = 0;
        int right = s.length() - 1;

        // Now iterate through the array until the left pointer is smaller than right
        while(left<right) {
            // Skip the character if you find any alphanumeric character
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
