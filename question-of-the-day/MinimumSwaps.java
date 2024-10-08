class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int openNeeded = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                balance++;
            } else {  // ch == ']'
                balance--;
            }

            // If balance is negative, we need an opening bracket
            if (balance < 0) {
                openNeeded++;
                balance = 0;  // Reset balance since we "conceptually" swap
            }
        }

        // Each swap fixes 2 unbalanced brackets
        return (openNeeded + 1) / 2;
    }
}
