package com.company;

/**
 * a tree rooted with score 8 and contains arrays on its left and right.
 * the left array stores applicants whose scores are below 8 and
 * the right array stores applicants whose scores are above or equal to 8
 */
public class DecisionTree {
    private static Node root = new Node(8);
    //constructor
    public DecisionTree () { }
    public void setRoot(int score) { this.root = new Node(score); }
    public static Node getRoot() { return root; }
    public double getRootScore() { return root.getScore(); }

    /**
     * inserts a student into the tree
     * @param student
     */
    public void insert(Applicant student) {
        if (Criterior.Processor(student) < root.getScore()) {
            root.addLeft(student);
        } else { root.addRight(student); }
    }

    /**
     * removes all applicants from the tree
     */
    public void remove() {
        while (DecisionTree.getRoot().getLeft().top() != null) {
            DecisionTree.getRoot().getLeft().pop();
        }
        while (DecisionTree.getRoot().getRight().top() != null) {
            DecisionTree.getRoot().getRight().pop();
        }
    }
}