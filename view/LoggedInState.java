package view;

public class LoggedInState implements State {
    private int userSerialID;

    public LoggedInState(int userSerialID){
        this.userSerialID = userSerialID;
    }

    @Override
    public void updateUI(StateContext context) {
        var home = new HomeScreen(context, userSerialID);
        home.init();
    }
}