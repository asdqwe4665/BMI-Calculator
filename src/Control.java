public class Control {
    private double height;
    private double weight;
    private double age;
    private double slimness;
    double bmi;


    public Control(double height,double weight,double age,double slimness)
    {
        this.height=height;
        this.weight=weight;
        this.age=age;
        this.slimness = this.slimness;
    }
    public double getBMI()
    {
        bmi=weight/(Math.pow((height*0.01),2));
        return bmi;
    }

    public double getIdealWeight()
    {
        return (height-100+(age/10))*0.9* slimness;
    }

    public String getWeightStatus () {
        if (bmi < 15) {
            return "Anorexic";
        }
        if (bmi >= 15 && bmi < 18.5) {
            return "Underweight";
        }
        if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        }
        if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        }
        if (bmi >= 30 && bmi < 35) {
            return "Obese";
        }
        if (bmi >= 35) {
            return "Extreme Obese";
        }
        return "";
    }
}
