package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\User\\Documents\\Final_Project\\Accepted.txt");
        File file2 = new File("C:\\Users\\User\\Documents\\Final_Project\\Rejected.txt");
        FileWriter eugenia = null;

        //Printing from the most recently saved data
        System.out.println("Details of applicants that were accepted the last time the program was used are as follows\n");
        //Desterilizing the file that saved accepted applicants
        try {
            File object = new File("Accepted.txt");
            Scanner myReader = new Scanner(file1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Details of applicants that were rejected the last time the program was used are as follows\n");
        //Desterilizing the file that saved rejected applicants
        try {
            File object = new File("Rejected.txt");
            Scanner myReader = new Scanner(file2);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



        // Creating 20 applicant objects to test the program
        //instances of the social and results classes are also created
        LocalDate date1 = LocalDate.parse("2004-09-20");
        Applicant.Social social1 = new Applicant.Social(3, 100, 1000, 1100, Applicant.reg.Volta);
        Applicant.Result result1 = new Applicant.Result(2, 3, 2, 2, 1, 4, 2, 3, 6);
        Applicant app1 = new Applicant("Sampson Nani", "Soccer", "0802204331", date1, Applicant.gen.Male, result1, social1);

        LocalDate date2 = LocalDate.parse("2002-09-20");
        Applicant.Social social2 = new Applicant.Social(4, 0, 1000, 1000, Applicant.reg.Upper_West);
        Applicant.Result result2 = new Applicant.Result(3, 5, 1, 1, 2, 4, 1, 1, 1);
        Applicant app2 = new Applicant("Eugene Akpos", "nothing", "0903254730", date2, Applicant.gen.Male, result2, social2);

        LocalDate date3 = LocalDate.parse("2001-09-20");
        Applicant.Social social3 = new Applicant.Social(1, 0, 4000, 1300, Applicant.reg.Eastern);
        Applicant.Result result3 = new Applicant.Result(5, 4, 5, 9, 7, 9, 8, 7, 8);
        Applicant app3 = new Applicant("Ebo Adjepon", "Teaching", "0902248907", date3, Applicant.gen.Male, result3, social3);

        LocalDate date4 = LocalDate.parse("2000-03-20");
        Applicant.Social social4 = new Applicant.Social(3, 0, 10000, 6000, Applicant.reg.Western);
        Applicant.Result result4 = new Applicant.Result(3, 5, 5, 7, 4, 2, 4, 5, 1);
        Applicant app4 = new Applicant("Ibrahim Abdullah", "nothing", "0906834827", date4, Applicant.gen.Male, result4, social4);

        LocalDate date5 = LocalDate.parse("1992-09-10");
        Applicant.Social social5 = new Applicant.Social(2, 1000, 400, 1300, Applicant.reg.Northern);
        Applicant.Result result5 = new Applicant.Result(1, 4, -1, 1, -1, 1, 1, 1, 1);
        Applicant app5 = new Applicant("Patrick Awuah", "Teaching", "0902244835", date5, Applicant.gen.Male, result5, social5);

        LocalDate date6 = LocalDate.parse("2004-09-20");
        Applicant.Social social6 = new Applicant.Social(0, 100, 1470, 1000, Applicant.reg.Central);
        Applicant.Result result6 = new Applicant.Result(4, 9, 6, 9, 8, 9, 9, 9, 9);
        Applicant app6 = new Applicant("William Ampadu", "Soccer", "0802204331", date6, Applicant.gen.Male, result6, social6);

        LocalDate date7 = LocalDate.parse("2002-09-20");
        Applicant.Social social7 = new Applicant.Social(4, 0, 1000, 900, Applicant.reg.Ashanti);
        Applicant.Result result7 = new Applicant.Result(3, 3, 1, 4, 1, 1, 2, 1, 1);
        Applicant app7 = new Applicant("Doreen Marfo", "nothing", "0903254730", date7, Applicant.gen.Female, result7, social7);

        LocalDate date8 = LocalDate.parse("2001-09-20");
        Applicant.Social social8 = new Applicant.Social(5, 1000, 400, 2000, Applicant.reg.Northern);
        Applicant.Result result8 = new Applicant.Result(1, 1, -1, 1, -1, -1, 1, 1, 1);
        Applicant app8 = new Applicant("Afua Kesewaa", "Teaching", "0902248907", date8, Applicant.gen.Female, result8, social8);

        LocalDate date9 = LocalDate.parse("2000-03-20");
        Applicant.Social social9 = new Applicant.Social(5, 0, 10000, 6000, Applicant.reg.Upper_East);
        Applicant.Result result9 = new Applicant.Result(3, 5, 5, 7, 4, 2, 4, 5, 1);
        Applicant app9 = new Applicant("Isaac Kumi", "nothing", "0906834827", date9, Applicant.gen.Male, result9, social9);

        LocalDate date10 = LocalDate.parse("1992-09-10");
        Applicant.Social social10 = new Applicant.Social(2, 1000, 4000, 4900, Applicant.reg.Greater_Accra);
        Applicant.Result result10 = new Applicant.Result(1, 4, -1, 1, -1, 1, 1, 1, 1);
        Applicant app10 = new Applicant("Ofori Amina", "Teaching", "0902244835", date10, Applicant.gen.Female, result10, social10);

        LocalDate date11 = LocalDate.parse("2004-09-20");
        Applicant.Social social11 = new Applicant.Social(0, 100, 1000, 1100, Applicant.reg.Volta);
        Applicant.Result result11 = new Applicant.Result(9, 9, 9, 9, 9, 9, 9, 9, 9);
        Applicant app11 = new Applicant("Mohammed Amin", "Soccer", "0802204331", date11, Applicant.gen.Male, result11, social11);

        LocalDate date12 = LocalDate.parse("2002-09-20");
        Applicant.Social social12 = new Applicant.Social(1, 1200, 1000, 2000, Applicant.reg.Central);
        Applicant.Result result12 = new Applicant.Result(3, 2, 1, 2, 1, 4, 1, 1, 1);
        Applicant app12 = new Applicant("Abass Abdulai", "nothing", "0903254730", date12, Applicant.gen.Male, result12, social12);

        LocalDate date13 = LocalDate.parse("2001-09-20");
        Applicant.Social social13 = new Applicant.Social(1, 800, 800, 1300, Applicant.reg.Western);
        Applicant.Result result13 = new Applicant.Result(1, 4, 1, 1, 2, 2, 1, 1, 1);
        Applicant app13 = new Applicant("Kofi Priscilla", "Teaching", "0902248907", date13, Applicant.gen.Female, result13, social13);

        LocalDate date14 = LocalDate.parse("2000-03-20");
        Applicant.Social social14 = new Applicant.Social(3, 0, 10000, 6000, Applicant.reg.Upper_East);
        Applicant.Result result14 = new Applicant.Result(3, 5, 5, 7, 4, 2, 4, 5, 1);
        Applicant app14 = new Applicant("Kolah Tobare", "nothing", "0906834827", date14, Applicant.gen.Male, result14, social14);

        LocalDate date15 = LocalDate.parse("1992-09-10");
        Applicant.Social social15 = new Applicant.Social(4, 1000, 400, 1300, Applicant.reg.Brong_Ahafo);
        Applicant.Result result15 = new Applicant.Result(1, 4, -1, 1, 3, 1, 2, 1, 1);
        Applicant app15 = new Applicant("Kwame Nana-Adwoa", "Teaching", "0902244835", date15, Applicant.gen.Female, result15, social15);

        LocalDate date16 = LocalDate.parse("2004-09-20");
        Applicant.Social social16 = new Applicant.Social(0, 100, 1000, 1100, Applicant.reg.Central);
        Applicant.Result result16 = new Applicant.Result(9, 8, 9, 9, 7, 9, 9, 9, 9);
        Applicant app16 = new Applicant("Mumuni Mohammed", "Soccer", "0802204331", date16, Applicant.gen.Male, result16, social16);

        LocalDate date17 = LocalDate.parse("2002-09-20");
        Applicant.Social social17 = new Applicant.Social(4, 0, 1000, 1000, Applicant.reg.Eastern);
        Applicant.Result result17 = new Applicant.Result(3, 1, 1, 1, 1, 1, 1, 1, 1);
        Applicant app17 = new Applicant("Tamakloe Alice", "nothing", "0903254730", date17, Applicant.gen.Female, result17, social17);

        LocalDate date18 = LocalDate.parse("2001-09-20");
        Applicant.Social social18 = new Applicant.Social(4, 120, 1200, 1300, Applicant.reg.Volta);
        Applicant.Result result18 = new Applicant.Result(1, 4, 5, 1, 4, 3, 1, 2, 1);
        Applicant app18 = new Applicant("Boateng Mercy", "Teaching", "0902248907", date18, Applicant.gen.Female, result18, social18);

        LocalDate date19 = LocalDate.parse("2000-03-20");
        Applicant.Social social19 = new Applicant.Social(3, 0, 10000, 6000, Applicant.reg.Greater_Accra);
        Applicant.Result result19 = new Applicant.Result(3, 5, 5, 7, 4, 2, 4, 5, 1);
        Applicant app19 = new Applicant("Osman Toffic", "nothing", "0906834827", date19, Applicant.gen.Male, result19, social19);

        LocalDate date20 = LocalDate.parse("1992-09-10");
        Applicant.Social social20 = new Applicant.Social(2, 1000, 400, 1300, Applicant.reg.Upper_West);
        Applicant.Result result20 = new Applicant.Result(1, 4, 1, 1, 1, 1, 1, 1, 1);
        Applicant app20 = new Applicant("Ismail Rahmatu", "Teaching", "0902244835", date20, Applicant.gen.Female, result20, social20);

        //creating an instance of decision tree
        DecisionTree scholar = new DecisionTree();
        //inserting all 20 applicants into the tree (scholar)
        scholar.insert(app1);
        scholar.insert(app2);
        scholar.insert(app3);
        scholar.insert(app4);
        scholar.insert(app5);
        scholar.insert(app6);
        scholar.insert(app7);
        scholar.insert(app8);
        scholar.insert(app9);
        scholar.insert(app10);
        scholar.insert(app11);
        scholar.insert(app12);
        scholar.insert(app13);
        scholar.insert(app14);
        scholar.insert(app15);
        scholar.insert(app16);
        scholar.insert(app17);
        scholar.insert(app18);
        scholar.insert(app19);
        scholar.insert(app20);

        //removing students from the tree. the remove method places all students on the left of the root into an array of
        // rejected applicants and those on the right into an array of accepted applicants.
        scholar.remove();
        //looping through the accepted array and printing the names and scores of accepted applicants
        System.out.println("The following applicants have been accepted: ");
        for (int i = 0; i < Processed.getNumOfAccepted(); i++) {
            Applicant student = Processed.getAccepted()[i];
            //writing applicant data into a text file
            try {
                eugenia = new FileWriter(file1, true);
                eugenia.write(student.toString()+System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    eugenia.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(student.getName() + " " + Criterior.Processor(student));
        }
        //looping through the rejected array and printing the names and scores of accepted applicants
        System.out.println("The following applicants have been rejected: ");
        for (int i = 0; i < Processed.getNumOfRejected(); i++) {
            Applicant student = Processed.getRejected()[i];
            //writing applicant data into a text file
            try {
                // Below constructor argument decides whether to append or override
                eugenia = new FileWriter(file2, true);
                eugenia.write(student.toString()+System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    eugenia.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(student.getName() + " " + Criterior.Processor(student));
            }
        }
    }
}