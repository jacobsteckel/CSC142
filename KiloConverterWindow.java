import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface


public class KiloConverterWindow extends JFrame 
{
   private JPanel panel;             // To reference a panel
   private JLabel messageLabel;      // To reference a label
   private JTextField kiloTextField; // To reference a text field
   private JButton calcButton;       // To reference a button
   private final int WINDOW_WIDTH = 310;  // Window width
   private final int WINDOW_HEIGHT = 100; // Window height

   public KiloConverterWindow()
   {
      setTitle("Kilometer Converter");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buildPanel();
      add(panel);
      setVisible(true);
   }
   private void buildPanel()
   {
      messageLabel = new JLabel("Enter a distance in kilometers");
      kiloTextField = new JTextField(10);
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(new CalcButtonListener());
      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(calcButton);
   }
   private class CalcButtonListener implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         String input;  // To hold the user's input
         double miles;  // The number of miles
         input = kiloTextField.getText();
         
         System.out.println("Reading " + input + " from the text field.");
         System.out.println("Converted value: " + Double.parseDouble(input));
                            
         miles = Double.parseDouble(input) * 0.6214;

         JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles.");

         System.out.println("Ready for the next input.");
      }
   } // End of CalcButtonListener class

   public static void main(String[] args)
   {
      new KiloConverterWindow();
   }
}