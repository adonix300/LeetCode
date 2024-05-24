class Solution {
    public boolean isPalindrome(int x) {
        int number = 0;
        int y = x;
        while (y > 0) {
            number = number * 10 + y % 10;
            y /= 10;
        }
        return number == x;
    }
}