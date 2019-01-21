package com.company;
/**
 * A Node class to set parameters for inserting into the tree
 */
public class Node {
        private double score;
        private Stack left, right;
        public Node  (double score){
            this.score = score;
            this.left=new Stack(50);
            this.right=new Stack(50);
        }
        public Node(){}

    public void setLeft(Stack left) {
        this.left = left;
    }
    public void setRight(Stack right) {
        this.right = right;
    }

    public double getScore() {
        return score;
    }

    public Stack getLeft() {
        return left;
    }

    public Stack getRight() {
        return right;
    }
    public void addLeft(Applicant student){
            left.push(student);
    }
    public void addRight(Applicant student){
        right.push(student);
    }
}

