package calculate;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalculateSquare {
    public static void calculateSquare(JLabel label, JLabel info, double result, ActionEvent e) {
        JButton b = (JButton) e.getSource();
        String labeTtext = label.getText();
        String text = b.getText();
        String newText = labeTtext + text;
        int n = newText.length();
        double num = Double.parseDouble(label.getText().substring(0, n - 2));
        String math = "";

        if (info.getText().equals("")) {
            result = (Math.round((Math.pow(num, 2)) * 1_000_000_000) / 1_000_000_000.0);
            if (result % 1 == 0) {
                info.setText("sqr(" + (int) num + ")");
                label.setText(String.valueOf((int) result));
            } else {
                info.setText("sqr(" + num + ")");
                label.setText(String.valueOf(result));
            }
        } else {
            if (result % 1 == 0) {
                info.setText("sqr(" + (int) result + ")");
                result = square(result);
                label.setText(String.valueOf((int) result));
            } else {
                info.setText("sqr(" + result + ")");
                result = square(result);
                label.setText(String.valueOf(result));
            }
        }
    }

    static double square (double result) {
        result = (Math.round((Math.pow(result, 2)) * 1_000_000_000) / 1_000_000_000.0);
        return result;
    }
}