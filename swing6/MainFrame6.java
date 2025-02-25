package swing6;

import javax.swing.*;
import java.awt.*;

public class MainFrame6 {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public MainFrame6() {
        initialize();
    } 

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("JButton Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        button = createButton();
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
    }
    
    private JButton createButton() {
        JButton button = new JButton("Print");
        button.setFocusable(false);

        return button;
    }

    public void show() {
        this.frame.setVisible(true);
    }
}
