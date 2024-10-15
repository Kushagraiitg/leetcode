class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Count the frequency of each task
        Map<Character, Integer> taskCount = new HashMap<>();
        for (char task : tasks) {
            taskCount.put(task, taskCount.getOrDefault(task, 0) + 1);
        }

        // Create a max-heap based on the frequencies
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(taskCount.values());

        int intervals = 0;

        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int k = n + 1; // Tasks to execute or idle slots

            // Process up to n + 1 tasks (to account for idle time)
            for (int i = 0; i < k; i++) {
                if (!maxHeap.isEmpty()) {
                    temp.add(maxHeap.poll()); // Get the most frequent task
                }
            }

            // After processing, we need to re-add tasks back to the heap
            for (int count : temp) {
                if (count > 1) {
                    maxHeap.add(count - 1); // Decrease the count and add back to the heap
                }
            }

            // If the heap is empty, we've finished all tasks
            intervals += maxHeap.isEmpty() ? temp.size() : k; // Add idle time if no tasks left
        }

        return intervals;
    }

}
/**
* create array of 26 chars
* with object(count, lastStarted)
* Run time and increase until all depleted
* continue if all blocked
* keep count of minimum unblock and skip the gap
 */
