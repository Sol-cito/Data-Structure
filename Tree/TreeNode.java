package Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeStructure {
    TreeNode root;

    class TreeNode {
        int number;
        TreeNode leftT;
        TreeNode rightT;

        TreeNode(int number, TreeNode leftT, TreeNode rightT) {
            this.number = number;
            this.leftT = leftT;
            this.rightT = rightT;
        }
    }

    TreeNode makeNode(int number, TreeNode leftT, TreeNode rightT) {
        TreeNode treeNode = new TreeNode(number, leftT, rightT);
        return treeNode;
    }

    void setRoot(TreeNode treeNode) {
        this.root = treeNode;
    }

    void preorder(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.number + " ");
            preorder(treeNode.leftT);
            preorder(treeNode.rightT);
        }
    }

    void inorder(TreeNode treeNode) {
        if (treeNode != null) {
            inorder(treeNode.leftT);
            System.out.print(treeNode.number + " ");
            inorder(treeNode.rightT);
        }
    }

    void postorder(TreeNode treeNode) {
        if (treeNode != null) {
            postorder(treeNode.leftT);
            postorder(treeNode.rightT);
            System.out.print(treeNode.number + " ");
        }
    }

    void levelorder(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode polled = queue.poll();
            System.out.print(polled.number + " ");
            if (polled.leftT != null) {
                queue.add(polled.leftT);
            }
            if (polled.rightT != null) {
                queue.add(polled.rightT);
            }
        }
    }
}
