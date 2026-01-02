class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Sets to track digits in each row, column, and box
        java.util.Set<Character>[] rows = new java.util.HashSet[9];
        java.util.Set<Character>[] cols = new java.util.HashSet[9];
        java.util.Set<Character>[] boxes = new java.util.HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new java.util.HashSet<>();
            cols[i] = new java.util.HashSet<>();
            boxes[i] = new java.util.HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                if (val == '.') {
                    continue; // ignore empty cells
                }

                int boxIndex = (r / 3) * 3 + (c / 3);

                // If digit already seen in row, column, or box -> invalid
                if (rows[r].contains(val) || cols[c].contains(val) || boxes[boxIndex].contains(val)) {
                    return false;
                }

                rows[r].add(val);
                cols[c].add(val);
                boxes[boxIndex].add(val);
            }
        }

        return true; // no conflicts found
    }
}
