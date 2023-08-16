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
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import calculate.*;

public class Calculator extends JFrame {
    static JLabel label;
    static JLabel info;
    double result = 0.0;
    String math = "";
    double num = 0.0;
    String tostring = "";

    public Calculator() {
        this.setTitle("계산기");
        this.setDefaultCloseOperation(3);
        Container MyCon = this.getContentPane();
        MyCon.setLayout(new BorderLayout(5, 5));
        MyCon.setBackground(new Color(238, 238, 238));

        //상단 패널
        UpPanel UP = new UpPanel();
        MyCon.add(UP, "East");

        DownPanel DP = new DownPanel();
        MyCon.add(DP, "South");
        this.setSize(350, 600);
        this.setVisible(true);
    }

    public double Calculator(String ss) {
        return 0.0;
    }

    private void setBackSpace(String bs) {
        label.setText(bs);
    }

    private String getBackSpace() {
        return label.getText();
    }

    public static void main(String[] args) {
        new Calculator();
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
                                Calculator.this.result = 0.0;
                                Calculator.this.num = 0.0;
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
                    bt[i].addActionListener(Calculator.this.new Result());

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

                                Calculator.this.result = 0.0;
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
                                int n = Calculator.label.getText().length();
                                if (n > 0) {
                                    Calculator.this.setBackSpace(Calculator.this.getBackSpace().substring(0, Calculator.this.getBackSpace().length() - 1));
                                }

                                if (Calculator.label.getText() == "") {
                                    Calculator.label.setText("0");
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
                        bt[i].addActionListener(Calculator.this.new Result());
                    }
                }

                this.add(bt[i]);
            }

        }
    }

    public class Result implements ActionListener {
        public Result() {
        }
        DecimalFormat df = new DecimalFormat("#.##########");


        private void calculateSquare() {

        }


        private void calculateRoot(){
            num = Double.parseDouble(label.getText());
            math = "";
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
                    result = (Math.round((Math.sqrt(result))*1000000000)/1000000000.0);
                    label.setText(String.valueOf((int) result));
                }else {
                    info.setText("√(" + result + ")");
                    result = (Math.round((Math.sqrt(result))*1000000000)/1000000000.0);
                    label.setText(String.valueOf(result));
                }
            }
        }

        /*
 0.2, 1+1, 1+1.1
정수 입력값이 info에 실수로 출력(label 결과값이 실수라서)
*/
        private void calculateInverse() {
            num = Double.parseDouble(label.getText());
            math = "";

            if (num == 0) {
                info.setText("Cannot divide by zero");
                label.setText("Error");
            } else {

                if (info.getText().equals("")) {

                    result = (((1 / num) * 1000000000) / 1000000000.0);
                    if (result % 1 == 0) {
                        // info.setText("1/(" + (int) num + ")");
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




        private void calculateNegation() {
            num = Double.parseDouble(label.getText());
            math = "";

            if (info.getText().equals("")) {
                result = -num;
                if (result % 1 == 0) {
                    info.setText("negate(" + (int) num + ")");
                    label.setText(String.valueOf((int) result));
                } else {
                    info.setText("negate(" + num + ")");
                    label.setText(String.valueOf(result));
                }
            } else {
                if (result % 1 == 0) {
                    info.setText("negate(" + (int) result + ")");
                    result = -result;
                    label.setText(String.valueOf((int) result));
                } else {
                    info.setText("negate(" + result + ")");
                    result = -result;
                    label.setText(String.valueOf(result));
                }
            }
        }
        /*
2, 0.2, 1+1, 1+1.1
정수 입력값이 info에 실수로 출력(label 결과값이 실수라서)
*/
        private void calculatePercentage() {
            num = Double.parseDouble(label.getText());
            math = "";

            double percentage = num * 0.01;

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


        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            String labeltext = Calculator.label.getText();
            String text = b.getText();
            String newtext = labeltext + text;
            int n = newtext.length();

            if (!text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
                num = Double.parseDouble(label.getText().substring(0, n - 1));
            }

            Calculator var10000;



            /*수정: 3줄 묶고 소수 10자리까지만 출력되는거도 추가
            * var10000 = Calculator.this;
                var10000.result += Calculator.this.num;
                Calculator.this.math.equals("");
                 */
          /*  if (result % 1 == 0) {
                result = result;
            } else {
                String formattedResult = String.format("%.10f", result);

            }*/


            if (Calculator.this.math.equals("+")) {
                result += Calculator.this.num;
            } else if (Calculator.this.math.equals("-")) {
                result -= Calculator.this.num;
            } else if (Calculator.this.math.equals("×")) {
                result *= Calculator.this.num;
            } else if (Calculator.this.math.equals("÷")) {
                result /= Calculator.this.num;
            }

            Calculator.this.math = "";

            if (Calculator.this.math.equals("")) {
                Calculator.this.math = b.getText();
            }


            if (Calculator.info.getText() == "" && !text.equals("=") && !text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
                Calculator.info.setText(newtext);
                Calculator.this.result = Calculator.this.num;
                Calculator.label.setText("0");
            } else if (Calculator.info.getText() != "" && !text.equals("=") && !text.equals("x²") && !text.equals("1/x") && !text.equals("2√x") && (!text.equals("+/-")) && !text.equals("%")) {
                Calculator.this.result = (double)Math.round(Calculator.this.result * 1.0E9) / 1.0E9;
                if (Calculator.this.result % 1.0 == 0.0) {
                    int var10001 = (int) Calculator.this.result;
                    Calculator.info.setText("" + var10001 + text);
                    Calculator.label.setText("0");
                } else {
                    Calculator.info.setText(Calculator.this.result + text);
                    Calculator.label.setText("0");
                }
            }

            if (text.equals("x²")) {
                num = Double.parseDouble(label.getText().substring(0, n - 2));
                math = "";
                if (info.getText().equals("")) {
                    result = (Math.round((Math.pow(num, 2))*1000000000)/1000000000.0);
                    if(result % 1 == 0) {
                        info.setText("sqr(" + (int) num + ")");
                        label.setText(String.valueOf((int) result));
                    }else {
                        info.setText("sqr(" + num + ")");
                        label.setText(String.valueOf(result));
                    }
                }else {
                    if(result % 1 == 0) {
                        info.setText("sqr(" + (int) result + ")");
                        result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
                        label.setText(String.valueOf((int) result));
                    }else {
                        info.setText("sqr(" + result + ")");
                        result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
                        label.setText(String.valueOf(result));
                    }
                }
            }


            else if (text.equals("2√x")) {
                calculateRoot();
            }

            else if (text.equals("1/x")) {
                calculateInverse();
            }

            else if (text.equals("+/-")) {
                calculateNegation();
            }

            else if(text.equals("%")) {
                CalculatePercentage.calculatePercentage(label, info, result);
            }

            if (text.equals("=")) {
                Calculator.this.math = "";
                if (Calculator.info.getText() != "" && Calculator.label.getText() != "" && !Calculator.info.getText().contains(text)) {
                    JLabel var7;
                    String var8;
                    if (Calculator.this.result % 1.0 == 0.0) {
                        var7 = Calculator.info;
                        var8 = Calculator.info.getText();
                        var7.setText(var8 + Calculator.label.getText() + text);
                        Calculator.label.setText(String.valueOf((int) Calculator.this.result));
                    } else {
                        var7 = Calculator.info;
                        var8 = Calculator.info.getText();
                        var7.setText(var8 + Calculator.label.getText() + text);
                        Calculator.label.setText(String.valueOf(Calculator.this.result));
                    }
                }
            }

        }
    }
}
