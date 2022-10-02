import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList();
        List<List<Integer>> arr = new ArrayList();
        for(int i=0 ; i<numRows ; i++){
            List<Integer> row = new ArrayList();
            for(int j=0 ; j<i+1 ; j++){
                if(j==0){
                    row.add(1);
                }
                else if(i==j){
                    row.add(1);
                }
                else{
                    row.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
                }
            }
            arr.add(row);
        }
        return arr ;
    }
}