package pageutility;

import javax.swing.*;

public class HomePage extends FramePage{
    private final JButton startButton;

    public HomePage(){
        setTitle("Home");
        PageUtility utils = new PageUtility();

        JLabel topBackGround = utils.createLabel(new ImageIcon(getClass().getResource("../homePageImage/topBackGround.png"))
                ,0,0,500,68);
        JLabel horizontalLine = utils.createLabel(new ImageIcon(getClass().getResource("../homePageImage/horizontalLine.png")),
                0,67,500,2);
        JLabel backgroundUnderOfTop = utils.createLabel(new ImageIcon(getClass().getResource("../homePageImage/backgroundUnderOfTop.png")),
                0,68,500,450);
        JLabel rtuLogo = utils.createLabel(new ImageIcon(getClass().getResource("../homePageImage/rtuLogo.png")),
                7,65,150,150);
        JLabel verticalLine = utils.createLabel(new ImageIcon(getClass().getResource("../homePageImage/verticalLine.png"))
        ,140,90,3,100);
        JLabel automatedLibraryTitle = utils.createLabel(new ImageIcon(getClass().getResource("../homePageImage/automatedLibraryTitle.png"))
        ,140,90,325,100);
        JLabel rtuHomePageImage = utils.createLabel(new ImageIcon(getClass().getResource("../homePageImage/rtuHomePageImage.png"))
                ,43,205,400,250);

        startButton = utils.createButton(new ImageIcon(getClass().getResource("../homePageImage/startButton.png"))
        ,345, 465, 100, 40,10);

        JLabel [] homePageElements = {topBackGround, horizontalLine, rtuLogo, verticalLine, automatedLibraryTitle, rtuHomePageImage};

        for (JLabel elements : homePageElements){
            add(elements);
        }
        add(startButton);
        add(backgroundUnderOfTop);

        setSize(500,511);
        setLocationRelativeTo(null);
    }

    public JButton startButton(){
        return startButton;
    }

}
