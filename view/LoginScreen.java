package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.EnterButtonListener;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class LoginScreen {
    private JFrame window;

    private LoginCanvas canvas;
    private JButton enterButton = new JButton("Enter");
    private JTextArea loginIdButton = new JTextArea("Login Id");
    private JTextArea passwordButton = new JTextArea("Password");
    private JTextField loginIdField = new JTextField();
    private JTextField passwordField = new JTextField();
	private StateContext context;

    public LoginScreen(StateContext context) {
        this.window = context.window;
        this.context = context;
    }

    public void init() {

        Container cp = window.getContentPane();

        loginIdButton.setEditable(false);
        passwordButton.setEditable(false);
        loginIdButton.setFont(loginIdButton.getFont().deriveFont(Font.BOLD));
        passwordButton.setFont(passwordButton.getFont().deriveFont(Font.BOLD));

        JPanel southPanel = new JPanel();
        southPanel.add(enterButton);
        cp.add(BorderLayout.SOUTH, southPanel);

        canvas = new LoginCanvas();
        canvas.setLayout(new GridLayout(3, 2));
        // canvas.setPreferredSize(new Dimension (200,100));

        canvas.add(loginIdButton);
        canvas.add(loginIdField);
        canvas.add(passwordButton);
        canvas.add(passwordField);

        cp.add(BorderLayout.CENTER, canvas);

        EnterButtonListener listener = new EnterButtonListener(this);
        enterButton.addActionListener(listener);

    }

    public StateContext getContext(){
        return context;
    }

    public JButton getEnterButton() {
        return enterButton;
    }

    public JFrame getWindow() {
        return window;
    }

    public LoginCanvas getCanvas() {
        return canvas;
    }

    public JTextField getLoginIdField() {
        return loginIdField;
    }

    public JTextField getLoginPasswordField() {
        return passwordField;
    }
}
