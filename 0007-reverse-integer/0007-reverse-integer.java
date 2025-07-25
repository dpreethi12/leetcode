class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow before multiplying
            if (reversed > Integer.MAX_VALUE / 10 ) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}
