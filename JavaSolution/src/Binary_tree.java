/**
 * Created by shunji-subei on 2017/7/24.
 */
import  java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_tree {
    /**
     * 二叉树前序遍历
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        traverse(root,result);
        return  result;

//        二叉树前序遍历（不使用递归）
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        List<Integer> preorder = new ArrayList<Integer>();
//
//        if (root == null) {
//            return  preorder;
//        }
//
//        stack.push(root);
//        while (!stack.empty()) {
//            TreeNode node = stack.pop();
//            preorder.add(node.val);
//            if (node.right != null) {
//                stack.push(node.right);
//            }
//
//            if (node.left != null) {
//                stack.push(node.left);
//            }
//        }
//        return preorder;

//        拆分法
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        if (root == null) {
//            return  result;
//        }
//
//        //Divide
//        ArrayList<Integer> left = preorderTraversal(root.left);
//        ArrayList<Integer> right = preorderTraversal(root.right);
//
//        // Conquer
//        result.add(root.val);
//        result.addAll(left);
//        result.addAll(right);
//        return  result;

    }

    private void traverse(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);

    }




}




