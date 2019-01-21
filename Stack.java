package com.company;

public class Stack {
    /**
     * The stack class uses it method to push all colliding scores to an array and pop later for evaluation
     * It contains methods such as resize, isEmpty, top, pop,push specially implemented for the purpose of the project
     */
        private static int capacity=20;
        private int numOfElements=0;
        private Applicant[] stack;

        public Stack() { this.capacity = capacity; }

        public Stack(int capacity) { stack = new Applicant[capacity]; }
        public boolean isEmpty() { return (getSize() == 0); }
        public int getSize() { return numOfElements; }
        public  void push(Applicant student) {
            if (getSize() == capacity) {resize();}
            stack[numOfElements] = student;
            numOfElements++;
        }

        public Applicant top() {
            if (isEmpty()) { return null; }
            return stack[numOfElements - 1]; }

        public Applicant pop() { if (isEmpty()) { return null; }
            Applicant student = top();
            if(Criterior.Processor(student)>=8 && Criterior.honestyCheck(student)){
                Processed.accepted(student);
            }
            else{ Processed.rejected(student); }
            stack[numOfElements - 1] = null;
            numOfElements--;
            return student;
        }
    /**
     * increasing the size of arrays using doubling method
     */
        public void resize() {
            Applicant[] newStack = new Applicant[capacity * 2];
            int a = 0;
            for (Applicant i : stack) {
                newStack[a] = i;
                a++;
            }
            stack = newStack;
        }
    }

