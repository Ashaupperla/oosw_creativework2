package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.HomeScreen;
import view.LoggedOutState;

import javax.swing.JButton;

public class LogoutButtonListener implements ActionListener {
    private HomeScreen homeScreenPanel;

    public LogoutButtonListener(HomeScreen homeScreenPanel) {
        this.homeScreenPanel = homeScreenPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (button == homeScreenPanel.getLogoutButton()) {
            System.out.println("LOGGING OUT");
            homeScreenPanel.getContext().setState(new LoggedOutState());
        }
    }
}
