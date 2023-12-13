package com.example.pomodoro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountDown extends JFrame implements ActionListener {
    JFrame frame = new JFrame("POMODORO STUDY");
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    JLabel timeLabel = new JLabel();
    JLabel background = new JLabel();

    int elapsedTime = 1500000;
    int seconds =0;
    int minutes =25;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);

    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            elapsedTime=elapsedTime-1000;
            minutes = (elapsedTime/60000);
            seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            timeLabel.setText(minutes_string+":"+seconds_string);

        }

    });





    CountDown(){

        timeLabel.setText(minutes_string+":"+seconds_string);
        timeLabel.setBounds(500,200,200,100);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,65));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(475, 300, 100, 50);
        startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(625, 300, 100, 50);
        resetButton.setFont(new Font("Ink Free",Font.PLAIN,20));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


       // "pomodoro1.jpeg")
        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        elapsedTime=0;
        seconds = 0;
        minutes =25;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        timeLabel.setText(minutes_string+":"+seconds_string);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==startButton){
            start();
            if(started==false){
                started =true;
                startButton.setText("STOP");
                start();
            }else {
                started =false;
                startButton.setText("START");
                stop();
            }
        }
        if(e.getSource()==resetButton){
            started=false;
            startButton.setText("START");
            reset();
        }
    }

}
