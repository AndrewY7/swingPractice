package swing4;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame4 {
    private JFrame frame;

    public MainFrame4() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("MainFrame4");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLayout(new BorderLayout());
        
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }
}


