package leetcode.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        //time O(9)
        for (int i = 0; i < board.length; i++) {
            boolean valid = validNine(board[i]);
            if (!valid) return false;
        }

        //space O(9)
        char[] cells = new char[9];

        //time O(9*9)
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                cells[j] = board[j][i];
            }

            boolean valid = validNine(cells);
            if (!valid) return false;
        }

        int i = 0, j = 0;
        //time O(9*9)
        for (; i < board.length; i++) {
            for (; j < board[i].length; j++) {
                cells[(i + j) % 9] = board[i][j];
                if ((i + j+1) % 9 == 0) {
//                    System.out.println(Arrays.deepToString(board));

//                    System.out.println("cells: '+ Arrays.toString(cells));
                    boolean valid = validNine(cells);
                    if (!valid) return false;
                }
                if((j+1) % 3 == 0) break;
            }
        }

        return true;
    }

    boolean validNine(char[] line) {
        Set<Character> set = new HashSet<>();
        for(char c: line){
            if(!set.add(c)) return false;
        }

        return true;
    }

    boolean validNine1(char[] line) {
        int[] freq = new int[9];

        for (char c : line) {
            if (c != '.')
                freq[c - '1']++;
        }

        for (int n : freq) {
            if (n > 1) return false;
        }

        return true;
    }


    @Test
    public void test1() {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};


        assertTrue(isValidSudoku(board));

    }


    @Test
    public void test2(){
        char[][] board = {{'.','.','.','.','5','.','.','1','.'},{'.','4','.','3','.','.','.','.','.'},{'.','.','.','.','.','3','.','.','1'},{'8','.','.','.','.','.','.','2','.'},{'.','.','2','.','7','.','.','.','.'},{'.','1','5','.','.','.','.','.','.'},{'.','.','.','.','.','2','.','.','.'},{'.','2','.','9','.','.','.','.','.'},{'.','.','4','.','.','.','.','.','.'}};
        assertFalse(isValidSudoku(board));

    }
}


