package com.company;
/**
 * A processed class that contains arrays described to take the final output of the eligibility test
 * It contains methods such as resize,getters, setters, and accepted and rejected
 */
public class Processed {
        private static int numProcessed=0;
        private static int capacity = 30;
        private static int lastAcceptedIndex=-1;
        private static int lastRejectedIndex=-1;
        private  static Applicant[] accepted=new Applicant[capacity];
        private  static Applicant[] rejected=new Applicant[capacity];

        public Processed(int capacity) {
            this.capacity = capacity;
            lastAcceptedIndex = -1;
            lastRejectedIndex = -1;
            accepted = new Applicant[capacity];
            rejected = new Applicant[capacity];
        }
        public Processed() {}

    /**
     * increasing the size of arrays using doubling method
     */
    public static void resize(){
            Applicant[] newAccepted=new Applicant[capacity*2];//Accepted array resize
            Applicant[] newRejected=new Applicant[capacity*2];//Rejected array resize
            int a=0;
            for(Applicant i:accepted){
                newAccepted[a]=i;
                a++;
            }
            accepted=newAccepted;
            int b=0;
            for(Applicant i:rejected) {
                newRejected[b] = i;
                b++;
            }
            rejected=newRejected;
        }

    /**
     * adds a student to an array of accepted applicants
     * @param student
     */
    public static void accepted(Applicant student) {
            if(getLastAcceptedIndex()==getCapacity()-1){resize();}
            lastAcceptedIndex++;
            accepted[getLastAcceptedIndex()]=student;
            numProcessed++;
        }

    /**
     * adds a student to an array of rejected applicants
     * @param student
     */
        public static void rejected(Applicant student){
            if(getLastRejectedIndex()==getCapacity()-1){resize();}
            lastRejectedIndex++;
            rejected[getLastRejectedIndex()]=student;
            numProcessed++;
        }
        //facilitator methods for the processed class
        public static int getCapacity() { return capacity; }
        public static int getNumProcessed() { return numProcessed; }
        public static Applicant[] getAccepted() { return ExtraFunctions.sort(accepted); }
        public static Applicant[] getRejected() { return ExtraFunctions.sort(rejected); }
        public static int getLastAcceptedIndex(){return lastAcceptedIndex;}
        public static int getLastRejectedIndex(){return lastRejectedIndex;}
        public static int getNumOfAccepted(){return getLastAcceptedIndex()+1;}
        public static int getNumOfRejected(){return getLastRejectedIndex()+1;}
    }

