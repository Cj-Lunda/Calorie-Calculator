/**
 * CalorieApp is the entry point of the application.
 * 
 * It creates an instance of the InputGui and displays it on the Event Dispatch Thread (EDT)
 * to ensure thread safety for the Swing components.
 * 
 * This application allows users to input their physical information to receive 
 * calorie recommendations for bulking and cutting.
 * 
 * Author: chinjila
 */
public class CalorieApp {

    /**
     * The main method launches the calorie calculator application by
     * displaying the InputGui window.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        InputGui input = new InputGui();

        // Ensure GUI creation runs on the Event Dispatch Thread
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                input.setVisible(true);
            }
        });
    }
}
