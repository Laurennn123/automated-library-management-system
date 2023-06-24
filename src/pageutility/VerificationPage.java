package pageutility;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class VerificationPage extends FramePage{
    private final JButton backButtonToSelectedGenre;
    private final JButton nextButtonToStudentDetails;
    private final JTextField studentNumberTextField;

    public VerificationPage(){
        setTitle("Student Number");
        PageUtility utils = new PageUtility();

        studentNumberTextField = utils.createTextField(200,45,170,40);
        studentNumberTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        JLabel [] upperComponentsAndBackground = utils.getUpperElementsAndBackground(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\verificationPageImage\\studentLogo.png")
                ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\verificationPageImage\\inputStudentNumberLabel.png"));

        JLabel studentNumberLabel = utils.createLabel(new ImageIcon(),26,20,160,90);
        studentNumberLabel.setText("Student Number");
        studentNumberLabel.setFont(new Font("sans=serif",Font.BOLD,17));

        JPanel studentNumberContainer = utils.createPanel("#FFD3A3",155,180,440,130);
        studentNumberContainer.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.BLACK));
        studentNumberContainer.add(studentNumberLabel);
        studentNumberContainer.add(studentNumberTextField);

        backButtonToSelectedGenre = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\verificationPageImage\\backButton.png"),100,450,80,40,0);
        nextButtonToStudentDetails = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\verificationPageImage\\nextButton.png"),560,450,80,40,0);

        add(studentNumberContainer);
        add(backButtonToSelectedGenre);
        add(nextButtonToStudentDetails);
        for(JLabel upperComponents : upperComponentsAndBackground){
            add(upperComponents);
        }

    }

    public JButton getBackButtonToSelectedGenre(){
        return backButtonToSelectedGenre;
    }

    public JButton getNextButtonToDetailsBorrower(){
        return nextButtonToStudentDetails;
    }

    public JTextField getTextField(){
        return studentNumberTextField;
    }

    public boolean letters(char [] notValid, char [] input){
        for(char letters : notValid){
            for (char inputted : input){
                if(letters == inputted){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean registeredOrNot(int numberOfBorrowedBooks, String studentNumber, String tableName, String selectColumn, String firstBookSelected, String secondBookSelected, String thirdBookSelected ){
        char [] lettersAndSpecialCharacter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '~', '!', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '|'};
        int columnIndex;
        if(numberOfBorrowedBooks == 1 && selectColumn.isEmpty()){
            selectColumn = "FirstBookSelected";
            columnIndex = 1;
        }else if(numberOfBorrowedBooks == 2 && selectColumn.isEmpty()){
            selectColumn = "SecondBookSelected";
            columnIndex = 1;
        }else if(numberOfBorrowedBooks == 3 && selectColumn.isEmpty()){
            selectColumn = "ThirdBookSelected";
            columnIndex = 1;
        }else{
            columnIndex = 1;
        }

        try{
            Connection connectToPhPAdmin = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsinformation","root","");
            Statement creatingStatement = connectToPhPAdmin.createStatement();
            ResultSet resultSet = creatingStatement.executeQuery("SELECT " +selectColumn+ " FROM " +tableName+ "");
            ArrayList<String> studentNumberRegistered = new ArrayList<>();

            while (resultSet.next()){

                if(resultSet.getString(columnIndex) == null){
                    studentNumberRegistered.add(0,"null");
                }else{
                    studentNumberRegistered.add(resultSet.getString(columnIndex));
                }
            }

            boolean ifHaveOrNot = true;
            while (ifHaveOrNot){

                for(Object database : studentNumberRegistered){
                    if(database == null){
                        continue;
                    }else{
                        database.toString();
                    }
                    if (database.equals(studentNumber) && tableName.equals("studentsdetails")) {//12312312
                            return true;
                        }else if (database.equals(studentNumber) && tableName.equals("studentsindex")) {//Checking for student number if already borrowed
                            JOptionPane.showMessageDialog(null, "You already borrowed a books.");
                            return false;
                        } else if (letters(lettersAndSpecialCharacter, studentNumberTextField.getText().toCharArray())) {
                            JOptionPane.showMessageDialog(null, "Invalid input.");
                            return false;
                        } else if (studentNumberTextField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please input your student number.");
                            return false;
                        }else if(firstBookSelected.equals(database) || secondBookSelected.equals(database) || thirdBookSelected.equals(database)){
                        String selectedBook = "";
                        if(numberOfBorrowedBooks == 1){
                            selectedBook = firstBookSelected;
                        }else if(numberOfBorrowedBooks == 2){
                            selectedBook = secondBookSelected;
                        }else if(numberOfBorrowedBooks == 3){
                            selectedBook = thirdBookSelected;
                        }
                        JOptionPane.showMessageDialog(null, "Your selected book "+selectedBook+" is out of stocks.");
                            return false;
                        }else if(tableName.equals("studentsdetails") && database.equals("2022-322192")){
                            if(!studentNumberRegistered.contains(studentNumber)){
                            JOptionPane.showMessageDialog(null, "No registered student number.");
                            return false;
                        }
                    }
                        ifHaveOrNot = false;
                }

            }

        }catch (SQLException e){
            e.printStackTrace();
        }catch (NullPointerException a){
            return false;
        }
        return true;
    }

    public String [] studentNumberInputAndDetails(){
        String [] studentDetails = new String[5];
        try{
            Connection connectToPhPAdmin = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsinformation","root","");
            Statement creatingStatement = connectToPhPAdmin.createStatement();
            ResultSet resultSet = creatingStatement.executeQuery("SELECT StudentNumber, FirstName, LastName, CollegeCourse, CurrentYear FROM StudentsDetails");
            String studentNumberID = studentNumberTextField.getText();

            while (resultSet.next()) {
                String studentNumber = resultSet.getString(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String collegeCourse = resultSet.getString(4);
                String currentYear = resultSet.getString(5);
                if(studentNumberID.equals(studentNumber)){
                    studentDetails[0] = studentNumberID;
                    studentDetails[1] = firstName;
                    studentDetails[2] = lastName;
                    studentDetails[3] = collegeCourse;
                    studentDetails[4] = currentYear;
                }
            }

        }catch (SQLException sql){
            sql.printStackTrace();
        }

        return studentDetails;
    }

}
