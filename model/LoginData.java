package model;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class LoginData {

    private String id;
    private String password;
    private String displayData;

    public LoginData(String id, String password, String displayData) {
        this.id = id;
        this.password = password;
        this.displayData = displayData;
    }
    public boolean checkUsername(String response) {
        return response.equalsIgnoreCase(id);
    }

    public boolean checkPassword(String response) {
        return response.equalsIgnoreCase(password);
    }

    public String getDisplayData() {
        return displayData;
    }

    public void display() {
        System.out.println(id);
    }

    public void render(Graphics2D g2) {
        g2.setColor(Color.yellow);
        g2.setFont(new Font("courier", Font.BOLD, 14));
        g2.drawString(id, 50, 100);

    }
}
