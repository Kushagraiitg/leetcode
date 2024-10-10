class Solution {
    public int maxWidthRamp(int[] A) {
        int n = A.length;
        Stack<Integer> stack = new Stack<>();

        // Step 1: Build a stack with the indices of the minimum elements
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || A[stack.peek()] > A[i]) {
                stack.push(i);
            }
        }

        int maxWidth = 0;

        // Step 2: Iterate from the end of the array to find maximum width
        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }

        return maxWidth;
    }
}

/**
* [9,2,9,9,9,9,4,0,2,1]
 */
