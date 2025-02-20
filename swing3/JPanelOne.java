package swing3;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelOne {
    private JFrame frame;

    public JPanelOne() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setLayout(new BorderLayout(10,5));
        frame.setTitle("Java Swing JPanel Demo");
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,5));
        panel.setBackground(Color.darkGray);
        Button button = new Button("Button");
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
    
        frame.setVisible(true);
    }
}
