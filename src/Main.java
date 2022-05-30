import javax.swing.*;

public class Main { // View
    public static void main(String[] args) {

        JFrame frame = new JFrame("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Model());
        frame.setSize(2000,1200);
        frame.pack();
        frame.setVisible(true);

    }
}
