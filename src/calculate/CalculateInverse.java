package calculate;
import javax.swing.JLabel;

public class CalculateInverse {

    public static void calculateInverse(JLabel label, JLabel info, double result) {
        double num = Double.parseDouble(label.getText());
        String math = "";

        if (num == 0) {
            info.setText("Cannot divide by zero");
            label.setText("Error");
        } else {
            if (info.getText().equals("")) {
                result = (((1 / num) * 1000000000) / 1000000000.0);
                if (result % 1 == 0) {
                    info.setText("1/(" +  num + ")");
                    label.setText(String.valueOf((int) result));
                } else {
                    info.setText("1/(" + num + ")");
                    label.setText(String.valueOf(result));
                }
            } else {
                if (result % 1 == 0) {
                    info.setText("1/(" + (int) result + ")");
                    result = (((1 / result) * 1000000000) / 1000000000.0);
                    label.setText(String.valueOf((int) result));
                } else {
                    info.setText("1/(" + result + ")");
                    result = (((1 / result) * 1000000000) / 1000000000.0);
                    label.setText(String.valueOf(result));
                }
            }
        }
    }
}
