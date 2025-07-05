/**
 * The CalorieApp class contains the main method to launch the InputGui interface.
 * This serves as the entry point for the application.
 */
public class CalorieApp {
    
    /**
     * The main method to start the application.
     * It creates an instance of InputGui and sets it visible on the Event Dispatch Thread.
     *
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        InputGui input = new InputGui();
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                input.setVisible(true);
            }
        });  
    }
}