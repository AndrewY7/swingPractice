package swing3;

import javax.swing.SwingUtilities;

public class JPanelDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JPanelOne panel = new JPanelOne();
            }
        });
    }
}
