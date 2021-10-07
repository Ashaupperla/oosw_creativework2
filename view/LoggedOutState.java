package view;

public class LoggedOutState implements State {
    @Override
    public void updateUI(StateContext context) {
        // clean the window while entering.
        context.window.getContentPane().removeAll();
        context.window.repaint();
        var loginscreen = new LoginScreen(context);
        loginscreen.init();
    }
}