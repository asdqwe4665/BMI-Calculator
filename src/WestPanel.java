import javax.swing.*;
import java.awt.*;

public class WestPanel extends JPanel {

    private JLabel lastName;
    private JLabel firstName;
    private JLabel age;
    private JLabel gender;

    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField ageTextField;

    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private ButtonGroup genderGroup;

    public void setFirstNameTextField() {
        this.firstNameTextField.setText("");
    }

    public void setLastNameTextField() {
        this.lastNameTextField.setText("");
    }

    public JTextField getAgeTextField() {
        return ageTextField;
    }

    public void setAgeTextField() {
        this.ageTextField.setText("");
    }

    public void clearGenderGroup() {
        this.genderGroup.clearSelection();
    }

    public WestPanel () {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        lastName=new JLabel("Last Name: ");
        firstName=new JLabel("First Name: ");
        age=new JLabel("Age: ");
        gender=new JLabel("Gender: ");

        firstNameTextField=new JTextField();
        firstNameTextField.setPreferredSize(new Dimension(70,20));
        lastNameTextField=new JTextField();
        lastNameTextField.setPreferredSize(new Dimension(70,20));
        ageTextField=new JTextField();
        ageTextField.setPreferredSize(new Dimension(70,20));

        maleRadioButton=new JRadioButton("Male");
        femaleRadioButton=new  JRadioButton("Female");
        genderGroup=new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        add(firstName);
        add(firstNameTextField);
        add(lastName);
        add(lastNameTextField);
        add(age);
        add(ageTextField);
        add(gender);
        add(maleRadioButton);
        add(femaleRadioButton);
        setBackground(Color.YELLOW);

    }

}
