import javax.swing.*;

/**
 * A Java Swing GUI for collecting user health data including weight, height, age,
 * sex, and activity level. This input is validated and passed to the OutputGui
 * for further processing.
 * 
 * This class also includes internal input validation for reasonable human values.
 * 
 * Author: chinjila
 */
public class InputGui extends javax.swing.JFrame {

    // GUI Components
    private javax.swing.JTextField ageField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dropDown;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton lightlyActiveRadioButton;
    private javax.swing.JRadioButton moderatelyActiveRadioButton;
    private javax.swing.JRadioButton sedentaryActiveRadioButton;
    
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton veryActiveRadioButton;
    private javax.swing.JTextField weightField;

    // Internal fields to store validated user input
    private int weight = 0;
    private int height = 0;
    private int age = 0;
    private double factor = 0.0;
    private boolean male = true;

    /**
     * Gets the user's entered weight.
     * 
     * @return weight in kilograms
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets the user's entered height.
     * 
     * @return height in centimeters
     */
    public int getheight() {
        return height;
    }

    /**
     * Gets the user's entered age.
     * 
     * @return age in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the user's selected activity factor.
     * 
     * @return activity multiplier (1.2 - 1.725)
     */
    public double getFactor() {
        return factor;
    }

    /**
     * Constructor initializes the GUI and sets default activity selection.
     */
    public InputGui() {
        initComponents();
        sedentaryActiveRadioButton.setSelected(true);
    }

    /**
     * Initializes and arranges GUI components. This method is auto-generated.
     * DO NOT manually modify unless necessary.
     */
    private void initComponents() {
                buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        sedentaryActiveRadioButton = new javax.swing.JRadioButton();
        lightlyActiveRadioButton = new javax.swing.JRadioButton();
        moderatelyActiveRadioButton = new javax.swing.JRadioButton();
        veryActiveRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        dropDown = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Fill in the details below:");

        jLabel2.setText("Body weight (kg)");

        jLabel3.setText("Height (cm)");

        jLabel4.setText("Age (years)");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(sedentaryActiveRadioButton);
        sedentaryActiveRadioButton.setText("Sedentary: 1.2 (little or no exercise)");

        buttonGroup1.add(lightlyActiveRadioButton);
        lightlyActiveRadioButton.setText(" Lightly active: 1.375 (light exercise a few times a week)");

        buttonGroup1.add(moderatelyActiveRadioButton);
        moderatelyActiveRadioButton.setText("Moderately active: 1.55 (3-5 times a week)");

        buttonGroup1.add(veryActiveRadioButton);
        veryActiveRadioButton.setText("Very active: 1.725 (6-7 times a week)");

        jLabel5.setText("Sex");

        dropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(submitButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(127, 127, 127))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(veryActiveRadioButton)
                                                        .addComponent(lightlyActiveRadioButton)
                                                        .addComponent(sedentaryActiveRadioButton)
                                                        .addComponent(moderatelyActiveRadioButton)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5))
                                                                .addGap(77, 77, 77)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(heightField,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                97, Short.MAX_VALUE)
                                                                        .addComponent(weightField,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                97, Short.MAX_VALUE)
                                                                        .addComponent(ageField,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                97, Short.MAX_VALUE)
                                                                        .addComponent(dropDown, 0,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))))
                                                .addGap(43, 43, 43)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dropDown, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(sedentaryActiveRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lightlyActiveRadioButton)
                                .addGap(16, 16, 16)
                                .addComponent(moderatelyActiveRadioButton)
                                .addGap(12, 12, 12)
                                .addComponent(veryActiveRadioButton)
                                .addGap(32, 32, 32)
                                .addComponent(submitButton)
                                .addGap(14, 14, 14)));

        pack();
    }

    /**
     * Handles the Submit button click event. Validates user inputs and
     * launches the OutputGui with valid data.
     * 
     * @param evt the event generated on clicking the Submit button
     */
   
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String sex = dropDown.getSelectedItem().toString();
        if (sex.equalsIgnoreCase("female")) {
            male = false;
        }

        try {
            weight = Integer.parseInt(weightField.getText().trim());
            height = Integer.parseInt(heightField.getText().trim());
            age = Integer.parseInt(ageField.getText().trim());

            validateAge(age);
            validateHeight(height);
            validateWeight(weight);

            if (sedentaryActiveRadioButton.isSelected()) {
                factor = 1.2;
            } else if (lightlyActiveRadioButton.isSelected()) {
                factor = 1.375;
            } else if (moderatelyActiveRadioButton.isSelected()) {
                factor = 1.55;
            } else {
                factor = 1.725;
            }

            System.out.println("Weight: " + weight + " Height: " + height + " Age: "
                    + age + " Activity: " + factor + " Male: " + male);

            this.dispose();

            OutputGui output = new OutputGui(height, weight, age, factor, male);
            java.awt.EventQueue.invokeLater(() -> output.setVisible(true));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age, height, and weight must be whole numbers (integers) only!",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
            weightField.setText("");
            heightField.setText("");
            ageField.setText("");
            System.err.println("gets to x");
        } catch (InputGui.InvalidInputException e) {
            weightField.setText("");
            heightField.setText("");
            ageField.setText("");
            System.err.println("gets here");
        }
    }

    /**
     * Main method to run the application. It initializes and displays the GUI.
     * 
     * @param args the command line arguments (not used)
     */
    public static void main(String args[]) {
        // Setup look and feel, then launch the GUI
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(InputGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new InputGui().setVisible(true));
    }

    /**
     * Custom exception used for input validation errors.
     */
    public class InvalidInputException extends Exception {
        /**
         * Constructs a new InvalidInputException with a specified message.
         * 
         * @param message the detail message
         */
        public InvalidInputException(String message) {
            super(message);
        }

        /**
         * Constructs a new InvalidInputException with a message and cause.
         * 
         * @param message the detail message
         * @param cause   the cause
         */
        public InvalidInputException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /**
     * Validates the user's age.
     * 
     * @param age the age in years
     * @throws InvalidInputException if age is not between 15 and 100
     */
    public void validateAge(double age) throws InputGui.InvalidInputException {
        String message = "User must be younger than 100 but older than 15 ";
        if (age > 100 || age < 15) {
            JOptionPane.showMessageDialog(this, message, "Range error", JOptionPane.ERROR_MESSAGE);
            throw new InvalidInputException(message);
        }
    }

    /**
     * Validates the user's height.
     * 
     * @param height the height in cm
     * @throws InvalidInputException if height is not between 90 and 213
     */
    public void validateHeight(double height) throws InputGui.InvalidInputException {
        String message = "User must be between 90 and 213 cm";
        if (height > 213 || height < 90) {
            JOptionPane.showMessageDialog(this, message, "Range error", JOptionPane.ERROR_MESSAGE);
            throw new InvalidInputException(message);
        }
    }

    /**
     * Validates the user's weight.
     * 
     * @param weight the weight in kg
     * @throws InvalidInputException if weight is not between 30 and 180
     */
    public void validateWeight(double weight) throws InputGui.InvalidInputException {
        String message = "User must be below 180 kg and above 30 kg";
        if (weight > 180 || weight < 30) {
            JOptionPane.showMessageDialog(this, message, "Range error", JOptionPane.ERROR_MESSAGE);
            throw new InvalidInputException(message);
        }
    }

}
