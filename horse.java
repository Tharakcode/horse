public class horse {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int row = 0, col = 0;
        for (int i = 1; i <= 25; i++) {
            matrix[row][col] = i; 
            int nextRow = (row + 2) % 5 + (i % 2 == 0 ? 1 : -1);
            int nextCol = (col + 1) % 5 + (i % 2 == 0 ? -2 : 2);
            row = nextRow; 
            col = nextCol; 
        }
        for (int[] rowArray : matrix) {
            for (int val : rowArray) {
                System.out.printf("%2d ", val); 
            }
            System.out.println();
        }
    }
}
