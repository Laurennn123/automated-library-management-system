package pageutility;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Random;

public class DetailsBorrowerPage extends FramePage{
    private final JButton backButtonToVerificationPage;
    private final JButton nextButtonToThankYouPage;

    public DetailsBorrowerPage(String studentNumber, String firstName, String lastName, String collegeCourse, String currentYear, int noOfBorrowedBooks){
        setTitle("Student Details");
        PageUtility utils = new PageUtility();

        JLabel studentNumberAlignment = utils.createLabelWithoutImage("Student Number:", 40,0,150,100, new Font("sans serif",Font.BOLD,16));
        JLabel firstNameAlignment = utils.createLabelWithoutImage("First Name:", 40,50,150,100, new Font("sans serif",Font.BOLD,16));
        JLabel lastNameAlignment = utils.createLabelWithoutImage("Last Name:", 40,100,150,100, new Font("sans serif",Font.BOLD,16));
        JLabel collegeCourseAlignment = utils.createLabelWithoutImage("College Course:", 40,150,150,100, new Font("sans serif",Font.BOLD,16));
        JLabel currentYearAlignment = utils.createLabelWithoutImage("Current Year:", 40,200,150,100, new Font("sans serif",Font.BOLD,16));
        JLabel noOfBorrowedBooksAlignment = utils.createLabelWithoutImage("No. of Borrowed Books:", 40,250,200,100, new Font("sans serif",Font.BOLD,16));
        JLabel studentNumberOfBorrower = utils.createLabelWithoutImage(studentNumber, 300, 0, 150, 100, new Font("sans serif",Font.BOLD,16));
        JLabel firstNameOfBorrower = utils.createLabelWithoutImage(firstName, 300, 50, 150, 100, new Font("sans serif",Font.BOLD,16));
        JLabel lastNameOfBorrower = utils.createLabelWithoutImage(lastName, 300, 100, 150, 100, new Font("sans serif",Font.BOLD,16));
        JLabel collegeCourseOfBorrower = utils.createLabelWithoutImage(collegeCourse, 300, 150, 150, 100, new Font("sans serif",Font.BOLD,16));
        JLabel currentYearOfBorrower = utils.createLabelWithoutImage(currentYear, 300, 200, 150, 100, new Font("sans serif",Font.BOLD,16));
        //i will need to change the primitive data types of string to integer
        JLabel noOfBorrowedBooksOfBorrower = utils.createLabelWithoutImage(Integer.toString(noOfBorrowedBooks), 300, 250, 150, 100, new Font("sans serif",Font.BOLD,15));
        JLabel [] detailsLabelAlignmentAndStudentDetails = {studentNumberAlignment, studentNumberOfBorrower, firstNameAlignment, firstNameOfBorrower, lastNameAlignment, lastNameOfBorrower
        ,collegeCourseAlignment, collegeCourseOfBorrower, currentYearAlignment, currentYearOfBorrower, noOfBorrowedBooksAlignment, noOfBorrowedBooksOfBorrower};
        JLabel [] upperComponentsAndBackground = utils.getUpperElementsAndBackground(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\detailsborrowerpageimages\\studentLogo.png"),
                new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\detailsborrowerpageimages\\detailsBorrowerTitleLabel.png"));

        backButtonToVerificationPage = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\detailsborrowerpageimages\\backButton.png"), 100,450,80,40,0);
        nextButtonToThankYouPage = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\detailsborrowerpageimages\\printButton.png"), 560,450,80,40,0);

        JPanel studentDetailsOfBorrowerContainer = utils.createPanel("#FFD3A3",140, 90, 450, 350);
        studentDetailsOfBorrowerContainer.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.BLACK));
        studentDetailsOfBorrowerContainer.setLayout(null);

        for (JLabel elementsInDetailsContainer : detailsLabelAlignmentAndStudentDetails) {
            studentDetailsOfBorrowerContainer.add(elementsInDetailsContainer);
        }
        add(studentDetailsOfBorrowerContainer);
        add(backButtonToVerificationPage);
        add(nextButtonToThankYouPage);
        for (JLabel upperElementsAndBackground : upperComponentsAndBackground){
            add(upperElementsAndBackground);
        }

    }

    public JButton getBackButtonToVerificationPage(){
        return backButtonToVerificationPage;
    }

    public JButton getNextButtonToThankYouPage(){
        return nextButtonToThankYouPage;
    }

    public void getData (int numberOfBorrowedBooks, String studentNumber, String firstBookSelected, String secondBookSelected, String thirdBookSelected){
        Random randomNumberToPresent = new Random();
        int presentNumber = randomNumberToPresent.nextInt(1000);

        try{
            Connection connectToPhPAdmin = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsinformation","root","");
            Statement[] statement = {connectToPhPAdmin.createStatement(), connectToPhPAdmin.createStatement(), connectToPhPAdmin.createStatement()};
            ResultSet[] studentsIndex = {statement[0].executeQuery("SELECT IndexOfStudent, StudentNumber, FirstBookSelected FROM studentsindex"), statement[1].executeQuery("SELECT IndexOfStudent, StudentNumber, FirstBookSelected, SecondBookSelected FROM studentsindex")
                    ,statement[2].executeQuery("SELECT IndexOfStudent, StudentNumber, FirstBookSelected, SecondBookSelected, ThirdBookSelected FROM studentsindex")};
            String oneBookBorrowed = "INSERT INTO `studentsindex`(`IndexOfStudent`, `StudentNumber`, `FirstBookSelected`) VALUES ('"+presentNumber+"','"+studentNumber+"','"+firstBookSelected+"')";
            String twoBooksBorrowed = "INSERT INTO `studentsindex`(`IndexOfStudent`, `StudentNumber`, `FirstBookSelected`, `SecondBookSelected` ) VALUES ('"+presentNumber+"', '"+studentNumber+"', '"+firstBookSelected+"', '"+secondBookSelected+"')";
            String threeBooksBorrowed = "INSERT INTO `studentsindex`(`IndexOfStudent`, `StudentNumber`, `FirstBookSelected`, `SecondBookSelected`, `ThirdBookSelected`) VALUES ('"+presentNumber+"', '"+studentNumber+"', '"+firstBookSelected+"', '"+secondBookSelected+"' , '"+thirdBookSelected+"')";
            PreparedStatement [] execute = {connectToPhPAdmin.prepareStatement(oneBookBorrowed), connectToPhPAdmin.prepareStatement(twoBooksBorrowed), connectToPhPAdmin.prepareStatement(threeBooksBorrowed)};
            int studentIndex = 0;
            String studentNumberID = "";
            ResultSet selected = null;

            if(numberOfBorrowedBooks == 1){
                selected = studentsIndex[0];
            }else if(numberOfBorrowedBooks == 2){
                selected = studentsIndex[1];
            }else if(numberOfBorrowedBooks == 3){
                selected = studentsIndex[2];
            }

            while (selected.next()){
                studentIndex = selected.getInt(1);
                studentNumberID = selected.getString(2);
            }

            if(studentIndex != presentNumber && numberOfBorrowedBooks == 1 && !studentNumber.equals(studentNumberID) ){
                execute[0].execute();
            }else if (studentIndex != presentNumber && numberOfBorrowedBooks == 2 && !studentNumber.equals(studentNumberID) ){
                execute[1].execute();
            }else if(studentIndex != presentNumber && numberOfBorrowedBooks == 3 && !studentNumber.equals(studentNumberID) ){
                execute[2].execute();
            }else if(studentIndex == presentNumber){
                presentNumber+=1;
                if(numberOfBorrowedBooks == 1 && !studentNumber.equals(studentNumberID)){
                    execute[0].execute();
                }else if(numberOfBorrowedBooks == 2 && !studentNumber.equals(studentNumberID)){
                    execute[1].execute();
                }else if(numberOfBorrowedBooks == 3 && !studentNumber.equals(studentNumberID) ){
                    execute[2].execute();
                }
            }

            JOptionPane.showMessageDialog(null,"Your number is " + presentNumber);

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
