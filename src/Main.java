//TIP To <b>Run</b> code, press <shortcut actionId='Run'/> or
// click the <icon src='AllIcons.Actions.Execute'/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ValidSudokuSolution solution = new ValidSudokuSolution();
//        char[][] board = {
//                {'5','3','.','.','7','.','.','.','.'},
//        {'6','.','.','1','9','5','.','.','.'},
//        {'.','9','8','.','.','.','.','6','.'},
//        {'8','.','.','.','6','.','.','.','3'},
//        {'4','.','.','8','.','3','.','.','1'},
//        {'7','.','.','.','2','.','.','.','6'},
//        {'.','6','.','.','.','.','2','8','.'},
//        {'.','.','.','4','1','9','.','.','5'},
//        {'.','.','.','.','8','.','.','7','9'}
//        };
//        System.out.println("Is the matrix valid: "+ solution.isValidSudoku(board));
        int[] sequence = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        LongestConsecutiveSubSequenceSolution solution = new LongestConsecutiveSubSequenceSolution();
        System.out.println("Longest SubSequence value is: "+solution.longestSubSequence(sequence));
    }
}