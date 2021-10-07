package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.LogoutButtonListener;
import model.DataBase;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class HomeScreen {
    private StateContext context;
    private JFrame window;
    private int userSerialID;

    private HomeCanvas canvas;
    private JButton logoutButton = new JButton("Log out");
    private JTextArea loginIdButton = new JTextArea("User Details:");
    private JTextArea loginIdField = new JTextArea("");

    public HomeScreen(StateContext context, int userSerialID) {
        this.window = context.window;
        this.context = context;
        this.userSerialID = userSerialID;
    }

    public void init() {

        Container cp = window.getContentPane();
        loginIdButton.setEditable(false);
        loginIdField.setEditable(false);
        loginIdButton.setFont(loginIdButton.getFont().deriveFont(Font.BOLD));
        loginIdField.setText(DataBase.database.get(this.userSerialID).getDisplayData());

        JPanel southPanel = new JPanel();
        southPanel.add(logoutButton);
        cp.add(BorderLayout.SOUTH, southPanel);

        canvas = new HomeCanvas();
        canvas.setLayout(new GridLayout(0, 2));
        // canvas.setPreferredSize(new Dimension (200,100));

        canvas.add(loginIdButton);
        canvas.add(loginIdField);

        cp.add(BorderLayout.CENTER, canvas);

        LogoutButtonListener listener = new LogoutButtonListener(this);
        logoutButton.addActionListener(listener);

    }

    public StateContext getContext() {
        return context;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JFrame getWindow() {
        return window;
    }

    public HomeCanvas getCanvas() {
        return canvas;
    }

    public JTextArea getLoginIdField() {
        return loginIdField;
    }

}
