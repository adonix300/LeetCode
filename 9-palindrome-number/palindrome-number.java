class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        builder.reverse();
        return (String.valueOf(x).equals(builder.toString()));
    }
}