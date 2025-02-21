package swing5;

import javax.swing.SwingUtilities;

public class Launcher5 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                MainFrame5 main = new MainFrame5();
                main.show();
            }
        });
    }    
}
