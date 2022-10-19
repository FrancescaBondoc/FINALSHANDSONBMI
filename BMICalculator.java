import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BMICalculator extends JFrame {
            //Label lEFT
    JLabel infoUp = new JLabel("CALCULATE YOUR BMI with Inches and Pounds");
    JLabel heightLabel = new JLabel("Height (in):");
    JLabel weightLabel = new JLabel("Weight (lbs):");
    JLabel bmiLabel = new JLabel("BMI Calculation : ");
    JLabel calculateMeButton = new JLabel("BMI Category: ");

            //TextFields RIGHT
    JTextField inputHeight = new JTextField("");
    JTextField inputWeight = new JTextField("");
    JTextField inputBMI = new JTextField("");
    JTextField inputCalculateMeButton = new JTextField("");

            //Button
    JButton calculateButton = new JButton("Click to Calculate BMI");

    public BMICalculator() {
        JFrame content = new JFrame("BMI CALCULATOR");//creating instance of JFrame
        //x y w h
        heightLabel.setBounds(40, 13, 100, 40);
        weightLabel.setBounds(40, 53, 100, 40);
        bmiLabel.setBounds(40, 100, 300, 40);
        calculateMeButton.setBounds(40, 140, 300, 40);

        //content 
        content.add(infoUp);
        content.add(heightLabel);
        content.add(weightLabel);
        content.add(bmiLabel);
        content.add(calculateMeButton);
        
        
        //inputting
        inputHeight.setBounds(120, 20, 200, 25);
        inputWeight.setBounds(120, 60, 200, 25);
        inputBMI.setBounds(140, 108, 200, 25);
        inputCalculateMeButton.setBounds(125, 150, 200, 25);


        content.add(inputHeight);
        content.add(inputWeight);
        content.add(inputBMI);
        content.add(inputCalculateMeButton);
        
        //button x y w h
        calculateButton.setBounds(40, 200, 300, 25);
        
        //button in JFrame
        content.add(calculateButton);
        content.setSize(450,350);
        content.setLayout(null);
        content.setVisible(true);

    calculateButton.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        float height=Float.parseFloat(inputHeight.getText());
        float weight=Float.parseFloat(inputWeight.getText());
        
        //FORMULA
        float bmi = weight /(height*height) * 703;
    
            if (bmi < 18.5) {
            bmiLabel.setText("BMI Calculation :     " + bmi);
            } else if (bmi < 25) {
            bmiLabel.setText("BMI Calculation :     " + bmi);
            } else if (bmi < 30) {
            bmiLabel.setText("BMI Calculation :     " + bmi);
            } else {
            bmiLabel.setText("BMI Calculation :     " + bmi);
            }
            
            if (bmi < 18.5) {
            calculateMeButton.setText("BMI Category :    UNDERWEIGHT");
            } else if (bmi < 25) {
            calculateMeButton.setText("BMI Category :    NORMAL");
            } else if (bmi < 30) {
            calculateMeButton.setText("BMI Category :    OVERWEIGHT");
            } else {
            calculateMeButton.setText("BMI Category :     OBESE");
            }
        }
    });
    
    }
    
    public static void main(String[] args) {
        new BMICalculator();
    }
    }






















