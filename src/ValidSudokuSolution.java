import java.util.HashSet;

public class ValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        // Use hashset to record the status
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] columns = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        //We will iterate through the loop to initialize these hashsets
        for (int i = 0; i < N; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // internal loop
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                // Check if the position is filled with number
                if (val == '.') {
                    continue;
                }

                // Check the row
                if (rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);

                // Check the column
                if (columns[c].contains(val)) {
                    return false;
                }
                columns[c].add(val);

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx].contains(val)) {
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}
