package com.org.transport;
import javafx.scene.image.Image;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Box;


//主窗口：包含红绿灯参数的设置，以及南北路口和东西路口产生车的频率
public class SettingGui extends JFrame {
    static JTextField redText;
    static JTextField greenText;
    static JTextField delayText;
    static JTextField SNText;
    static JTextField EWText;


    public SettingGui() {
        getContentPane().setLayout(null);

        redText = new JTextField();
        redText.setBounds(135, 87, 150, 21);
        getContentPane().add(redText);
        redText.setColumns(10);

        //设置开始按钮，当点击开始按钮时，根据设置的参数画出交通图
        JButton startButton = new JButton("Star");
        startButton.setBounds(165, 352, 91, 50);
        getContentPane().add(startButton);

        greenText = new JTextField();
        greenText.setBounds(135, 136, 150, 30);
        getContentPane().add(greenText);
        greenText.setColumns(10);

        JLabel redLabel = new JLabel("Red light duration");
        redLabel.setBounds(150, 60, 300, 15);
        getContentPane().add(redLabel);

        JLabel greenLabel = new JLabel("Green light duration");
        greenLabel.setBounds(140, 118, 300, 15);
        getContentPane().add(greenLabel);

        Component verticalGlue = Box.createVerticalGlue();
        verticalGlue.setBounds(135, 87, 1, 1);
        getContentPane().add(verticalGlue);

        delayText = new JTextField();
        delayText.setBounds(135, 200, 150, 21);
        getContentPane().add(delayText);
        delayText.setColumns(10);

        JLabel delayLabel = new JLabel("Green light delay time");
        delayLabel.setBounds(140, 170, 300, 15);
        getContentPane().add(delayLabel);

        JLabel lblNewLabel = new JLabel("Intervals between North and South intersections");
        lblNewLabel.setBounds(100, 230, 400, 15);
        getContentPane().add(lblNewLabel);

        SNText = new JTextField();
        SNText.setBounds(135, 252, 150, 21);
        getContentPane().add(SNText);
        SNText.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Car separation at east-west intersection");
        lblNewLabel_1.setBounds(100, 280, 400, 15);
        getContentPane().add(lblNewLabel_1);

        EWText = new JTextField();
        EWText.setBounds(135, 310, 150, 21);
        getContentPane().add(EWText);
        EWText.setColumns(10);

        JLabel label = new JLabel("Traffic Simulation System");
        label.setFont(new Font("times ", Font.BOLD, 16));
        label.setBounds(120, 10, 249, 15);
        getContentPane().add(label);


        this.setSize(431, 443);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.pink);
        this.setVisible(true);

        SimpleListener ourListener = new SimpleListener();
        startButton.addActionListener(ourListener);
    }

    //监听开始按钮，当点击开始按钮时，新建画图窗口的FrameDemo类
    private class SimpleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub

            FrameDemo demo = new FrameDemo();
        }

    }

    public static void main(String[] args) {
        SettingGui demo = new SettingGui();
    }



}
