import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * OutputGui is a simple Java Swing GUI that displays recommended daily calorie 
 * intakes for both bulking (calorie surplus) and cutting (calorie deficit) based 
 * on user input (height, weight, age, activity factor, and gender).
 * 
 * It calculates Basal Metabolic Rate (BMR), Total Daily Energy Expenditure (TDEE), 
 * and provides calorie suggestions for different fitness goals.
 * 
 * Author: chinjila
 */
public class OutputGui extends javax.swing.JFrame {

    // Constants for surplus and deficit calculations
    private static final double SURPLUS_MULTIPLIER = 1.1;
    private static final int DEFICIT_CALORIES = 500;

    // GUI Components
    private JLabel bulkCalorieLabel;
    private JPanel bulkPanel;
    private JLabel bulkTitleLabel;
    private JLabel secondCalorieStaticLabel;
    private JLabel cutCalorieLabel;
    private JLabel cutTitleLabel;
    private JLabel calorieStaticLabel;

    // User data fields
    private int height;
    private int weight;
    private int age;
    private double factor;
    private double BMR;

    /**
     * Constructs the OutputGui window and calculates calorie recommendations 
     * based on the provided parameters.
     * 
     * @param height the user's height in centimeters
     * @param weight the user's weight in kilograms
     * @param age the user's age in years
     * @param factor the user's activity multiplier
     * @param male true if the user is male, false if female
     */
    public OutputGui(int height, int weight, int age, double factor, boolean male) {
        initComponents();
        bulkPanel.setBackground(Color.WHITE);

        this.height = height;
        this.weight = weight;
        this.age = age;
        this.factor = factor;

        this.BMR = male ? calcMaleBMR() : calcFemaleBMR();

        setCalorieLabels();
    }

    /**
     * Initializes the GUI components and layout of the frame.
     */
    private void initComponents() {
        bulkPanel = new JPanel();
        bulkTitleLabel = new JLabel("Bulking:");
        bulkCalorieLabel = new JLabel();
        secondCalorieStaticLabel = new JLabel("Calories");

        cutTitleLabel = new JLabel("Cutting:");
        cutCalorieLabel = new JLabel();
        calorieStaticLabel = new JLabel("Calories");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bulkTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18));
        bulkCalorieLabel.setFont(new java.awt.Font("Segoe UI", 0, 24));
        secondCalorieStaticLabel.setFont(new java.awt.Font("Segoe UI", 0, 24));

        javax.swing.GroupLayout bulkPanelLayout = new javax.swing.GroupLayout(bulkPanel);
        bulkPanel.setLayout(bulkPanelLayout);
        bulkPanelLayout.setHorizontalGroup(
            bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bulkPanelLayout.createSequentialGroup()
                    .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bulkPanelLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bulkCalorieLabel)
                                .addComponent(bulkTitleLabel)))
                        .addGroup(bulkPanelLayout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(secondCalorieStaticLabel)))
                    .addContainerGap(46, Short.MAX_VALUE))
        );
        bulkPanelLayout.setVerticalGroup(
            bulkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bulkPanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(bulkTitleLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bulkCalorieLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(secondCalorieStaticLabel)
                    .addContainerGap(65, Short.MAX_VALUE))
        );

        cutTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18));
        cutCalorieLabel.setFont(new java.awt.Font("Segoe UI", 0, 24));
        calorieStaticLabel.setFont(new java.awt.Font("Segoe UI", 0, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cutTitleLabel)
                                .addComponent(cutCalorieLabel)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(calorieStaticLabel)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addComponent(bulkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(cutTitleLabel)
                    .addGap(55, 55, 55)
                    .addComponent(cutCalorieLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(calorieStaticLabel)
                    .addContainerGap(62, Short.MAX_VALUE))
                .addComponent(bulkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * Calculates Basal Metabolic Rate (BMR) using the Mifflin-St Jeor formula for males.
     * 
     * @return the calculated BMR value for a male
     */
    public double calcMaleBMR() {
        return (10 * weight) + (6.25 * height) - (5 * age) + 5;
    }

    /**
     * Calculates Basal Metabolic Rate (BMR) using the Mifflin-St Jeor formula for females.
     * 
     * @return the calculated BMR value for a female
     */
    public double calcFemaleBMR() {
        return (10 * weight) + (6.25 * height) - (5 * age) - 161;
    }

    /**
     * Calculates the daily caloric intake required for bulking, which is 10% above TDEE.
     * 
     * @return the bulking calorie value, rounded up
     */
    public double calcSurplus() {
        double TDEE = BMR * factor;
        return Math.ceil(TDEE * SURPLUS_MULTIPLIER);
    }

    /**
     * Calculates the daily caloric intake required for cutting, which is TDEE minus 500 calories.
     * 
     * @return the cutting calorie value, rounded up
     */
    public double calcDeficit() {
        double TDEE = BMR * factor;
        return Math.ceil(TDEE - DEFICIT_CALORIES);
    }

    /**
     * Sets the calorie values for both bulking and cutting labels in the GUI.
     */
    public void setCalorieLabels() {
        bulkCalorieLabel.setText((int) calcSurplus() + " Calories");
        cutCalorieLabel.setText((int) calcDeficit() + " Calories");
    }
}
