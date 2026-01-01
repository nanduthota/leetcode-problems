class Solution {
    public String countAndSay(int n) {
        String result = "1";  // base case
        
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }
            
            // append the last run
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        
        return result;
    }
    
    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countAndSay(1)); // Output: "1"
        System.out.println(sol.countAndSay(4)); // Output: "1211"
        System.out.println(sol.countAndSay(6)); // Output: "312211"
    }
}