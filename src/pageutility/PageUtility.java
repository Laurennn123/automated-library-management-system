package pageutility;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PageUtility{

    private static class RoundedBorder implements Border {
        private final int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    public JPanel createPanel(String colorDecode, int x, int y, int width, int height){
        JPanel detailsContainer = new JPanel();
        detailsContainer.setBounds(x,y,width,height);
        detailsContainer.setBackground(Color.decode(colorDecode));
        detailsContainer.setLayout(null);
        return detailsContainer;
    }

    public JLabel createLabel(ImageIcon labelImage, int x, int y, int width, int height){
        JLabel label = new JLabel(labelImage);
        label.setBounds(x,y,width,height);
        return label;
    }
    public JLabel createLabelWithoutImage(String labelName, int x, int y, int width, int height, Font font){
        JLabel label = new JLabel(labelName);
        label.setBounds(x,y,width,height);
        label.setFont(font);
        return label;
    }

    public JButton createButton (ImageIcon buttonImage,int x, int y, int width, int height, int radius){
        JButton button = new JButton(buttonImage);
        button.setBounds(x,y,width,height);
        button.setBorder(new RoundedBorder(radius));
        button.setOpaque(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        return button;
    }

    public JTextField createTextField(int x, int y, int width, int height){
        JTextField textField = new JTextField();
        textField.setBounds(x,y,width,height);
        return textField;
    }

    public JLabel [] getUpperElementsAndBackground(ImageIcon upperLeftLogo, ImageIcon upperTitle){
        JLabel logo = getUpperLeftLogo(upperLeftLogo);
        JLabel title = getUpperTitle(upperTitle);
        JLabel topBackground = getTopBackground();
        JLabel horizontalLine = getHorizontalLine();
        JLabel pageBackground = getPageBackground();
        return new JLabel[]{logo ,title ,topBackground ,horizontalLine,pageBackground};
    }

    public JLabel getUpperLeftLogo(ImageIcon picture) {
        JLabel upperLeftLogo = new JLabel(picture);
        upperLeftLogo.setBounds(20, 10, 50, 50);
        return upperLeftLogo;
    }

    public JLabel getUpperTitle(ImageIcon picture) {
        JLabel upperTitle = new JLabel(picture);
        upperTitle.setBounds(75, 0, 325, 75);
        return upperTitle;
    }

    public JLabel getTopBackground() {
        JLabel topBackground = new JLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\topBackgroundOfFrame.png"));
        topBackground.setBounds(0,0,750,68);
        return topBackground;
    }

    public JLabel getHorizontalLine() {
        JLabel horizontalLine = new JLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\horizontalLine.png"));
        horizontalLine.setBounds(0,67,750,2);
        return horizontalLine;
    }

    public JLabel getPageBackground() {
        JLabel pageBackground = new JLabel(new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\genrePageImage\\pageBackgroundOfFrame.png"));
        pageBackground.setBounds(0,68,750,450);
        return pageBackground;
    }

}
