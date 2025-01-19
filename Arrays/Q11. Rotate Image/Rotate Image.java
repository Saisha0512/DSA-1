class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //for the first input case, our matrix will now be:
        //[[1,4,7],[2,5,8],[3,6,9]]
        //Values before the middle row and values after the middle row should be swapped to give:
        //[[7,4,1],[8,5,2],[9,6,3]], which is the required output
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}
