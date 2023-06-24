package pageutility;

import javax.swing.*;
import java.awt.*;

public class BorrowBooksUtility {
    private String titleOfBook;
    private String authors;
    private String ISBN;
    private String publisher;
    private String edition;
    private ImageIcon frontPageImage;
    private ImageIcon titleOfBookButtonImage;
    private ImageIcon bookClicked;

    public BorrowBooksUtility(){

    }

    public BorrowBooksUtility(String titleOfBook, String authors, String ISBN, String publisher, String edition, ImageIcon frontPageImage, ImageIcon titleOfBookButtonImage, ImageIcon bookClicked) {
        this.titleOfBook = titleOfBook;
        this.authors = authors;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.edition = edition;
        this.frontPageImage = frontPageImage;
        this.titleOfBookButtonImage = titleOfBookButtonImage;
        this.bookClicked = bookClicked;
    }

    public JButton createButton(int x, int y, int width, int height){
        JButton bookButton = new JButton(this.titleOfBook,this.titleOfBookButtonImage);
        bookButton.setBounds(x,y,width,height);
        return bookButton;
    }

    public JLabel createLabel(int x, int y, int width, int height, int boldOrNot,int sizesOfFont){
        JLabel bookLabel = new JLabel();
        bookLabel.setBounds(x,y,width,height);
        bookLabel.setFont(new Font(Font.SANS_SERIF,boldOrNot,sizesOfFont));
        return bookLabel;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public String getAuthors() {
        return authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getEdition() {
        return edition;
    }

    public ImageIcon getFrontPageImage() {
        return frontPageImage;
    }

    public ImageIcon getBookClicked() {
        return bookClicked;
    }

    public ImageIcon getTitleOfBookButtonImage() {
        return titleOfBookButtonImage;
    }
}
