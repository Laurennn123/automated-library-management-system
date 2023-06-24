package pageutility;

import javax.swing.*;
import java.awt.*;

public class StartPage extends FramePage{
    private final JProgressBar percentageBarToHomePage;
    private final JLabel percentageLabel;
    private int startAt = 0;

    private void startOfPercentage(){
        while (startAt <= 100){
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            startAt+=1;
            percentageLabel.setText(String.valueOf(startAt) + "%");
            percentageBarToHomePage.setValue(startAt);
        }
    }

    public StartPage(){
        PageUtility utils = new PageUtility();

        JLabel rtuLogo = utils.createLabel(new ImageIcon(getClass().getResource("../startpageimages/rtuLogo.png")),185,10,80,70);
        JLabel libraryImage = utils.createLabel(new ImageIcon(getClass().getResource("../startpageimages/libraryImage.png")),50,90,350,160);
        JLabel backgroundColor = utils.createLabel(new ImageIcon(getClass().getResource("../startpageimages/backgroundColorOrange.png")),0,0,450,300);
        percentageLabel = utils.createLabel(new ImageIcon(),185,250,80,50);
        percentageLabel.setForeground(Color.decode("#0e1753"));
        percentageLabel.setFont(new Font(Font.DIALOG, Font.BOLD,22));

        percentageBarToHomePage = new JProgressBar();
        percentageBarToHomePage.setForeground(Color.decode("#0e1753"));
        percentageBarToHomePage.setBorderPainted(false);
        percentageBarToHomePage.setBackground(Color.decode("#ffc37c"));
        percentageBarToHomePage.setBounds(0,290,450,10);

        add(rtuLogo);
        add(percentageLabel);
        add(libraryImage);
        add(percentageBarToHomePage);
        add(backgroundColor);

        setSize(450,300);
        setLocationRelativeTo(null);
        startOfPercentage();
    }

    public int getStartAt(){
        return startAt;
    }

}

