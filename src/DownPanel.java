/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class DownPanel extends JPanel {
    private Calculator calculator;

    double result;
    double num;

    public DownPanel(Calculator calculator) {
        this.calculator = calculator;
        JButton[] bt = new JButton[24];
        this.setLayout(new GridLayout(6, 4, 5, 5));
        this.setBackground(new Color(238, 238, 238));
        bt[0] = new JButton("%");
        bt[1] = new JButton("CE");
        bt[2] = new JButton("C");
        bt[3] = new JButton("<<");
        bt[4] = new JButton("1/x");
        bt[5] = new JButton("x²");
        bt[6] = new JButton("2√x");
        bt[7] = new JButton("÷");
        bt[8] = new JButton("7");
        bt[9] = new JButton("8");
        bt[10] = new JButton("9");
        bt[11] = new JButton("×");
        bt[12] = new JButton("4");
        bt[13] = new JButton("5");
        bt[14] = new JButton("6");
        bt[15] = new JButton("-");
        bt[16] = new JButton("1");
        bt[17] = new JButton("2");
        bt[18] = new JButton("3");
        bt[19] = new JButton("+");
        bt[20] = new JButton("+/-");
        bt[21] = new JButton("0");
        bt[22] = new JButton(".");
        bt[23] = new JButton("=");

        for(int i = 0; i <= 23; i++) {
            bt[i].setPreferredSize(new Dimension(0, 65));
            bt[i].setFont(new Font("맑은 고딕", 0, 20));
            bt[i].setForeground(Color.BLACK);
            bt[i].setBackground(Color.white);

            if (7 < i && i < 19 && i%4 != 3) {
                bt[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton b = (JButton)e.getSource();
                        if (Calculator.label.getText() == "0") {
                            Calculator.label.setText("");
                        }

                        String labeltext = Calculator.label.getText();
                        String text = b.getText();
                        String newtext = labeltext + text;
                        int n = newtext.length();
                        if (n <= 10) {
                            Calculator.label.setText(newtext);
                        }

                        if (Calculator.info.getText().contains("=")) {
                            Calculator.info.setText("");
                            Calculator.label.setText(b.getText());
                            result = 0.0;
                            num = 0.0;
                        }

                    }
                });

            } else if (i == 21) {
                bt[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton b = (JButton)e.getSource();
                        String labeltext = Calculator.label.getText();
                        String text = b.getText();
                        String newtext = labeltext + text;
                        if (labeltext.equals("0")) {
                            Calculator.label.setText(text);
                        } else {
                            Calculator.label.setText(newtext);
                        }

                    }
                });
            }

            else if (i == 23) {
                bt[i].setBackground(new Color(0, 103, 192));
                bt[i].setForeground(Color.WHITE);
                bt[i].addActionListener(new Result());

            }else if (i % 4 == 3 || i < 7 || 19 < i) {
                bt[i].setBackground(new Color(238, 238, 238));
                if (i == 2) {
                    bt[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            int n = Calculator.label.getText().length();
                            if (n >= 0) {
                                Calculator.label.setText("0");
                                Calculator.info.setText("");
                            }

                            result = 0.0;
                        }
                    });

                }else if(i == 3) {
                    bt[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            String labeltext = Calculator.label.getText();
                            int n = labeltext.length();

                            if (n > 0) {
                                Calculator.label.setText(labeltext.substring(0, n - 1));
                            }

                            if (Calculator.label.getText().isEmpty()) {
                                Calculator.label.setText("0");
                            }
                        }
                    });
                }

                else if (i == 1) {
                    bt[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            int n = calculator.label.getText().length();
                            if (n > 0) {
                                calculator.setBackSpace(calculator.getBackSpace().substring(0, calculator.getBackSpace().length() - 1));
                            }

                            if (calculator.label.getText().equals("")) {
                                calculator.label.setText("0");
                            }

                        }
                    });

                } else if (i == 22) {
                    bt[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JButton b = (JButton)e.getSource();
                            String labeltext = Calculator.label.getText();
                            String text = b.getText();

                            if (!labeltext.contains(".")) {
                                String newtext = labeltext + text;
                                Calculator.label.setText(newtext);
                            }
                        }
                    });

                } else {
                    bt[i].addActionListener(new Result());
                }
            }
            this.add(bt[i]);
        }
    }
}*/