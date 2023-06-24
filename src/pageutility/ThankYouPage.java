package pageutility;

import javax.swing.*;

public class ThankYouPage extends FramePage{
    private final JButton goToHomepage;

    public ThankYouPage(){
        PageUtility utils = new PageUtility();

        goToHomepage = utils.createButton(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\thankyoupageimages\\exitButton.png"),600,430,86,40,0);
        JLabel [] upperElementsAndBackground = utils.getUpperElementsAndBackground(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\thankyoupageimages\\rtuLogo.png"),
                new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\thankyoupageimages\\systemTitle.png"));
        JLabel thankYouMessage = utils.createLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\thankyoupageimages\\thankyouMessage.png")
                ,125,20,500,500);

        add(goToHomepage);
        add(thankYouMessage);
        for(JLabel background : upperElementsAndBackground){
            add(background);
        }

    }

    public JButton getGoToHompage(){
        return goToHomepage;
    }

}
