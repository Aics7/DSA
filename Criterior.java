package com.company;

public class Criterior {
    /**
     * checks to see if student information is true
     * @param student
     * @return
     */
        public static boolean honestyCheck(Applicant student) {
            return (student.getSocialInfo().getMonthlyExpenditure() - student.getSocialInfo().getMonthlyIncome() <= student.getSocialInfo().getFamilyDebt());
        }

    /**
     * takes all applicant information and processes them to return a score befitting the data.
     * @param student
     * @return
     * @throws IllegalStateException
     */
        public static double Processor(Applicant student) throws IllegalStateException {
            double resultScore;
            double socialScore;
            int numOfSiblingScore;
            int monthlyIncomeScore;
            int familyDebtScore;
            int regionScore;
            int rawResult [];
            double rawResultSum=0;
            int numOfCourses = 0;
            //computing score for results

            rawResult = new int[]{student.getResultsOfStudent().getMathematicsGrade(), student.getResultsOfStudent().getScienceGrade(),
                    student.getResultsOfStudent().getEnglishGrade(), student.getResultsOfStudent().getFrenchGrade(),
                    student.getResultsOfStudent().getSocialStudiesGrade(), student.getResultsOfStudent().getBDTGrade(),
                    student.getResultsOfStudent().getICTGrade(), student.getResultsOfStudent().getRMEGrade(),
                    student.getResultsOfStudent().getGhanaianLanguageGrade()};

            for(int i:rawResult){
                if(i>9|| i<-1|| i==0){ throw new IllegalStateException("Grade must be within the range 1-9 and must be -1 if course not taken");}
                if (i>=1 && i<=9){
                    rawResultSum+=i;
                    numOfCourses+=1;
                }
            }

            if (numOfCourses<6){throw new IllegalStateException("a minimum of six(6) course grades are required");}
            else{resultScore = 9 - (rawResultSum / numOfCourses);}
            //computing score for number of siblings
            if (student.getSocialInfo().getNumOfSiblings() < 0) {
                throw new IllegalStateException("number of siblings cannot be negative");
            } else if (student.getSocialInfo().getNumOfSiblings() < 2) {
                numOfSiblingScore = 0;
            } else if (student.getSocialInfo().getNumOfSiblings() > 1 && student.getSocialInfo().getNumOfSiblings() < 5) {
                numOfSiblingScore = 1;
            } else {
                numOfSiblingScore = 2;
            }
            //computing score for monthly income
            if (student.getSocialInfo().getMonthlyIncome() < 0) {
                throw new IllegalStateException("monthly income cannot be negative");
            } else if (student.getSocialInfo().getMonthlyIncome() <= 500) {
                monthlyIncomeScore = 3;
            } else if (student.getSocialInfo().getMonthlyIncome() > 500 && student.getSocialInfo().getMonthlyIncome() <= 1000) {
                monthlyIncomeScore = 2;
            } else if (student.getSocialInfo().getMonthlyIncome() > 1000 && student.getSocialInfo().getMonthlyIncome() <= 2000) {
                monthlyIncomeScore = 1;
            } else {
                monthlyIncomeScore = 0;
            }
            //computing score for family debt
            if (student.getSocialInfo().getFamilyDebt() < 0) {
                throw new IllegalStateException("family debt cannot be negative");
            } else if (student.getSocialInfo().getFamilyDebt() <= 200) {
                familyDebtScore = 0;
            } else if (student.getSocialInfo().getFamilyDebt() > 200 && student.getSocialInfo().getFamilyDebt() <= 500) {
                familyDebtScore = 1;
            } else {
                familyDebtScore = 2;
            }
            //computing score for region
            if (student.getSocialInfo().getRegion() == Applicant.reg.Upper_East || student.getSocialInfo().getRegion() == Applicant.reg.Upper_West ||
                    student.getSocialInfo().getRegion() == Applicant.reg.Northern) {
                regionScore = 2;
            } else if (student.getSocialInfo().getRegion() == Applicant.reg.Brong_Ahafo || student.getSocialInfo().getRegion() == Applicant.reg.Volta ||
                    student.getSocialInfo().getRegion() == Applicant.reg.Eastern || student.getSocialInfo().getRegion() == Applicant.reg.Western) {
                regionScore = 1;
            } else {
                regionScore = 0;
            }
            //returning the sum of scores
            socialScore = numOfSiblingScore + monthlyIncomeScore + familyDebtScore + regionScore;
            return (resultScore + socialScore);
        }
}
