import javax.swing.*;
import java.awt.*;

class UpPanel extends JPanel {
    public UpPanel() {
        this.setLayout(new GridLayout(3, 1));
        MyCalc.info = new JLabel("");
        MyCalc.label = new JLabel("0");
        MyCalc.info.setFont(new Font("맑은 고딕", 0, 15));
        MyCalc.info.setForeground(Color.darkGray);
        MyCalc.info.setHorizontalAlignment(4);
        MyCalc.label.setFont(new Font("맑은 고딕", 0, 45));
        MyCalc.label.setForeground(Color.BLACK);
        MyCalc.label.setHorizontalAlignment(4);
        this.add(MyCalc.info);
        this.add(MyCalc.label);

    }
}
