package pageutility;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class ReturnBooks extends FramePage{
    private final JButton submitButton;
    private final JButton backButtonToGenrePage;
    private final JTextField studentNumberTextField;

    public ReturnBooks(){
        setTitle("Return Books");
        PageUtility utils = new PageUtility();

        JLabel returnBooksTitle = utils.createLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\returnbooksimages\\returnBooksTitle.png"),75,50,200,100);
        JLabel [] upperComponentsAndBackground = utils.getUpperElementsAndBackground(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\returnbooksimages\\returnLogo.png"),
                new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\returnbooksimages\\returnBooksLabel.png"));

        studentNumberTextField = utils.createTextField(65,130,220,30);
        studentNumberTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        backButtonToGenrePage = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\returnbooksimages\\backButton.png"),20,178,80,40,0);
        submitButton = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\returnbooksimages\\submitButton.png"),140,180,80,35,0);

        add(returnBooksTitle);
        add(studentNumberTextField);
        add(submitButton);
        add(backButtonToGenrePage);
        for (JLabel elements : upperComponentsAndBackground){
            add(elements);
        }

        setSize(350,250);
        setLocationRelativeTo(null);
    }

    public JButton getBackButtonToGenrePage(){
        return backButtonToGenrePage;
    }

    public JButton getSubmitButton(){
        return submitButton;
    }

    public JTextField getStudentNumberTextField(){
        return studentNumberTextField;
    }

    public void conditionIfHaveBorrowedBooks(JFrame returnBooks, JFrame genrePage){
        try{
            Connection connectToPhPAdmin = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsinformation","root","");
            Statement creatingStatement = connectToPhPAdmin.createStatement();
            ResultSet resultSet = creatingStatement.executeQuery("SELECT StudentNumber FROM studentsindex");
            PreparedStatement delete = connectToPhPAdmin.prepareStatement("DELETE FROM studentsindex WHERE StudentNumber = ?");
            ArrayList<String> studentNumber = new ArrayList<>();

            while (resultSet.next()){
                studentNumber.add(resultSet.getString(1));
            }
            boolean notFound = true;
            while (notFound){

                for (Object database : studentNumber){
                    database.toString();
                    if(studentNumberTextField.getText().equals(database)){
                        delete.setString(1,studentNumberTextField.getText());
                        delete.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Thank you for returning the books!");
                        returnBooks.setVisible(false);
                        genrePage.setVisible(true);
                    }
                    notFound = false;
                }

                if(studentNumberTextField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please input your student number.");
                }else if(returnBooks.isVisible()){
                    JOptionPane.showMessageDialog(null, "No registered student number.");
                }

            }

        }catch (SQLException sql){
            sql.printStackTrace();
        }
    }



}
