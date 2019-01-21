package com.company;
import java.time.LocalDate;
import java.time.LocalDate;
/**
 * Applicant class to store the data of an applicant
 */
public class Applicant {
    private String name,extracarricularActivity, ID;
        private LocalDate dateOfBirth;
        private gen gender;
        private Result resultsOfStudent;//stores the grades of a student in an array
        private Social socialInfo; //takes social info of a student from a class called Social;
        enum gen {Male, Female};
        enum course {English_Language, Integrated_Science,Mathematics,Social_Studies,RME,ICT,French,BDT,Ghanaian_Language};
        enum reg {Upper_East,Upper_West,Northern,Eastern,Western,Greater_Accra,Brong_Ahafo,Central,Volta,Ashanti}

        /**
         * Constructor method for an applicant object
         * @param name
         * @param extracarricularActivity
         * @param ID
         * @param dateOfBirth
         * @param gender
         * @param resultsOfStudent
         * @param socialInfo
         */
        public Applicant(String name, String extracarricularActivity, String ID, LocalDate dateOfBirth, gen gender, Result resultsOfStudent, Social socialInfo) {
            this.name = name;
            this.extracarricularActivity = extracarricularActivity;
            this.ID = ID;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
            this.resultsOfStudent = resultsOfStudent;
            this.socialInfo = socialInfo;
        }

    /**
     * An applicant method for getting and setting the information system
     */
    public Applicant(){}
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getExtracarricularActivity() {
            return extracarricularActivity;
        }
        public void setExtracarriculaActivity(String extracarricularActivity) {
            this.extracarricularActivity = extracarricularActivity;
        }
        public String getID() {
            return ID;
        }
        public void setID(String ID) {
            this.ID = ID;
        }
        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }
        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
        public gen getGender() {
            return gender;
        }
        public void setGender(gen gender) {
            this.gender = gender;
        }
        public Result getResultsOfStudent() {
            return resultsOfStudent;
        }
        public void setResultsOfStudent(Result resultsOfStudent) {
            this.resultsOfStudent = resultsOfStudent;
        }
        public Social getSocialInfo() {
            return socialInfo;
        }
        public void setSocialInfo(Social socialInfo) {
            this.socialInfo = socialInfo;
        }
        @Override
        /*
        * A to string method for converting all  information to a string when printing
         */
        public String toString() {
            return "name = " + name +
                    ",\n  extracarriculaActivity = " + extracarricularActivity +
                    ",\n  ID = " + ID +
                    ",\n  dateOfBirth = " + dateOfBirth +
                    ",\n  gender = " + gender +
                    ",\n  resultsOfStudent = " + resultsOfStudent.toString() +
                    ",\n  socialInfo = " + socialInfo
                    +"\n  ";
        }
        /**
         * Result class that stores data for the grades of a candidate per subject
         */
        public static class Result {
            private int mathematicsGrade,englishGrade,frenchGrade,RMEGrade,BDTGrade,ghanaianLanguageGrade,scienceGrade,socialStudiesGrade,ICTGrade;
            /**
             * Constructor class for student's results. type -1 if student does not tke a particular course
             * @param mathematicsGrade
             * @param englishGrade
             * @param frenchGrade
             * @param RMEGrade
             * @param BDTGrade
             * @param ghanaianLanguageGrade
             * @param scienceGrade
             * @param socialStudiesGrade
             * @param ICTGrade
             */
            public Result(int mathematicsGrade, int englishGrade, int frenchGrade, int RMEGrade, int BDTGrade,
                          int ghanaianLanguageGrade, int scienceGrade, int socialStudiesGrade, int ICTGrade) {
                this.mathematicsGrade = mathematicsGrade;
                this.englishGrade = englishGrade;
                this.frenchGrade = frenchGrade;
                this.RMEGrade = RMEGrade;
                this.BDTGrade = BDTGrade;
                this.ghanaianLanguageGrade = ghanaianLanguageGrade;
                this.scienceGrade = scienceGrade;
                this.socialStudiesGrade = socialStudiesGrade;
                this.ICTGrade = ICTGrade;
            }
            public int getMathematicsGrade() {
                return mathematicsGrade;
            }

            public void setMathematicsGrade(int mathematicsGrade) {
                this.mathematicsGrade = mathematicsGrade;
            }

            public int getEnglishGrade() {
                return englishGrade;
            }

            public void setEnglishGrade(int englishGrade) {
                this.englishGrade = englishGrade;
            }

            public int getFrenchGrade() {
                return frenchGrade;
            }

            public void setFrenchGrade(int frenchGrade) {
                this.frenchGrade = frenchGrade;
            }

            public int getRMEGrade() {
                return RMEGrade;
            }

            public void setRMEGrade(int RMEGrade) {
                this.RMEGrade = RMEGrade;
            }

            public int getBDTGrade() {
                return BDTGrade;
            }

            public void setBDTGrade(int BDTGrade) {
                this.BDTGrade = BDTGrade;
            }

            public int getGhanaianLanguageGrade() {
                return ghanaianLanguageGrade;
            }

            public void setGhanaianLanaguageGrade(int ghanaianLanaguageGrade) {
                this.ghanaianLanguageGrade = ghanaianLanaguageGrade;
            }

            public int getScienceGrade() {
                return scienceGrade;
            }

            public void setScienceGrade(int scienceGrade) {
                this.scienceGrade = scienceGrade;
            }

            public int getSocialStudiesGrade() {
                return socialStudiesGrade;
            }

            public void setSocialStudiesGrade(int socialStudiesGrade) {
                this.socialStudiesGrade= socialStudiesGrade;
            }

            public int getICTGrade() {
                return ICTGrade;
            }

            public void setICTGrade(int ICTGrade) {
                this.ICTGrade = ICTGrade;
            }

            @Override
            public String toString() {
                return "mathematicsGrade: " + mathematicsGrade +
                        ", englishGrade: " + englishGrade +
                        ", frenchGrade: " + frenchGrade +
                        ", RMEGrade: " + RMEGrade +
                        ", BDTGrade: " + BDTGrade +
                        ", ghanaianLanguageGrade: " + ghanaianLanguageGrade +
                        ", scienceGrade: " + scienceGrade +
                        ", socialStudiesGrade: " + socialStudiesGrade+
                        ", ICTGrade: " + ICTGrade;
            }
        }

        /**
         * Social class that stores the social information of an applicant
         */
        public static class Social {
            private int numOfSiblings;
            private double familyDebt,monthlyIncome,monthlyExpenditure;
            private reg region;

            public Social(int numOfSiblings, double familyDebt, double monthlyIncome, double monthlyExpenditure, reg region) {
                this.numOfSiblings = numOfSiblings;
                this.familyDebt = familyDebt;
                this.monthlyIncome = monthlyIncome;
                this.monthlyExpenditure = monthlyExpenditure;
                this.region = region;
            }
            public Social(){}
            public int getNumOfSiblings() {
                return numOfSiblings;
            }
            public void setNumOfSiblings(int numOfSiblings) {
                this.numOfSiblings = numOfSiblings;
            }
            public double getFamilyDebt() {
                return familyDebt;
            }
            public void setFamilyDebt(double familyDebt) {
                this.familyDebt = familyDebt;
            }
            public double getMonthlyIncome() {
                return monthlyIncome;
            }
            public void setMonthlyIncome(double monthlyIncome) {
                this.monthlyIncome = monthlyIncome;
            }
            public double getMonthlyExpenditure() {
                return monthlyExpenditure;
            }
            public void setMonthlyExpenditure(double monthlyExpenditure) {
                this.monthlyExpenditure = monthlyExpenditure;
            }
            public reg getRegion() {
                return region;
            }
            public void setRegion(reg region) {
                this.region = region;
            }
            @Override
            public String toString() {
                return "numOfSiblings: " + numOfSiblings + ", familyDebt: " + familyDebt + ", monthlyIncome: " + monthlyIncome +
                        ", monthlyExpenditure: " + monthlyExpenditure + ", region: " + region ;
            }
        }
}
