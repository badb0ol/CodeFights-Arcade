// In the popular Minesweeper game you have a board with some mines and those cells
// that don't contain a mine have a number in it that indicates the total number of
// mines in the neighboring cells. Starting off with some arrangement of mines we want
// to create a Minesweeper game setup.

int[][] minesweeper(boolean[][] matrix) {
    int[][] mines = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int ii = Math.max(0, i -1); ii <= Math.min(i + 1, matrix.length -1) ; ii++) {
                for (int jj = Math.max(0,j -1); jj <= Math.min(j + 1, matrix[0].length -1); jj++) {
                    if (matrix[ii][jj] && (i!=ii || jj!=j)) {
                        mines[i][j]++;
                    }
                }
            }
        }
    }
   return mines;
}
