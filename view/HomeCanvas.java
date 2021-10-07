package view;

import javax.swing.JPanel;
import model.LoginData;
import model.DataBase;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class HomeCanvas extends JPanel {

    private int questionIndex = -1;

    public HomeCanvas() {
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.black);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        if (questionIndex >= 0) {
            LoginData q = DataBase.database.get(questionIndex);
            q.render(g2);
        }
    }

    public void setQuestionIndex(int index) {
        questionIndex = index;
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

}
