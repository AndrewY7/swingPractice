package swing6;

import java.awt.EventQueue;

public class Launcher6 {
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
            
         @Override
         public void run() {
             MainFrame6 main = new MainFrame6();
             main.show();
         }
     });
   }
}
