package ru.mirea.lab4;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
    int x = 0;
    int y = 0;
    private JButton ACMilan = new JButton("AC Milan");
    private JButton RealMadrid = new JButton("Real Madrid");
    private JLabel Result = new JLabel("              Result:");
    private JLabel LastScorer = new JLabel("Last Scorer: N/A");
    private Label Winner = new Label("Winner: DRAW");
    private JLabel EmptyContainer = new JLabel("");

    public GUI() {
        super("FOOTBALL SCORER");
        this.setBounds(100, 100, 500, 100);
        this.setDefaultCloseOperation(3);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 3, 2, 2));
        container.add(this.ACMilan);
        container.add(this.Result);
        container.add(this.RealMadrid);
        container.add(this.LastScorer);
        container.add(this.EmptyContainer);
        container.add(this.Winner);
        new ButtonGroup();
        this.ACMilan.addActionListener(new GUI.ButtonEventListener1());
        this.RealMadrid.addActionListener(new GUI.ButtonEventListener2());
    }

    public void WhoWinner(int x, int y) {
        if (x > y) {
            this.Winner.setText("Winner: AC Milan");
        }

        if (x < y) {
            this.Winner.setText("Winner: Real Madrid");
        }

        if (x == y) {
            this.Winner.setText("Winner: DRAW");
        }

    }

    class ButtonEventListener1 implements ActionListener {
        ButtonEventListener1() {
        }

        public void actionPerformed(ActionEvent Event) {
            ++GUI.this.x;
            GUI.this.LastScorer.setText("Last Scorer: AC Milan");
            JLabel var10000 = GUI.this.Result;
            String var10001 = String.valueOf(GUI.this.x);
            var10000.setText("              Result: " + var10001 + " X " + String.valueOf(GUI.this.y));
            GUI.this.WhoWinner(GUI.this.x, GUI.this.y);
        }
    }

    class ButtonEventListener2 implements ActionListener {
        ButtonEventListener2() {
        }

        public void actionPerformed(ActionEvent Event) {
            ++GUI.this.y;
            GUI.this.LastScorer.setText("Last Scorer: Real Madrid");
            JLabel var10000 = GUI.this.Result;
            String var10001 = String.valueOf(GUI.this.x);
            var10000.setText("              Result: " + var10001 + " X " + String.valueOf(GUI.this.y));
            GUI.this.WhoWinner(GUI.this.x, GUI.this.y);
        }
    }
}
