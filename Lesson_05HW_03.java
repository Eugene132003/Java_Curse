/*
4. **На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
public class Lesson_05HW_03 {
    public static void main(String[] args) {
        int[] queens = new int[8];
        findPosition(0, queens);

        System.out.println("Доска с ферзями:");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("Q");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    private static boolean findPosition(int row, int[] queens) {
        if (row == 8) {
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                queens[row] = col;
                if (findPosition(row + 1, queens)) {
                    return true;
                }
            }
        }
        return false;
    }
}