package pageutility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Locale;

public class SearchBooks extends FramePage{
    private DefaultListModel defaultListModel = new DefaultListModel();
    private final JList listOfAllBooks;
    private final JButton backButton;

    public SearchBooks(){
        setTitle("Search Books");
        PageUtility page = new PageUtility();
        listOfAllBooks = new JList();
        listOfAllBooks.setBounds(27,142,296,16);
        listOfAllBooks.setSize(295,155);
        listOfAllBooks.setBackground(Color.decode("#7fb77e"));
        listOfAllBooks.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));
        listOfAllBooks.setFont(new Font(Font.SERIF,Font.BOLD,10));
        JLabel searchTitle = page.createLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\searchBooksImage\\searchTitle.png"),
                23,70,100,50);

        backButton = page.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\searchBooksImage\\backButton.png"),
                138,303,80,40,10);

        JTextField searchField = page.createTextField(130,80,200,30);
        searchField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(searchField.getText().isEmpty()){
                    ArrayList<String> setBlank = new ArrayList<>();
                    DefaultListModel blank = new DefaultListModel();
                    setBlank.add("");
                    for(Object setToEmpty : setBlank){
                        blank.addElement(setToEmpty);
                    }
                    defaultListModel = blank;
                    listOfAllBooks.setModel(defaultListModel);
                }else {
                    appearAvailableBooks(searchField.getText());
                }

            }
        });

        add(searchTitle);
        add(searchField);
        add(listOfAllBooks);
        add(backButton);
        add(page.getUpperLeftLogo(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\searchBooksImage\\libraryLogo.png")));
        add(page.getUpperTitle(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\searchBooksImage\\availableBooksTitle.png")));
        add(page.getTopBackground());
        add(page.getHorizontalLine());
        add(page.getPageBackground());
        setSize(350,350);
        setLocationRelativeTo(null);
    }

    public JButton backButton(){
        return backButton;
    }

    private void appearAvailableBooks(String searchBarInput){
        DefaultListModel temporaryModel = new DefaultListModel();
        ArrayList<String> booksAvailable = new ArrayList<>();
        booksAvailable.add("Principles of Managerial Accounting");
        booksAvailable.add("Introduction to Financial Accounting:U.S. GAAP Adaptation");
        booksAvailable.add("Principles of Financial Accounting");
        booksAvailable.add("Managerial Accounting");
        booksAvailable.add("Accounting Principles:A Business Perspective");
        booksAvailable.add("Intermediate Financial Accounting Volume 2");
        booksAvailable.add("Financial Strategy for Public Managers");
        booksAvailable.add("Principles of Accounting Volume 2 Managerial Accounting");
        booksAvailable.add("Electromagnetism and the Metonymic Imagination");
        booksAvailable.add("The Art of Doing Science and Engineering: Learning to Learn");
        booksAvailable.add("Visions from the Frontier of Deep Space Exploration");
        booksAvailable.add("A Brief Introduction to Art, Theatre, Music, and Dance");
        booksAvailable.add("Primary Care and Science of Advanced Practice Nursing");
        booksAvailable.add("Superforecasting: The Art and Science of Prediction");
        booksAvailable.add("The Art and Science of Drawing:Learn to Observe Any Subject");
        booksAvailable.add("The Art and Science of Ernst Haeckel");
        booksAvailable.add("Assembly");
        booksAvailable.add("NSTP 2");
        booksAvailable.add("Calculus");
        booksAvailable.add("A Brief Introduction to Engineering Computation with MATLAB");
        booksAvailable.add("Fundamentals of Electrical Engineering I");
        booksAvailable.add("Computer Aided Exercises in Civil Procedure - 7th Edition");
        booksAvailable.add("Object-Oriented Reengineering Patterns");
        booksAvailable.add("Introduction to Industrial Engineering");
        booksAvailable.add("Fundamentals of Business Law");
        booksAvailable.add("Financial Management for Small Businesses:Value Models");
        booksAvailable.add("Business Communication for Success");
        booksAvailable.add("Exploring Business");
        booksAvailable.add("Advanced Business Law and the Legal Environment");
        booksAvailable.add("The Legal and Ethical Environment of Business");
        booksAvailable.add("Foundations of Business Law and Legal Environment");
        booksAvailable.add("Fundamentals of Business");
        booksAvailable.add("A First Course in Linear Algebra");
        booksAvailable.add("Health Education");
        booksAvailable.add("Educational Psychology");
        booksAvailable.add("Self-directed multimodal learning in higher education");
        booksAvailable.add("A Mixed Course-Based Research Approach to Human Physiology");
        booksAvailable.add("The Contemporary World");
        booksAvailable.add("Ethics");
        booksAvailable.add("Purposive Communication");
        booksAvailable.add("Learning Civil Procedure");
        booksAvailable.add("Ethical Dilemmas and Decisions in Criminal Justice");
        booksAvailable.add("Student Activity for Entrepreneurship: Owning Your Future");
        booksAvailable.add("Entrepreneurship and Innovation Toolkit");
        booksAvailable.add("Media Innovation and Entrepreneurship");
        booksAvailable.add("Introduction to Entrepreneurship");
        booksAvailable.add("Sustainability, Innovation and Entrepreneurship");
        booksAvailable.add("Dulcan's Textbook of Child and Adolescent Psychiatry");

        for (Object allAvailableBooks : booksAvailable){
            String toLowerCase = allAvailableBooks.toString().toLowerCase(Locale.ROOT); //for search bar if they type is in small letter
            String upperCase = allAvailableBooks.toString().toUpperCase(Locale.ROOT);
            if (toLowerCase.contains(searchBarInput) || upperCase.contains(searchBarInput)){
                temporaryModel.addElement(allAvailableBooks);
            }
        }
        defaultListModel = temporaryModel;
        listOfAllBooks.setModel(defaultListModel);
    }

}
