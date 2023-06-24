package pageutility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenrePage extends FramePage {
    private final JButton accountancy;
    private final JButton artsAndScience;
    private final JButton architecture;
    private final JButton business;
    private final JButton education;
    private final JButton engineering;
    private final JButton entrepreneurship;
    private final JButton borrowBooks;
    private final JButton searchBooks;
    private final JButton returnBooks;

    public GenrePage(){
        setTitle("Genre");
        PageUtility utils = new PageUtility();

        JLabel [] upperComponentsAndBackground = utils.getUpperElementsAndBackground(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\rtuLogo.png")
                ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\genrePageTitle.png"));
        JLabel collegesTitleUnderGenre = utils.createLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\collegesTitleUnderGenre.png")
                ,0, 69, 201, 59);

        //Books Genre
        accountancy = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\accountancy.png")
                , 0,127,201,55,0);
        artsAndScience = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\artsAndScience.png")
                ,0,182,201,55,0);
        architecture = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\architecture.png")
                ,0,237,201,55,0);
        business  = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\business.png")
                ,0,292,201,55,0);
        education = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\education.png")
                ,0,347,201,55,0);
        engineering  = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\engineering.png")
                ,0,401,201,55,0);
        entrepreneurship = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\entrepreneurship.png")
                ,0,455,201,55,0);

        //Three selection in genrePage
        borrowBooks = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\borrowBooks.png")
                , 250, 300, 190, 59, 50);
        searchBooks = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\searchBooks.png")
                , 370, 170, 190, 59, 50);
        returnBooks = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\returnBooks.png")
                , 500, 300, 190, 59, 50);

        JButton [] genreBooksAndOptions = {accountancy, artsAndScience, architecture, business, education, engineering, entrepreneurship, borrowBooks, searchBooks, returnBooks};

        add(collegesTitleUnderGenre);
        for (JButton booksAndOptions : genreBooksAndOptions){
            add(booksAndOptions);
        }
        for (JLabel upperElements : upperComponentsAndBackground){
            add(upperElements);
        }

    }

    public void allGenreAction(){
        JButton [] allGenreButton = {accountancy, artsAndScience, architecture, business, education, engineering, entrepreneurship};
        for (JButton actionListener : allGenreButton){
            actionListener.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (accountancy.hasFocus()){
                        setGenreBookImageAndFocusable(accountancy, accountancy, new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\accountancySelect.png"));
                    }else if(artsAndScience.hasFocus()){
                        setGenreBookImageAndFocusable(artsAndScience, artsAndScience, new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\artsAndScienceSelect.png"));
                    }else if (architecture.hasFocus()){
                        setGenreBookImageAndFocusable(architecture, architecture, new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\architectureSelect.png"));
                    }else if (business.hasFocus()){
                        setGenreBookImageAndFocusable(business, business, new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\businessSelect.png"));
                    }else if (education.hasFocus()){
                        setGenreBookImageAndFocusable(education, education, new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\educationSelect.png"));
                    }else if (engineering.hasFocus()){
                        setGenreBookImageAndFocusable(engineering, engineering, new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\engineeringSelect.png"));
                    }else if (entrepreneurship.hasFocus()){
                        setGenreBookImageAndFocusable(entrepreneurship, entrepreneurship, new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\entrepreneurshipSelect.png"));
                    }
                }
            });
        }
    }

    private void setGenreBookImageAndFocusable(JButton clickedButton, JButton genreButton, ImageIcon setImage){
        accountancy.setIcon(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\accountancy.png"));
        artsAndScience.setIcon(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\artsAndScience.png"));
        architecture.setIcon(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\architecture.png"));
        business.setIcon(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\business.png"));
        education.setIcon(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\education.png"));
        engineering.setIcon(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\engineering.png"));
        entrepreneurship.setIcon(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\entrepreneurship.png"));
        clickedButton.setFocusable(true);
        JButton [] allGenreButton = {accountancy, artsAndScience, architecture, business, education, engineering, entrepreneurship};
        for(JButton genreCategory : allGenreButton){
            genreCategory.setBackground(null);
        }
        genreButton.setBackground(Color.BLACK);
        genreButton.setIcon(setImage);
    }

    public boolean selectedGenre(){
        return accountancy.getBackground().equals(Color.BLACK) || artsAndScience.getBackground().equals(Color.BLACK) ||
                architecture.getBackground().equals(Color.BLACK) || business.getBackground().equals(Color.BLACK) ||
                education.getBackground().equals(Color.BLACK) || engineering.getBackground().equals(Color.BLACK) ||
                entrepreneurship.getBackground().equals(Color.BLACK);
    }

    public JButton borrowButton(){
        return borrowBooks;
    }

    public JButton searchButton(){
        return searchBooks;
    }

    public JButton returnButton(){
        return returnBooks;
    }

    public JButton [] accountancyButton(){
        return new JButton[]{accountancy, artsAndScience, architecture, business, education, engineering, entrepreneurship};
    }

}
