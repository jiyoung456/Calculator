package calculate;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculateEquals {

    public static void CalculateEquals(JLabel label, JLabel info, double result, ActionEvent e) {

        JButton b = (JButton) e.getSource();
        String text = b.getText();

        result = Math.round(result * 1_000_000_0000.0) / 1_000_000_0000.0;

        if (info.getText() != "" && label.getText() != "" && !info.getText().contains(text)) {
            JLabel var7;
            String var8;
            if (result % 1.0 == 0.0) {
                var7 = info;
                var8 = info.getText();
                var7.setText(var8 + label.getText() + text);
                label.setText(String.valueOf((int) result));
            } else {
                var7 = info;
                var8 = info.getText();
                var7.setText(var8 + label.getText() + text);
                label.setText(String.valueOf(result));
            }
        }
    }
}


