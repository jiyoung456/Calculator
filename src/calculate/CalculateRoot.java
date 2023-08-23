package calculate;
import javax.swing.*;

public class CalculateRoot {
    public static void calculateRoot(JLabel label, JLabel info, double result){
        double num = Double.parseDouble(label.getText());

        if (info.getText().equals("")) {  //이전 값 없음
            result = (Math.round((Math.sqrt(num))*1_000_000_000)/1_000_000_000.0);
            if(result % 1 == 0) { //정수
                info.setText("√(" + (int) num + ")");
                label.setText(String.valueOf((int) result));
            }
            else { //정수아님
                info.setText("√(" + num + ")");
                label.setText(String.valueOf(result));
            }
        } else { //이전 값 있음
            if(Math.sqrt(result) % 1 == 0) {
                info.setText("√(" + (int) result + ")");
                result = (root(result));
                label.setText(String.valueOf((int) result));
            }else {
                info.setText("√(" + result + ")");
                result = (root(result));
                label.setText(String.valueOf(result));
            }
        }
    }

    public static double root(double result) {
        result = Math.round((Math.sqrt(result))*1_000_000_000)/1_000_000_000.0;
        return result;
    }
}