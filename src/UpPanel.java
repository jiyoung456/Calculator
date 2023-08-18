import javax.swing.*;
import java.awt.*;

class UpPanel extends JPanel {
    public UpPanel() {
        this.setLayout(new GridLayout(3, 1));
        Calculator.info = new JLabel("");
        Calculator.label = new JLabel("0");
        Calculator.info.setFont(new Font("맑은 고딕", 0, 15));
        Calculator.info.setForeground(Color.darkGray);
        Calculator.info.setHorizontalAlignment(4);
        Calculator.label.setFont(new Font("맑은 고딕", 0, 45));
        Calculator.label.setForeground(Color.BLACK);
        Calculator.label.setHorizontalAlignment(4);
        this.add(Calculator.info);
        this.add(Calculator.label);
    }
}
