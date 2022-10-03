class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                arr.add(matrix[i][j]);
            }
        }
        List copy = new ArrayList(arr);
        Collections.sort(copy);
        boolean yesOrNo= copy.equals(arr);
        if(yesOrNo==true && arr.contains(target)){
            return true;
        }
        return false;
    }
}