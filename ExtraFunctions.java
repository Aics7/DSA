package com.company;

public class ExtraFunctions {
    /**
     * a sort function the puts students in an ascending order of their score.
     * @param student
     * @return
     */
    public static Applicant[] sort(Applicant[]student){
        for (int i=student.length-1;i>0;i--){
            if(student[i]!=null){
            int positionOfMax=0;
            for (int j=1;j<i+1;j++){
                if(Criterior.Processor(student[j])>Criterior.Processor(student[positionOfMax])){
                    positionOfMax=j;
                }
            }
            Applicant temp=student[i];
            student[i]=student[positionOfMax];
            student[positionOfMax]=temp;
        }
        }
        return student;
    }
}
