package org.lexxx.organizer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mental on 21.12.2014.
 */
public class MainBoardPanel extends JPanel {
    private final JFrame container;

    /**
     * Default constructor creates default main panel without any tasks for current execution
     */
    public MainBoardPanel(JFrame container) {
        this.setLayout(new FlowLayout());
        this.setMaximumSize(new Dimension(200, 200));
        this.add(new TargetAdderPanel());
        this.container=container;

    }

    /**
     * Represents the panel for adding new self targets
     */
    private class TargetAdderPanel extends JPanel {
        public TargetAdderPanel() {
            final TargetAdderPanel targetAdderPanel = TargetAdderPanel.this;
            targetAdderPanel.setLayout(new BorderLayout());
            JEditorPane targetNameInputBox = new JEditorPane();
            targetAdderPanel.add(targetNameInputBox, BorderLayout.NORTH);
            final JEditorPane targetNumberPane = new JEditorPane();
            targetAdderPanel.add(targetNumberPane, BorderLayout.CENTER);
            final JButton button = new JButton("Add target");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MainBoardPanel.this.add(new TargetPanel(targetNameInputBox.getText(), Integer.valueOf(targetNumberPane.getText())));
                    container.pack();
                }
            });
            targetAdderPanel.add(button, BorderLayout.SOUTH);
        }
    }

    private class TargetPanel extends JPanel {

        private final JLabel targetNameLabel;
        private final Integer initialTargetNumber;
        private final JEditorPane numberDonePanel;
        private final JButton done;
//        private final JTextArea log;
        private Integer numberDone = 0;
        private final String targetName;

        public TargetPanel(String text, final Integer targetNumber) {
            TargetPanel thisTargetPanel = TargetPanel.this;
            thisTargetPanel.setLayout(new GridLayout(4, 1));
            initialTargetNumber = targetNumber;
            targetName = text;

            targetNameLabel = new JLabel(generateTargetLabel(targetNumber));
            thisTargetPanel.add(targetNameLabel);
            numberDonePanel = new JEditorPane();
            thisTargetPanel.add(numberDonePanel);
            done = new JButton("Done");
            thisTargetPanel.add(done);
            done.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        final Integer currentDone = Integer.valueOf(numberDonePanel.getText());
                        numberDone += currentDone;
                        numberDonePanel.setText("");
                        targetNameLabel.setText(generateTargetLabel(initialTargetNumber - numberDone));
                        appendLogPanel("Done "+ currentDone);
                    }catch (NumberFormatException ex){

                        appendLogPanel(numberDonePanel.getText()+" is incorrect number");
                    }
                }
            });
//            log = new JTextArea();
//            thisTargetPanel.add(log);
        }

        private void appendLogPanel(String text) {
//            log.setText(log.getText()+"\n"+ text );
        }

        private String generateTargetLabel(Integer targetNumber) {
            return targetName + ", number left = " + targetNumber;
        }
    }
}
