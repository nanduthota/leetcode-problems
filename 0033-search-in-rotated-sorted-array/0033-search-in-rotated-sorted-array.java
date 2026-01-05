class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target lies in the left sorted half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else { // Otherwise in the right half
                    left = mid + 1;
                }
            } else { // Right half is sorted
                // Target lies in the right sorted half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else { // Otherwise in the left half
                    right = mid - 1;
                }
            }
        }

        return -1; // Not found
    }
}
