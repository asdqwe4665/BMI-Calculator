import javax.swing.*;
import java.awt.*;

public class EastPanel extends JPanel {

    private JSlider heightSlider;
    private JLabel actualWeight;
    private JTextField actualWeightField;
    private JLabel height;


    public JTextField getActualWeightField() {
        return actualWeightField;
    }

    public void setActualWeightField() {
        this.actualWeightField.setText("");
    }



    public JSlider getHeightSlider() {
        return heightSlider;
    }

    public void clearHeightSlider() {
        this.heightSlider.setValue(140);
    }




    public EastPanel () {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        height = new JLabel("Height: ");
        heightSlider=new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        heightSlider.setMajorTickSpacing(10);
        heightSlider.setMinorTickSpacing(5);
        heightSlider.createStandardLabels(10,140);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);

        actualWeight = new JLabel("Actual Weight: ");
        actualWeightField = new JTextField();
        actualWeightField.setPreferredSize(new Dimension(20,20));

        height.setLabelFor(heightSlider);

        add(height);
        add(heightSlider);
        add(actualWeight);
        add(actualWeightField);
        setBackground(Color.YELLOW);






    }


}
