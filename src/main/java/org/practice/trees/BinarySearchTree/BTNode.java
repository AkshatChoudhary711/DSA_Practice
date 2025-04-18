package org.practice.trees.BinarySearchTree;

public class BTNode {
    BTNode left;
    BTNode right;
    int data;

    public BTNode() {
        this.left = null;
        this.data = 0;
        this.right = null;
    }

    public BTNode(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }
}

