package org.lexxx.organizer;

import javax.swing.*;

/**
 * Created by Mental on 21.12.2014.
 */
public class Runner {
    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Main window");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setContentPane(new MainBoardPanel(mainFrame));
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
