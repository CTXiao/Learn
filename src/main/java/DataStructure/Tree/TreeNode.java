package DataStructure.Tree;

import util.Printer;

public class TreeNode {
	private TreeNode LeftChild;
	private TreeNode RightChild;
	private int Data;
	private int level = 0;

	public TreeNode(int value) {
		Data = value;
		LeftChild = null;
		RightChild = null;
	}

	public void ergodic(Direction dir) {
		switch (dir) {
		case left:
			leftErgodic(this);
			break;
		case middle:
			middleErgodic(this);
			break;
		case right:
			rightErgodic(this);
			break;
		}
	}

	private void leftErgodic(TreeNode node) {
		if(null == node)
		{
			return;
		}
		Printer.Println(node.getData());
		leftErgodic(node.getLeftChild());
		leftErgodic(node.getRightChild());
	}

	private void middleErgodic(TreeNode node) {
		if(null == node)
		{
			return;
		}
		middleErgodic(node.getLeftChild());
		Printer.Println(node.getData());
		middleErgodic(node.getRightChild());
	}

	private void rightErgodic(TreeNode node) {
		if(null == node)
		{
			return;
		}
		rightErgodic(node.getLeftChild());
		rightErgodic(node.getRightChild());
		Printer.Println(node.getData());
	}

	public TreeNode getLeftChild() {
		return LeftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		LeftChild = leftChild;
	}

	public void setLeftChild(int value) {
		LeftChild = new TreeNode(value);
	}

	public TreeNode getRightChild() {
		return RightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		RightChild = rightChild;
	}

	public void setRightChild(int value) {
		RightChild = new TreeNode(value);
	}

	public int getData() {
		return Data;
	}

	public void setData(int data) {
		Data = data;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}