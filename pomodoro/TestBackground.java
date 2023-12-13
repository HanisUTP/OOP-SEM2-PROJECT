package com.example.pomodoro;

import javax.swing.*;
import java.awt.*;

public class TestBackground extends JFrame{
    JFrame frame;
    ImageIcon backimage;

    JLabel mylabel;



    public TestBackground(){

        backimage = new ImageIcon(this.getClass().getResource("/pomodoro1.jpg"));
        mylabel = new JLabel(backimage);
        mylabel.setSize(1200,500);

        frame = new JFrame("test background");
        frame.add(mylabel);
        frame.setSize(1200,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);




    }


}

