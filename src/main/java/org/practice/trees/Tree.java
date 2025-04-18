package org.practice.trees;


import java.util.*;

public class Tree<T>{
    Node<T> root;

    public Tree(){
        this.root = null;
    }

    public Tree(T data){
        this.root = new Node<>(data);
    }

    public void inOrder(Node<T> root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    public void postOrder(Node<T> root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void preOrder(Node<T> root){
        if (root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void levelOrder(Node<T> root){
        if(root == null) return;
        Queue<Node<T>> q = new LinkedList<>();
        q.offer(root);
        List<T> ans = new ArrayList<>();
        while (!q.isEmpty()){
            Node<T> temp = q.poll();
            ans.add(temp.data);
            if(temp.getLeft()!=null) q.offer(temp.left);
            if(temp.getRight()!=null) q.offer(temp.right);
        }
        System.out.println(ans);

    }

    public void dfs(Node<T> root){
        if(root == null) return;
        Stack<Node<T>> st = new Stack<>();
        st.add(root);
        List<T> ans = new ArrayList<>();
        while(!st.isEmpty()){
            Node<T> temp = st.pop();
            ans.add(temp.data);
            if(temp.getRight()!=null)st.add(temp.getRight());
            if(temp.getLeft()!=null) st.add(temp.getLeft());

        }
        System.out.println(ans);
    }



    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
            tree.root = new Node<>(1);
            tree.root.left = new Node<>(2);
            tree.root.right = new Node<>(3);
            tree.root.left.left = new Node<>(4);
            tree.root.left.right = new Node<>(5);
            tree.root.right.left = new Node<>(6);
            tree.root.right.right = new Node<>(7);
//        tree.inOrder(tree.root);
//        tree.postOrder(tree.root);
//          tree.preOrder(tree.root);
//        tree.levelOrder(tree.root);
        tree.dfs(tree.root);
    }
}
