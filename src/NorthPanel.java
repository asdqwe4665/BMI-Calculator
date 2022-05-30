import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {

    private final JLabel BMICalculator;

    public NorthPanel() {
        this.BMICalculator = new JLabel("BMI Calculator");
        add(BMICalculator);
        setBackground(Color.GREEN);
    }
}
