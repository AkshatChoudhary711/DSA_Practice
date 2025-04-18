package org.practice.trees.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BT {
    private BTNode root;

    BT(){
       root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int data){
        root = insert(root,data);
    }

    public BTNode insert(BTNode node,int data){
        if (node == null){
            node = new BTNode(data);
        }else{
           if(data<= node.data) {
               node.left = insert(node.left, data);
           }else{
               node.right = insert(node.right, data);
           }
        }
        return node;
    }

    public int countNodes(){
        return countNodes(root);
    }

    public int countNodes(BTNode node){
        int l;
        if(node == null){
            return 0;
        }else {
            l = 1;
            l += countNodes(node.left);
            l += countNodes(node.right);
            return l;
        }
    }

    public boolean searchNode(int data){
        return searchNode(root, data);
    }

    public boolean searchNode(BTNode node, int data){
        if (node.data == data ) return true;
        if (searchNode(node.getLeft(),data)) return true;
        if (searchNode(node.getRight(),data)) return true;
        return false;
    }

    public void inorderTraversal(){
        inorderTraversal(root);
    }

    public void inorderTraversal(BTNode node){
        if (node ==null) return;
        inorderTraversal(node.getLeft());
        System.out.print(node.data+" ");
        inorderTraversal(node.getRight());
    }

    public void bfs(){
        bfs(root);
    }

    public void bfs(BTNode node){
        if(node == null) return;
        Queue<BTNode> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            BTNode temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.getLeft()!=null) q.offer(temp.left);
            if(temp.getRight()!=null) q.offer(temp.right);
        }
    }

    public static void main(String[] args) {
        BT tree =new BT();
        tree.insert(1);
        tree.insert(-1);
        tree.insert(0);
        tree.insert(2);
        tree.insert(-2);
        tree.insert(1);
        tree.insert(5);
//        tree.inorderTraversal();
        tree.bfs();
    }


}
