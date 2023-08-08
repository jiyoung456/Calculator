//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCalc extends JFrame {
    static JLabel label;
    static JLabel info;
    double result = 0.0;
    String math = "";
    double num = 0.0;
    String tostring = "";

    public MyCalc() {
        this.setTitle("계산기");
        this.setDefaultCloseOperation(3);
        Container MyCon = this.getContentPane();
        MyCon.setLayout(new BorderLayout(5, 5));
        MyCon.setBackground(new Color(238, 238, 238));
        UpPanel UP = new UpPanel();
        MyCon.add(UP, "East");
        DownPanel DP = new DownPanel();
        MyCon.add(DP, "South");
        this.setSize(350, 600);
        this.setVisible(true);
    }

    public double MyCalc(String ss) {
        return 0.0;
    }

    private void setBackSpace(String bs) {
        label.setText(bs);
    }

    private String getBackSpace() {
        return label.getText();
    }

    public static void main(String[] args) {
        new MyCalc();
    }

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

    class DownPanel extends JPanel {
        public DownPanel() {
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

            for(int i = 0; i <= 23; ++i) {
                bt[i].setPreferredSize(new Dimension(0, 65));
                bt[i].setFont(new Font("맑은 고딕", 0, 20));
                bt[i].setForeground(Color.BLACK);
                bt[i].setBackground(Color.white);
                if (7 < i && i < 19 && i % 4 != 3) {
                    bt[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JButton b = (JButton)e.getSource();
                            if (MyCalc.label.getText() == "0") {
                                MyCalc.label.setText("");
                            }

                            String labeltext = MyCalc.label.getText();
                            String text = b.getText();
                            String newtext = labeltext + text;
                            int n = newtext.length();
                            if (n <= 10) {
                                MyCalc.label.setText(newtext);
                            }

                            if (MyCalc.info.getText().contains("=")) {
                                MyCalc.info.setText("");
                                MyCalc.label.setText(b.getText());
                                MyCalc.this.result = 0.0;
                                MyCalc.this.num = 0.0;
                            }

                        }
                    });
                } else if (i == 21) {
                    bt[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JButton b = (JButton)e.getSource();
                            String labeltext = MyCalc.label.getText();
                            String text = b.getText();
                            String newtext = labeltext + text;
                            if (labeltext == "0") {
                                MyCalc.label.setText("0");
                            } else {
                                MyCalc.label.setText(newtext);
                            }

                        }
                    });
                } else if (i == 23) {
                    bt[i].setBackground(new Color(0, 103, 192));
                    bt[i].addActionListener(MyCalc.this.new Result());
                } else if (i % 4 == 3 || i < 7 || 19 < i) {
                    bt[i].setBackground(new Color(238, 238, 238));
                    if (i == 2) {
                        bt[i].addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                int n = MyCalc.label.getText().length();
                                if (n >= 0) {
                                    MyCalc.label.setText("0");
                                    MyCalc.info.setText("");
                                }

                                MyCalc.this.result = 0.0;
                            }
                        });
                    } else if (i == 1) {
                        bt[i].addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                int n = MyCalc.label.getText().length();
                                if (n > 0) {
                                    MyCalc.this.setBackSpace(MyCalc.this.getBackSpace().substring(0, MyCalc.this.getBackSpace().length() - 1));
                                }

                                if (MyCalc.label.getText() == "") {
                                    MyCalc.label.setText("0");
                                }

                            }
                        });
                    } else if (i == 22) {
                        bt[i].addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JButton b = (JButton)e.getSource();
                                String labeltext = MyCalc.label.getText();
                                String text = b.getText();
                                String newtext = labeltext + text;
                                int n = newtext.length();
                                if (!MyCalc.label.getText().contains(b.getText()) && n < 10) {
                                    MyCalc.label.setText(newtext);
                                }

                            }
                        });
                    } else {
                        bt[i].addActionListener(MyCalc.this.new Result());
                    }
                }

                this.add(bt[i]);
            }

        }
    }

    public class Result implements ActionListener {
        public Result() {
        }

        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            String labeltext = MyCalc.label.getText();
            String text = b.getText();
            String newtext = labeltext + text;
            int n = newtext.length();
            if (text != "x²") {
                MyCalc.this.num = Double.parseDouble(MyCalc.label.getText().substring(0, n - 1));
            }

            MyCalc var10000;
            if (MyCalc.this.math == "+") {
                var10000 = MyCalc.this;
                var10000.result += MyCalc.this.num;
                MyCalc.this.math = "";
            } else if (MyCalc.this.math == "-") {
                var10000 = MyCalc.this;
                var10000.result -= MyCalc.this.num;
                MyCalc.this.math = "";
            } else if (MyCalc.this.math == "×") {
                var10000 = MyCalc.this;
                var10000.result *= MyCalc.this.num;
                MyCalc.this.math = "";
            } else if (MyCalc.this.math == "÷") {
                var10000 = MyCalc.this;
                var10000.result /= MyCalc.this.num;
                MyCalc.this.math = "";
            }

            if (MyCalc.this.math == "") {
                MyCalc.this.math = b.getText();
            }

            if (MyCalc.info.getText() == "" && text != "x²" && text != "=") {
                MyCalc.info.setText(newtext);
                MyCalc.this.result = MyCalc.this.num;
                MyCalc.label.setText("0");
            } else if (MyCalc.info.getText() != "" && text != "x²" && text != "=") {
                MyCalc.this.result = (double)Math.round(MyCalc.this.result * 1.0E9) / 1.0E9;
                if (MyCalc.this.result % 1.0 == 0.0) {
                    int var10001 = (int)MyCalc.this.result;
                    MyCalc.info.setText("" + var10001 + text);
                    MyCalc.label.setText("0");
                } else {
                    MyCalc.info.setText(MyCalc.this.result + text);
                    MyCalc.label.setText("0");
                }
            }

            if (text == "x²") {
                MyCalc.this.num = Double.parseDouble(MyCalc.label.getText().substring(0, n - 2));
                MyCalc.this.math = "";
                if (MyCalc.info.getText() == "") {
                    MyCalc.this.result = (double)Math.round(Math.pow(MyCalc.this.num, 2.0) * 1.0E9) / 1.0E9;
                    if (MyCalc.this.result % 1.0 == 0.0) {
                        MyCalc.info.setText("sqr(" + (int)MyCalc.this.num + ")");
                        MyCalc.label.setText(String.valueOf((int)MyCalc.this.result));
                    } else {
                        MyCalc.info.setText("sqr(" + MyCalc.this.num + ")");
                        MyCalc.label.setText(String.valueOf(MyCalc.this.result));
                    }
                } else if (MyCalc.this.result % 1.0 == 0.0) {
                    MyCalc.info.setText("sqr(" + (int)MyCalc.this.result + ")");
                    MyCalc.this.result = (double)Math.round(Math.pow(MyCalc.this.result, 2.0) * 1.0E9) / 1.0E9;
                    MyCalc.label.setText(String.valueOf((int)MyCalc.this.result));
                } else {
                    MyCalc.info.setText("sqr(" + MyCalc.this.result + ")");
                    MyCalc.this.result = (double)Math.round(Math.pow(MyCalc.this.result, 2.0) * 1.0E9) / 1.0E9;
                    MyCalc.label.setText(String.valueOf(MyCalc.this.result));
                }
            }

            else if (text.equals("1/x")) {


            }
            if (text == "2√x") {
                MyCalc.this.math = "";
                if (MyCalc.info.getText() == "") {
                    MyCalc.this.result = (double)Math.round(Math.sqrt(MyCalc.this.num) * 1.0E9) / 1.0E9;
                    if (MyCalc.this.result % 1.0 == 0.0) {
                        MyCalc.info.setText("sqrt(" + (int)MyCalc.this.num + ")");
                        MyCalc.label.setText(String.valueOf((int)MyCalc.this.result));
                    } else {
                        MyCalc.info.setText("sqrt(" + MyCalc.this.num + ")");
                        MyCalc.label.setText(String.valueOf(MyCalc.this.result));
                    }
                } else if (Math.sqrt(MyCalc.this.result) % 1.0 == 0.0) {
                    MyCalc.info.setText("sqrt(" + (int)MyCalc.this.result + ")");
                    MyCalc.this.result = (double)Math.round(Math.sqrt(MyCalc.this.result) * 1.0E9) / 1.0E9;
                    MyCalc.label.setText(String.valueOf((int)MyCalc.this.result));
                } else {
                    MyCalc.info.setText("sqrt(" + MyCalc.this.result + ")");
                    MyCalc.this.result = (double)Math.round(Math.sqrt(MyCalc.this.result) * 1.0E9) / 1.0E9;
                    MyCalc.label.setText(String.valueOf(MyCalc.this.result));
                }
            }

            if (text == "=") {
                MyCalc.this.math = "";
                if (MyCalc.info.getText() != "" && MyCalc.label.getText() != "" && !MyCalc.info.getText().contains(text)) {
                    JLabel var7;
                    String var8;
                    if (MyCalc.this.result % 1.0 == 0.0) {
                        var7 = MyCalc.info;
                        var8 = MyCalc.info.getText();
                        var7.setText(var8 + MyCalc.label.getText() + text);
                        MyCalc.label.setText(String.valueOf((int)MyCalc.this.result));
                    } else {
                        var7 = MyCalc.info;
                        var8 = MyCalc.info.getText();
                        var7.setText(var8 + MyCalc.label.getText() + text);
                        MyCalc.label.setText(String.valueOf(MyCalc.this.result));
                    }
                }
            }

        }
    }
}
