import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Model extends JPanel {

    private final NorthPanel northPanel;
    private final CenterPanel centerPanel;
    private final SouthPanel southPanel;
    private final EastPanel eastPanel;
    private final WestPanel westPanel;

    private double height;
    private double slimness;
    private String ageText;
    private double age;
    private String weightText;
    private double weight;

    public Model () {
        northPanel = new NorthPanel();
        southPanel = new SouthPanel();
        westPanel = new WestPanel();
        eastPanel = new EastPanel();
        centerPanel = new CenterPanel();
        setLayout(new BorderLayout());
        add(northPanel,BorderLayout.NORTH);
        add(southPanel,BorderLayout.SOUTH);
        add(westPanel,BorderLayout.WEST);
        add(eastPanel,BorderLayout.EAST);
        add(centerPanel,BorderLayout.CENTER);

        southPanel.getSubmitButton().addActionListener(e -> {
            Control control =new Control(height,weight,age,slimness);
            JOptionPane.showMessageDialog(null,"Your BMI is : "+control.getBMI()+"\n" +
                    "And you body status is: "+control.getWeightStatus()+ "\n\nYour ideal weight is: "+
                    control.getIdealWeight()+"\nAnd your Actual Weight is: "+weight);

        });

        eastPanel.getHeightSlider().addChangeListener(e -> {
            height = eastPanel.getHeightSlider().getValue();
        });

        centerPanel.getSmallRadioButton().addItemListener(e -> {
            slimness=0.9;
        });
        centerPanel.getMediumRadioButton().addItemListener(e -> {
            slimness=1;
        });
        centerPanel.getLargeRadioButton().addItemListener(e -> {
            slimness=1.1;
        });

        westPanel.getAgeTextField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                ageText= westPanel.getAgeTextField().getText();
                age =Integer.parseInt(ageText);
            }
        });

        eastPanel.getActualWeightField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                weightText=eastPanel.getActualWeightField().getText();
                weight=Integer.parseInt(weightText);
            }
        });


        southPanel.getClearButton().addActionListener(e -> {
            westPanel.setFirstNameTextField();
            westPanel.setLastNameTextField();
            westPanel.setAgeTextField();
            eastPanel.setActualWeightField();

            centerPanel.clearBodyFrameGroup();
            westPanel.clearGenderGroup();

            eastPanel.clearHeightSlider();



        });









    }


}
