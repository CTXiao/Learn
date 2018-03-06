package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

import util.Printer;

public class BinaryTree {
	private TreeNode root;
	// List<TreeNode> nodeList = new ArrayList<TreeNode>();
	int[] values;

	public BinaryTree() {
		super();
		root = new TreeNode(0);
	}

	public void addTreeNodes(int[] values) {
		int index = 0;
		Insert(root, values, index);
	}

	private void Insert(TreeNode node, int[] values, int index) {
		//给自己赋值
		index++;
		if (index < values.length) {
			node.setData(values[index]);
		} else {
			return;
		}
		//给左孩子赋值
		index++;
		if (index < values.length) {
			node.setLeftChild(new TreeNode(0));
		} else {
			return;
		}
		//给右孩子赋值
		index++;
		if (index < values.length) {
			node.setRightChild(new TreeNode(0));
		} else {
			return;
		}
		//做孩子递归
		index++;
		if (index < values.length) {
			Insert(node.getLeftChild(), values, index);
		} else {
			return;
		}
		//右孩子递归
		index++;
		if (index < values.length) {
			Insert(node.getRightChild(), values, index);
		} else {
			return;
		}
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
}