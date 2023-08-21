package calculate;
import javax.swing.*;

public class CalculateNegation{
        public static void calculateNegation(JLabel label, JLabel info, double result) {
            double num = Double.parseDouble(label.getText());

        if (info.getText().equals("")) {
            result = -num;
            if (result % 1 == 0) {
                info.setText("negate(" + (int) num + ")");
                label.setText(String.valueOf((int) result));
            } else {
                info.setText("negate(" + num + ")");
                label.setText(String.valueOf(result));
            }
        } else {
            if (result % 1 == 0) {
                info.setText("negate(" + (int) result + ")");
                result = -result;
                label.setText(String.valueOf((int) result));
            } else {
                info.setText("negate(" + result + ")");
                result = -result;
                label.setText(String.valueOf(result));
            }
        }
    }
}