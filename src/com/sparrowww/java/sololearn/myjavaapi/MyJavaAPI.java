package com.sparrowww.java.sololearn.myjavaapi;

import java.awt.*;

public class MyJavaAPI  {
    MyJavaAPI() {
        Frame mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        Label headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        Label statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        Panel controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
}
