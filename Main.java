public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int number1[] = {100, 4, 200, 1, 3, 2};
        System.out.println("Input: nums = [100, 4, 200, 1, 3, 2] \nOutput: " + solution.longestConsecutive(number1));

        // Example 2
        int number2[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Input: nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1] \nOutput: " + solution.longestConsecutive(number2));

        // Test Case 1
        int nums1[] = {1, 2, 3, 4, 5};
        System.out.println("1. nums1 = [1, 2, 3, 4, 5], output = " + solution.longestConsecutive(nums1));

        // Test Case 2
        int nums2[] = {0};
        System.out.println("2. nums2 = [0], output = " + solution.longestConsecutive(nums2));

        // Test Case 3
        int nums3[] = {5, 5, 5, 5};
        System.out.println("3. nums3 = [5, 5, 5, 5], output = " + solution.longestConsecutive(nums3));

        // Test Case 4
        int nums4[] = {0, -1, 9, -3, -2, 2, 1, 5};
        System.out.println("4. nums4 = [0, -1, 9, -3, -2, 2, 1, 5], output = " + solution.longestConsecutive(nums4));

        // Test Case 5
        int nums5[] = {10, 20, 30, 40, 50};
        System.out.println("5. nums5 = [10, 20, 30, 40, 50], output = " + solution.longestConsecutive(nums5));

        // Test Case 6
        int nums6[] = {1, 9, 3, 10, 4, 20, 2};
        System.out.println("6. nums1 = [1, 9, 3, 10, 4, 20, 2], output = " + solution.longestConsecutive(nums6));

        // Test Case 7
        int nums7[] = {1, 3, 5, 2, 4, 6, 7, 9, 8, 12, 13, 10, 11};
        System.out.println("7. nums7 = [1, 3, 5, 2, 4, 6, 7, 9, 8, 12, 13, 10, 11], output = " + solution.longestConsecutive(nums7));
    }
}