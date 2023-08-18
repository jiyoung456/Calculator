/*
import calculate.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Result extends Calculator implements ActionListener {
    public Result() {
    }
    DecimalFormat df = new DecimalFormat("#.##########");
    String labelText;
    double num;
    

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        String labelText = Calculator.label.getText();
        String text = b.getText();
        String newText = labelText + text;
        int n = newText.length();

        if (!text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
            num = Double.parseDouble(label.getText().substring(0, n - 1));
        }

        Calculator var10000;

        if (math.equals("+")) {
            result += num;
        } else if (math.equals("-")) {
            result -= num;
        } else if (math.equals("×")) {
            result *= num;
        } else if (math.equals("÷")) {
            result /= num;
        }

        math = "";

        if (math.equals("")) {
            math = b.getText();
        }

        if (Calculator.info.getText() == "" && !text.equals("=") && !text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
            Calculator.info.setText(newText);
            result = num;
            Calculator.label.setText("0");
        } else if (Calculator.info.getText() != "" && !text.equals("=") && !text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
            result = (double)Math.round(result * 1.0E9) / 1.0E9;
            if (result % 1.0 == 0.0) {
                int var10001 = (int) result;
                Calculator.info.setText("" + var10001 + text);
                Calculator.label.setText("0");
            } else {
                Calculator.info.setText(result + text);
                Calculator.label.setText("0");
            }
        }

        if (text.equals("x²")) {
            CalculateSquare.calculateSquare(label, info, result, e);
            double squareResult = Double.parseDouble(labelText) * Double.parseDouble(labelText);
            Calculator.label.setText(df.format(squareResult));
            //Calculator.info.setText("");
        }
        else if (text.equals("2√x")) {
            CalculateRoot.calculateRoot(label, info, result);
        }
        else if (text.equals("1/x")) {
            CalculateInverse.calculateInverse(label, info, result);
        }
        else if (text.equals("+/-")) {
            CalculateNegation.calculateNegation(label, info, result);
        }
        else if (text.equals("%")) {
            CalculatePercentage.calculatePercentage(label, info, result);
        }
        if (text.equals("=")) {
            CalculateEquals.CalculateEquals(label, info, result, e);
        }
    }
}*/