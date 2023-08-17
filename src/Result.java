/*
import calculate.CalculateInverse;
import calculate.CalculateNegation;
import calculate.CalculatePercentage;
import calculate.CalculateRoot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Result implements ActionListener {
    public Result() {
    }
    DecimalFormat df = new DecimalFormat("#.##########");

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        String labeltext = Calculator.label.getText();
        String text = b.getText();
        String newtext = labeltext + text;
        int n = newtext.length();

        if (!text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
            num = Double.parseDouble(label.getText().substring(0, n - 1));
        }

        Calculator var10000;

        if (Calculator.this.math.equals("+")) {
            result += Calculator.this.num;
        } else if (Calculator.this.math.equals("-")) {
            result -= Calculator.this.num;
        } else if (Calculator.this.math.equals("×")) {
            result *= Calculator.this.num;
        } else if (Calculator.this.math.equals("÷")) {
            result /= Calculator.this.num;
        }

        Calculator.this.math = "";

        if (Calculator.this.math.equals("")) {
            Calculator.this.math = b.getText();
        }

        if (Calculator.info.getText() == "" && !text.equals("=") && !text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
            Calculator.info.setText(newtext);
            Calculator.this.result = Calculator.this.num;
            Calculator.label.setText("0");
        } else if (Calculator.info.getText() != "" && !text.equals("=") && !text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
            Calculator.this.result = (double)Math.round(Calculator.this.result * 1.0E9) / 1.0E9;
            if (Calculator.this.result % 1.0 == 0.0) {
                int var10001 = (int) Calculator.this.result;
                Calculator.info.setText("" + var10001 + text);
                Calculator.label.setText("0");

            } else {
                Calculator.info.setText(Calculator.this.result + text);
                Calculator.label.setText("0");
            }
        }

        if (text.equals("x²")) {
            num = Double.parseDouble(label.getText().substring(0, n - 2));
            math = "";
            if (info.getText().equals("")) {
                result = (Math.round((Math.pow(num, 2))*1000000000)/1000000000.0);
                if(result % 1 == 0) {
                    info.setText("sqr(" + (int) num + ")");
                    label.setText(String.valueOf((int) result));
                }else {
                    info.setText("sqr(" + num + ")");
                    label.setText(String.valueOf(result));
                }
            }else {
                if(result % 1 == 0) {
                    info.setText("sqr(" + (int) result + ")");
                    result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
                    label.setText(String.valueOf((int) result));
                }else {
                    info.setText("sqr(" + result + ")");
                    result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
                    label.setText(String.valueOf(result));
                }
            }
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
            Calculator.this.math = "";
            if (Calculator.info.getText() != "" && Calculator.label.getText() != "" && !Calculator.info.getText().contains(text)) {
                JLabel var7;
                String var8;
                if (Calculator.this.result % 1.0 == 0.0) {
                    var7 = Calculator.info;
                    var8 = Calculator.info.getText();
                    var7.setText(var8 + Calculator.label.getText() + text);
                    Calculator.label.setText(String.valueOf((int) Calculator.this.result));
                } else {
                    var7 = Calculator.info;
                    var8 = Calculator.info.getText();
                    var7.setText(var8 + Calculator.label.getText() + text);
                    Calculator.label.setText(String.valueOf(Calculator.this.result));
                }
            }
        }
    }
}
}*/