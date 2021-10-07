package controller;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.DataBase;
import view.LoggedInState;
import view.LoginScreen;
import javax.swing.JButton;

public class EnterButtonListener implements ActionListener {
    private LoginScreen menuScreenPanel;

    public EnterButtonListener(LoginScreen menuScreenPanel) {
        this.menuScreenPanel = menuScreenPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (button == menuScreenPanel.getEnterButton()) {
            int i;
            boolean loginsuccessful = false;
            for (i = 0; i < DataBase.database.size(); i++) {
                if (DataBase.database.get(i).checkUsername(menuScreenPanel.getLoginIdField().getText())
                        && DataBase.database.get(i).checkPassword(menuScreenPanel.getLoginPasswordField().getText())) {
                    loginsuccessful = true;
                    break;
                }
            }
            if (loginsuccessful == false) {
                JOptionPane.showMessageDialog(menuScreenPanel.getWindow(), "Please add correct login details");
                return;
            } else {
                System.out.println("LOGGING IN");
                menuScreenPanel.getContext().setState(new LoggedInState(i));
            }
        }
    }
}
