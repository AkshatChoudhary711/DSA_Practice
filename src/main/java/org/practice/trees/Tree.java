package org.practice.trees;

class Node<T>{
    T data;
    Node left;
    Node right;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree<T>{
    Node root;

    public Tree(){
        this.root = null;
    }

    public Tree(T data){
        this.root = new Node(data);
    }

    public void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    public void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void insert(Node root, T data ){
        if (root == null){
            root = new Node<>(data);
            return;
        }
        insert(root.left,data);
        insert(root.right,data);

    }



    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.insert(tree.root, 1);
        tree.insert(tree.root, 2);
        tree.insert(tree.root, 3);
//        tree.inOrder(tree.root);
//        tree.postOrder(tree.root);
          tree.preOrder(tree.root);
    }
}
