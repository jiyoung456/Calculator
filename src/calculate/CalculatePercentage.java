package calculate;
import javax.swing.*;

public class CalculatePercentage {
    public static void calculatePercentage(JLabel label, JLabel info, double result) {
        double num = Double.parseDouble(label.getText());
        double percentage = num * 0.01;
        String math = "";

        if (info.getText().equals("")) {
            if (percentage % 1 == 0) {
                info.setText((int) num + "%");
                label.setText(String.valueOf((int) percentage));
            } else {
                info.setText(num + "%");
                label.setText(String.valueOf(percentage));
            }
        } else {
            if (percentage % 1 == 0) {
                info.setText((int) num + "%");
                result = percentage;
                label.setText(String.valueOf((int) percentage));
            } else {
                info.setText(num + "%");
                result = percentage;
                label.setText(String.valueOf(percentage));
            }
        }
    }
}

