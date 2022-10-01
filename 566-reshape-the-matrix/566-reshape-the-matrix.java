class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result= new int[r][c];
        int i =  mat.length;
        int j = mat[0].length ;
        if (i*j != r*c) return mat;
        if (r==i && c==j) return mat;
        int n_index = 0;
        int o_index = 0;
        while(n_index <r*c && o_index<i*j){
            result[n_index/c][n_index%c]=mat[o_index/j][o_index%j];
            n_index++;
            o_index++;
        }
        return result;
    }
}