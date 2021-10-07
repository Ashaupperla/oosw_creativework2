package view;
import javax.swing.JFrame;

public class StateContext {
    private State state;
    public JFrame window = new JFrame();

    public StateContext() {
        state = new LoggedOutState();
    }

    /**
     * Set the current state.
     * Normally only called by classes implementing the State interface.
     * @param newState the new state of this context
     */
    public void setState(State newState) {
        state = newState;
        updateUI();
    }
    public void updateUI(){
        window.getContentPane().removeAll();
        window.repaint();
        state.updateUI(this);
        window.pack();
        window.setVisible(true);
    }
}
