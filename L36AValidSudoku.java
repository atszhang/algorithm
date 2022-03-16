import java.util.HashSet;

public class L36AValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) { // checks for rows and columns
            HashSet<Character> vertical = new HashSet<>();
            HashSet<Character> horizontal = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char vTemp = board[j][i];
                char hTemp = board[i][j];
                if (vTemp != '.') {
                    if (vertical.contains(vTemp)) {
                        return false;
                    }
                    vertical.add(vTemp);
                }
                if (hTemp != '.') {
                    if (horizontal.contains(hTemp)) {
                        return false;
                    } else {
                        horizontal.add(hTemp);
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) { // row block
            for (int j = 0; j < 3; j++) { // column block
                HashSet<Character> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char temp = board[k + i * 3][l + j * 3];
                        if (temp != '.') {
                            if (set.contains(temp)) {
                                return false;
                            }
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return true;
    }
}
