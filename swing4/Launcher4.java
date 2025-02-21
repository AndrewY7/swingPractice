package swing4;

import javax.swing.SwingUtilities;

public class Launcher4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                MainFrame4 main = new MainFrame4();
                main.show();
            }
        });
    }
}
