
/*
package calculate;

import javax.swing.*;


public class CalculateSquare {
    public static void CalculateSquare(JLabel label, JLabel info, double result){
        double num = Double.parseDouble(label.getText());
        String math = "";
        String labeltext = Calculator.label.getText();
        String text = b.getText();
        String newtext = labeltext + text;
        int n = newtext.length();

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
    }}
*/
