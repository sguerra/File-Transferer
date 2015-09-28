package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sergije on 9/27/15.
 */
public class FileServerView {
    public static void main(String[] args){

        JFrame jFrame = new JFrame("File Server");
        jFrame.setLayout(null);
        jFrame.setBounds(100, 100, 300, 150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblState = new JLabel("Listening...");
        lblState.setBounds(20, 10, 100, 20);
        jFrame.add(lblState);

        JLabel lblTransfer = new JLabel("Total: {0}/{1}");
        lblTransfer.setBounds(180,10, 100, 20);
        jFrame.add(lblTransfer);

        JLabel lblFile = new JLabel("File: {0}");
        lblFile.setBounds(20,40, 100, 30);
        jFrame.add(lblFile);

        JProgressBar jProgress = new JProgressBar();
        jProgress.setBounds(20, 90, 250, 20);
        jProgress.setMinimum(0);
        jProgress.setMaximum(100);
        jProgress.setValue(50);
        jFrame.add(jProgress);

        jFrame.setVisible(true);
    }
}
