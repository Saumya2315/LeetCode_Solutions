class Solution {
    int nodeIdx;
    public TreeNode bstFromPreorder(int[] preOrder) {
        if(preOrder == null){
            return null;
        }
        nodeIdx =0;
        return bstHelper(preOrder , Integer.MIN_VALUE  , Integer.MAX_VALUE);
    }
    private TreeNode bstHelper(int[] preOrder , int start , int end){
        if(nodeIdx ==preOrder.length || preOrder[nodeIdx]<start || preOrder[nodeIdx] >end){
            return null;
        }
        int val=preOrder[nodeIdx++];
        TreeNode node = new TreeNode(val);
        node.left=bstHelper(preOrder , start , val);
        node.right=bstHelper(preOrder , val , end);
        return node;
    }
}