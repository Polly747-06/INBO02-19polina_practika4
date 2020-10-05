package ru.mirea.lab4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

class GUI$ButtonEventListener1 implements ActionListener {
    GUI$ButtonEventListener1(GUI this$0) {
        this.this$0 = this$0;
    }

    public void actionPerformed(ActionEvent Event) {
        ++this.this$0.x;
        this.this$0.LastScorer.setText("Last Scorer: AC Milan");
        JLabel var10000 = this.this$0.Result;
        String var10001 = String.valueOf(this.this$0.x);
        var10000.setText("              Result: " + var10001 + " X " + String.valueOf(this.this$0.y));
        this.this$0.WhoWinner(this.this$0.x, this.this$0.y);
    }
}
