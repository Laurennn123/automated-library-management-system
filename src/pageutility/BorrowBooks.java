package pageutility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BorrowBooks extends FramePage{
    PageUtility page = new PageUtility();
    BorrowBooksUtility util = new BorrowBooksUtility();
    BooksDetailsUtility book = new BooksDetailsUtility();
    BorrowBooksUtility [] passingValue;
    private final JPanel bookDetailsContainer = page.createPanel("#ffc37c", 370, 150, 340, 280);
    private final JLabel frontPageImage = page.createLabel(new ImageIcon(),105,25, 125, 125);
    private final JLabel titleAlignment = util.createLabel(10,160,150,14,Font.BOLD,14);
    private final JLabel authorsAlignment = util.createLabel(10,180,150,14,Font.BOLD,14);
    private final JLabel ISBNAlignment = util.createLabel(10, 200, 150, 14,Font.BOLD,14);
    private final JLabel publisherAlignment = util.createLabel(10, 220, 150, 14,Font.BOLD,14);
    private final JLabel editionAlignment = util.createLabel(10, 240, 150, 14,Font.BOLD,14);
    private final JLabel titleOfBook = util.createLabel(85, 160, 250, 14,Font.PLAIN,12);
    private final JLabel authorsOfBook = util.createLabel(85, 180, 250, 14,Font.PLAIN,12);
    private final JLabel ISBNofBook = util.createLabel(85, 200, 200, 14,Font.PLAIN,12);
    private final JLabel publisherOfBook = util.createLabel(85, 220, 200, 14,Font.PLAIN,12);
    private final JLabel editionOfBook = util.createLabel(85, 240, 200, 14,Font.PLAIN,12);
    private final JLabel booksSelected = util.createLabel(30,10,110,20,Font.BOLD,11);
    private JButton book1Button, book2Button, book3Button, book4Button, book5Button, book6Button, book7Button, book8Button;
    private final JButton backButton;
    private final JButton nextButton;
    private int numberOfBooksSelected;
    private final ArrayList <String> dataForDatabase = new ArrayList<>();
    private String chosenBooks = "";

    public BorrowBooks(int index, JButton accountancy, JButton artsAndScience, JButton architecture, JButton business, JButton education, JButton engineering, JButton entrepreneurship){
        setTitle("Borrow Books");
        if (accountancy.getBackground().equals(Color.BLACK) || index == 1){
            setTitle("Accountancy Books");
            passingValue = new BorrowBooksUtility[]{book.managerial, book.financial, book.principle, book.manage,
                    book.perspective, book.inter, book.strategy, book.account};
        }else if(artsAndScience.getBackground().equals(Color.BLACK) || index == 2){
            setTitle("Arts and Science Books");
            passingValue = new BorrowBooksUtility[]{book.electron, book.artDoingScience, book.cosmos, book.exploring,
                    book.primaryCare, book.superForecasting, book.drawing, book.assembly};
        }else if(architecture.getBackground().equals(Color.BLACK) || index == 3){
            setTitle("Architecture Books");
            passingValue = new BorrowBooksUtility[]{book.art, book.basicConcept, book.buildingInfo, book.fundamentalsPrinciples,
                    book.tutorials, book.digitalEra, book.guideItalianArt, book.disciplineOrganizing};
        }else if(business.getBackground().equals(Color.BLACK) || index == 4){
            setTitle("Business Books");
            passingValue = new BorrowBooksUtility[]{book.fundamentalsLaw, book.financialBusinesses, book.communicationSuccess, book.exploringBusiness,
                    book.advancedBusinessLaw, book.ethicalOfBusiness, book.foundationBusinessLaw, book.business};
        }else if(education.getBackground().equals(Color.BLACK) || index == 5){
            setTitle("Education Books");
            passingValue = new BorrowBooksUtility[]{book.linearAlgebra, book.healthEducation, book.psychologyEduc, book.selfLearning,
                    book.mixedCourse, book.contemporaryWorld, book.ethics, book.purposiveCom};
        }else if(engineering.getBackground().equals(Color.BLACK) || index == 6){
            setTitle("Engineering Books");
            passingValue = new BorrowBooksUtility[]{book.assemblyLanguage, book.nationalServiceProgram2, book.calculus, book.engineeringMatlab,
                    book.fundamentalsOfElectricalEngineering, book.computerAided, book.objectOrientedPatterns, book.industrialEngineering};
        }else if(entrepreneurship.getBackground().equals(Color.BLACK) || index == 7){
            setTitle("Entrepreneurship Books");
            passingValue = new BorrowBooksUtility[]{book.learningCivil, book.ethicalDilemmas, book.owningYourFuture, book.entrepreneurshipAndInnovation,
                    book.mediaInnovationAndEntrepreneurship, book.introductionToEntrepreneurship, book.innovationAndEntrepreneurship, book.dulcansTextbook};
        }

        setUpOfDifferentBooksInGenre(passingValue[0], passingValue[1], passingValue[2], passingValue[3],
                passingValue[4], passingValue[5], passingValue[6], passingValue[7]);

        JLabel notesInBorrowing = page.createLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\notesInBorrowing.png"), 5, 85, 725, 59);
        JLabel titlesOfAvailableBooks = page.createLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\titlesOfAvailableBooks.png"), 40,145,280,36);
        JLabel backgroundContainer = page.createLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\backgroundDetailsContainer.png"), 370, 150, 340, 280);
        JButton viewSelectedBooksButton = page.createButton(new ImageIcon(), 175, 7, 160, 25, 10);
        viewSelectedBooksButton.setText("View Selected Books");
        viewSelectedBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOfBooksSelected == 0){
                    JOptionPane.showMessageDialog(null,"No seleceted books.");
                }else{
                    JOptionPane.showMessageDialog(null,"Selected Books:\n" + chosenBooks);
                }
            }
        });
        JPanel bottomContainerOfDetails = page.createPanel("#FFD3A3", 370, 430, 340, 40);
        bottomContainerOfDetails.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));
        bottomContainerOfDetails.add(booksSelected);
        bottomContainerOfDetails.add(viewSelectedBooksButton);

        //Back, reset, borrow and next button
        backButton = page.createButton(new ImageIcon(("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\backButton.png")),40,469,80,40,10);

        JButton resetButton = page.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\resetButton.png"),240,469,85,40,10);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberOfBooksSelected == 0){
                    JOptionPane.showMessageDialog(null, "Please select a book.");
                }
                numberOfBooksSelected = 0;
                booksSelected.setText(numberOfBooksSelected + " Books Selected");
                chosenBooks = chosenBooks.replaceAll(chosenBooks, "");
                dataForDatabase.clear();
                setEnabledButton();
                setDefaultImage(passingValue[0], passingValue[1], passingValue[2], passingValue[3],
                        passingValue[4], passingValue[5], passingValue[6], passingValue[7]);
            }
        });
        JButton borrowButton = page.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\borrowButton.png"), 370, 469, 86, 40, 10);
        borrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                booksSelected(passingValue[0], passingValue[1], passingValue[2], passingValue[3],
                        passingValue[4], passingValue[5], passingValue[6], passingValue[7]);
            }
        });
        booksSelected.setText(numberOfBooksSelected + " Books Selected");
        nextButton = page.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\nextButton.png"),635,469,86,40,10);

        add(backgroundContainer);
        add(bookDetailsContainer);
        add(titleAlignment);
        add(authorsAlignment);
        add(ISBNAlignment);
        add(publisherAlignment);
        add(editionAlignment);
        add(titleOfBook);
        add(authorsOfBook);
        add(ISBNofBook);
        add(publisherOfBook);
        add(editionOfBook);
        add(bottomContainerOfDetails);
        add(page.getUpperLeftLogo(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\borrowLogo.png")));
        add(page.getUpperTitle(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\borrowTitle.png")));
        add(notesInBorrowing);
        add(titlesOfAvailableBooks);
        add(backButton);
        add(resetButton);
        add(borrowButton);
        add(nextButton);
        add(page.getTopBackground());
        add(page.getHorizontalLine());
        add(page.getPageBackground());
    }

    //Methods
    public JButton backButton(){
        return backButton;
    }

    public JButton nextButton(){
        return nextButton;
    }

    public int getNumberOfBooksSelected(){
        return numberOfBooksSelected;
    }

    public void setBackToNoSelectedBooks(){
        numberOfBooksSelected = 0;
        booksSelected.setText(numberOfBooksSelected + " Books Selected");
        chosenBooks = chosenBooks.replaceAll(chosenBooks,"");
        setEnabledButton();
        dataForDatabase.clear();
        setDefaultImage(passingValue[0], passingValue[1], passingValue[2], passingValue[3],
                passingValue[4], passingValue[5], passingValue[6], passingValue[7]);
    }

    public ArrayList getSelectedBooks (){
        int indexOf2 = dataForDatabase.indexOf(1);
        if(String.valueOf(indexOf2).isEmpty()){
            dataForDatabase.add(1,"1");
        }
        return dataForDatabase;
    }

    private void setUpOfDifferentBooksInGenre(BorrowBooksUtility book1, BorrowBooksUtility book2, BorrowBooksUtility book3, BorrowBooksUtility book4,
    BorrowBooksUtility book5, BorrowBooksUtility book6, BorrowBooksUtility book7, BorrowBooksUtility book8){
        book1Button = (JButton)add(book1.createButton(40,180,280,36));
        book2Button = (JButton)add(book2.createButton(40,216,280,36));
        book3Button = (JButton)add(book3.createButton(40,252,280,36));
        book4Button = (JButton)add(book4.createButton(40,288,280,36));
        book5Button = (JButton)add(book5.createButton(40,324,280,36));
        book6Button = (JButton)add(book6.createButton(40,360,280,36));
        book7Button = (JButton)add(book7.createButton(40,396,280,36));
        book8Button = (JButton)add(book8.createButton(40,432,280,36));
        JButton [] booksAction = {book1Button,book2Button,book3Button,book4Button,
                book5Button,book6Button,book7Button,book8Button};
        for (JButton books :booksAction){
            books.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    booksNullAndSetDetails(book1,book2,book3,book4,book5,book6,book7,book8);
                    setImageClicked(book1,book2,book3,book4,book5,book6,book7,book8);
                }
            });
        }
    }

    private void booksNullAndSetDetails(BorrowBooksUtility book1, BorrowBooksUtility book2,  BorrowBooksUtility book3 , BorrowBooksUtility book4,BorrowBooksUtility book5
            , BorrowBooksUtility book6 , BorrowBooksUtility book7 , BorrowBooksUtility book8){
        setUnselectedBooksNull();
        if(book1Button.hasFocus()){
            book1Button.setBackground(Color.BLACK);
        }else if(book2Button.hasFocus()){
            book2Button.setBackground(Color.gray);
        }else if(book3Button.hasFocus()){
            book3Button.setBackground(Color.green);
        }else if(book4Button.hasFocus()){
            book4Button.setBackground(Color.lightGray);
        }else if(book5Button.hasFocus()){
            book5Button.setBackground(Color.cyan);
        }else if(book6Button.hasFocus()){
            book6Button.setBackground(Color.pink);
        }else if(book7Button.hasFocus()){
            book7Button.setBackground(Color.white);
        }else if(book8Button.hasFocus()){
            book8Button.setBackground(Color.magenta);
        }
        setDetailsText(book1,book2,book3,book4,book5,book6,book7,book8);
    }

    private void setDetailsText(BorrowBooksUtility selectedBook1, BorrowBooksUtility selectedBook2, BorrowBooksUtility selectedBook3, BorrowBooksUtility selectedBook4,
                                BorrowBooksUtility selectedBook5, BorrowBooksUtility selectedBook6, BorrowBooksUtility selectedBook7, BorrowBooksUtility selectedBook8){
        JLabel [] bookDetailsContainerElements = {frontPageImage, titleAlignment, authorsAlignment, ISBNAlignment, publisherAlignment, editionAlignment,
        titleOfBook, authorsOfBook, ISBNofBook, publisherOfBook, editionOfBook};
        for(JLabel elements : bookDetailsContainerElements){
            bookDetailsContainer.add(elements);
        }
        BorrowBooksUtility booksSelected = new BorrowBooksUtility();
        JButton [] selectedBooks = {book1Button, book2Button, book3Button, book4Button,
                book5Button, book6Button, book7Button, book8Button};
        for(JButton color :selectedBooks){
            if (color.getBackground().equals(Color.BLACK)){
                booksSelected = selectedBook1;
            }else if (color.getBackground().equals(Color.gray)){
                booksSelected = selectedBook2;
            }else if (color.getBackground().equals(Color.green)){
                booksSelected = selectedBook3;
            }else if (color.getBackground().equals(Color.lightGray)){
                booksSelected = selectedBook4;
            }else if (color.getBackground().equals(Color.cyan)){
                booksSelected = selectedBook5;
            }else if (color.getBackground().equals(Color.pink)){
                booksSelected = selectedBook6;
            }else if (color.getBackground().equals(Color.white)){
                booksSelected = selectedBook7;
            }else if (color.getBackground().equals(Color.magenta)){
                booksSelected = selectedBook8;
            }
        }
        titleAlignment.setText("Title");
        authorsAlignment.setText("Authors");
        ISBNAlignment.setText("ISBN");
        publisherAlignment.setText("Publisher");
        editionAlignment.setText("Edition");
        frontPageImage.setIcon(booksSelected.getFrontPageImage());
        titleOfBook.setText(booksSelected.getTitleOfBook());
        authorsOfBook.setText(booksSelected.getAuthors());
        ISBNofBook.setText(booksSelected.getISBN());
        publisherOfBook.setText(booksSelected.getPublisher());
        editionOfBook.setText(booksSelected.getEdition());
    }

    private void setImageClicked(BorrowBooksUtility book1, BorrowBooksUtility book2 , BorrowBooksUtility book3 , BorrowBooksUtility book4
            , BorrowBooksUtility book5 , BorrowBooksUtility book6 , BorrowBooksUtility book7 , BorrowBooksUtility book8){
        setDefaultImage(book1 ,book2 ,book3 ,book4 ,book5 ,book6 ,book7 ,book8);
        if(book1Button.hasFocus()){
            book1Button.setIcon(book1.getBookClicked());
        }else if(book2Button.hasFocus()){
            book2Button.setIcon(book2.getBookClicked());
        }else if(book3Button.hasFocus()){
            book3Button.setIcon(book3.getBookClicked());
        }else if(book4Button.hasFocus()){
            book4Button.setIcon(book4.getBookClicked());
        }else if(book5Button.hasFocus()){
            book5Button.setIcon(book5.getBookClicked());
        }else if(book6Button.hasFocus()){
            book6Button.setIcon(book6.getBookClicked());
        }else if(book7Button.hasFocus()){
            book7Button.setIcon(book7.getBookClicked());
        }else if(book8Button.hasFocus()){
            book8Button.setIcon(book8.getBookClicked());
        }
    }

    private void setDefaultImage(BorrowBooksUtility book1, BorrowBooksUtility book2, BorrowBooksUtility book3 , BorrowBooksUtility book4
            , BorrowBooksUtility book5 , BorrowBooksUtility book6 , BorrowBooksUtility book7 , BorrowBooksUtility book8 ){
        book1Button.setIcon(book1.getTitleOfBookButtonImage());
        book2Button.setIcon(book2.getTitleOfBookButtonImage());
        book3Button.setIcon(book3.getTitleOfBookButtonImage());
        book4Button.setIcon(book4.getTitleOfBookButtonImage());
        book5Button.setIcon(book5.getTitleOfBookButtonImage());
        book6Button.setIcon(book6.getTitleOfBookButtonImage());
        book7Button.setIcon(book7.getTitleOfBookButtonImage());
        book8Button.setIcon(book8.getTitleOfBookButtonImage());
    }

    private void booksSelected(BorrowBooksUtility book1, BorrowBooksUtility book2, BorrowBooksUtility book3, BorrowBooksUtility book4
            , BorrowBooksUtility book5 , BorrowBooksUtility book6 , BorrowBooksUtility book7 , BorrowBooksUtility book8){
        String space = "\n";
            if (numberOfBooksSelected == 3) {
            JOptionPane.showMessageDialog(null, "3 books only.");
            }
            else if (book1Button.getBackground().equals(Color.BLACK)) {
                book1Button.setEnabled(false);
                dataForDatabase.add(book1.getTitleOfBook());
                chosenBooks += book1.getTitleOfBook();
            } else if (book2Button.getBackground().equals(Color.gray)) {
                book2Button.setEnabled(false);
                dataForDatabase.add(book2.getTitleOfBook());
                chosenBooks += book2.getTitleOfBook();
            } else if (book3Button.getBackground().equals(Color.green)) {
                book3Button.setEnabled(false);
                dataForDatabase.add(book3.getTitleOfBook());
                chosenBooks += book3.getTitleOfBook();
            } else if (book4Button.getBackground().equals(Color.lightGray)) {
                book4Button.setEnabled(false);
                dataForDatabase.add(book4.getTitleOfBook());
                chosenBooks += book4.getTitleOfBook();
            } else if (book5Button.getBackground().equals(Color.cyan)) {
                book5Button.setEnabled(false);
                dataForDatabase.add(book5.getTitleOfBook());
                chosenBooks += book5.getTitleOfBook();
            } else if (book6Button.getBackground().equals(Color.pink)) {
                book6Button.setEnabled(false);
                dataForDatabase.add(book6.getTitleOfBook());
                chosenBooks += book6.getTitleOfBook();
            } else if (book7Button.getBackground().equals(Color.white)) {
                book7Button.setEnabled(false);
                dataForDatabase.add(book7.getTitleOfBook());
                chosenBooks += book7.getTitleOfBook();
            } else if (book8Button.getBackground().equals(Color.magenta)) {
                book8Button.setEnabled(false);
                dataForDatabase.add(book8.getTitleOfBook());
                chosenBooks += book8.getTitleOfBook();
            } else if (numberOfBooksSelected == 1 || numberOfBooksSelected == 2) {
                JOptionPane.showMessageDialog(null, "1 per books only.");
                return;
            } else if (numberOfBooksSelected == 0) {
                JOptionPane.showMessageDialog(null, "Please select a book.");
            }

            if(numberOfBooksSelected != 3){
                numberOfBooksSelected += 1;
                chosenBooks += space;
                booksSelected.setText(numberOfBooksSelected + " Books Selected");
                setUnselectedBooksNull();
            }
    }

    private void setUnselectedBooksNull(){
        JButton [] allBooks = {book1Button, book2Button, book3Button, book4Button, book5Button
                ,book6Button, book7Button, book8Button};
        for(JButton books : allBooks){
            books.setBackground(null);
        }
    }

    private void setEnabledButton(){
        JButton [] allBooks = {book1Button, book2Button, book3Button, book4Button, book5Button
                ,book6Button, book7Button, book8Button};
        for(JButton books : allBooks){
            books.setEnabled(true);
        }
    }

}
