package Tree;

public class Traversals {
    public static void main(String[] args) {
        TreeStructure t = new TreeStructure();
        TreeStructure.TreeNode treeNode_11 = t.makeNode(11, null, null);
        TreeStructure.TreeNode treeNode_10 = t.makeNode(10, null, null);
        TreeStructure.TreeNode treeNode_9 = t.makeNode(9, null, null);
        TreeStructure.TreeNode treeNode_8 = t.makeNode(8, null, null);
        TreeStructure.TreeNode treeNode_7 = t.makeNode(7, null, treeNode_11);
        TreeStructure.TreeNode treeNode_6 = t.makeNode(6, null, null);
        TreeStructure.TreeNode treeNode_5 = t.makeNode(5, treeNode_10, null);
        TreeStructure.TreeNode treeNode_4 = t.makeNode(4, treeNode_8, treeNode_9);
        TreeStructure.TreeNode treeNode_3 = t.makeNode(3, treeNode_6, treeNode_7);
        TreeStructure.TreeNode treeNode_2 = t.makeNode(2, treeNode_4, treeNode_5);
        TreeStructure.TreeNode treeNode_1 = t.makeNode(1, treeNode_2, treeNode_3);
        t.setRoot(treeNode_1);
        /*
         *            1
         *          /   \
         *         2     3
         *        / \   / \
         *       4   5 6   7
         *      / \   \     \
         *     8   9   10    11
         *
         * */
        t.preorder(t.root);
        System.out.println();
        t.inorder(t.root);
        System.out.println();
        t.postorder(t.root);
    }
}
