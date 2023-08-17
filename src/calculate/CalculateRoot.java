package calculate;
import javax.swing.*;

public class CalculateRoot {
    public static void calculateRoot(JLabel label, JLabel info, double result){
        double num = Double.parseDouble(label.getText());

        if (info.getText().equals("")) {
            result = (Math.round((Math.sqrt(num))*1000000000)/1000000000.0);

            if(result % 1 == 0) {
                info.setText("√(" + (int) num + ")");
                label.setText(String.valueOf((int) result));
            }else {
                info.setText("√(" + num + ")");
                label.setText(String.valueOf(result));
            }
        }else {
            if(Math.sqrt(result) % 1 == 0) {
                info.setText("√(" + (int) result + ")");
                result = (round(result));
                label.setText(String.valueOf((int) result));
            }else {
                info.setText("√(" + result + ")");
                result = (round(result));
                label.setText(String.valueOf(result));
            }
        }
    }

    public static double round(double result) {
        result = Math.round((Math.sqrt(result))*1000000000)/1000000000.0;
        return result;
    }

}
