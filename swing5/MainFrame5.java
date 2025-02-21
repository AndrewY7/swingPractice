package swing5;

import javax.swing.*;
import java.awt.*;

public class MainFrame5 {
   private JFrame frame;
   private JPanel panel;

    public MainFrame5() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel(new GridLayout());
        for (int i = 0; i < 10; i++) {
            panel.add(new JButton("Button " + i));
        }

        frame.add(panel);

        frame.pack();
    }

    public void show() {
        frame.setVisible(true);
    } 
}
