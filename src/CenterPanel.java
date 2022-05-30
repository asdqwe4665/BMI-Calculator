import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    private JLabel bodyFrame;
    private JRadioButton smallRadioButton;
    private JRadioButton largeRadioButton;
    private JRadioButton mediumRadioButton;
    private ButtonGroup bodyFrameGroup;



    public JRadioButton getSmallRadioButton() {
        return smallRadioButton;
    }

    public JRadioButton getLargeRadioButton() {
        return largeRadioButton;
    }

    public JRadioButton getMediumRadioButton() {
        return mediumRadioButton;
    }

    public void clearBodyFrameGroup() {
        this.bodyFrameGroup.clearSelection();
    }



    public CenterPanel () {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        bodyFrame = new JLabel("Body Frame: ");
        smallRadioButton = new JRadioButton("Small");
        mediumRadioButton = new JRadioButton("Medium");
        largeRadioButton = new JRadioButton("Large");
        bodyFrameGroup = new ButtonGroup();
        bodyFrameGroup.add(smallRadioButton);
        bodyFrameGroup.add(mediumRadioButton);
        bodyFrameGroup.add(largeRadioButton);

        bodyFrame.setLabelFor(largeRadioButton);

        add(bodyFrame);
        add(smallRadioButton);
        add(mediumRadioButton);
        add(largeRadioButton);
        setBackground(Color.YELLOW);






    }

}
