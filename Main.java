import javax.swing.JFrame;

import view.StateContext;

public class Main {

    public static void main(String[] args) {

        StateContext applicationContext = new StateContext();

        applicationContext.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationContext.window.setLocation(500, 200);
        applicationContext.updateUI();

    }

}