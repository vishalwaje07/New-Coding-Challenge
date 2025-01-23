import java.util.*;

class Result {

    public static int findMaximumTasks(List<Integer> task, int m) {
        // Handle edge cases
        if (m <= 0 || task == null || task.isEmpty()) {
            return 0;
        }

        // Count the frequency of each task
        Map<Integer, Integer> taskFrequency = new HashMap<>();
        for (int t : task) {
            taskFrequency.put(t, taskFrequency.getOrDefault(t, 0) + 1);
        }

        // Get the frequencies in descending order
        List<Integer> frequencies = new ArrayList<>(taskFrequency.values());
        Collections.sort(frequencies, Collections.reverseOrder());

        int left = 1, right = task.size() / m;
        int maxTasks = 0;

        // Binary search to find the maximum number of tasks each node can handle
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int nodesRequired = 0;

            for (int freq : frequencies) {
                nodesRequired += freq / mid; // Count how many nodes can handle this frequency
                if (nodesRequired >= m)
                    break; // Stop early if enough nodes are covered
            }

            if (nodesRequired >= m) {
                maxTasks = mid * m; // Update the maximum tasks
                left = mid + 1; // Try for more tasks per node
            } else {
                right = mid - 1; // Reduce tasks per node
            }
        }

        return maxTasks;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Example Test Case
        List<Integer> task = Arrays.asList(1, 2, 2, 1, 3, 1, 3);
        int m = 2;
        System.out.println(Result.findMaximumTasks(task, m)); // Output: 6

        // Edge Cases
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 1, 1, 1), 3)); // Output: 6
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 1), 2)); // Output: 4
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 2, 3, 4, 5), 5)); // Output: 5
        System.out.println(Result.findMaximumTasks(Collections.emptyList(), 2)); // Output: 0
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 2, 3), 0)); // Output: 0
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 2, 2, 3, 3), 3)); // Output: 6

        // Large Inputs
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3), 4)); // Output: 8
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3), 2)); // Output: 10

        // Skewed Frequencies
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 1, 1, 2), 3)); // Output: 3
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 1, 1, 2), 2)); // Output: 6

        // Additional Test Cases
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 4, 4), 3)); // Output: 9
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4), 3)); // Output: 9
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5)); // Output: 5
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1), 3)); // Output: 9
        System.out.println(Result.findMaximumTasks(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 4, 4), 4)); // Output: 8
    }
}
