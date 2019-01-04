/*
Jacob Steckel
Assignment 6
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TravelExpenses extends JFrame 
{
   private JPanel panel1; 
   private JPanel panel2;
   private JLabel label1;
   private JLabel label2;
   private JLabel label3;
   private JLabel label4;  
   private JLabel label5;
   private JLabel label6;
   private JLabel label7;
   private JLabel label8;   
   private JTextField daysTF; 
   private JTextField airfareTF;
   private JTextField rentalFeesTF;
   private JTextField milesTF;
   private JTextField parkingFeesTF;
   private JTextField taxiChargesTF;
   private JTextField registrationFeesTF;
   private JTextField lodgingChargesTF;
   private JButton calcBtn; 
   private JButton resetBtn;      
   private final int WINDOW_WIDTH = 300;  
   private final int WINDOW_HEIGHT = 300; 

   public TravelExpenses() 
   {
      setTitle("Travel Expenses");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      buildPanel();
      add(panel1, BorderLayout.CENTER);
      add(panel2, BorderLayout.SOUTH);
      
      setVisible(true);
   }
   
   private void buildPanel() 
   {     
      label1 = new JLabel("Number of days on the trip: ");
      label2 = new JLabel("Amount of airfare: ");
      label3 = new JLabel("Amount of Car rental fees: ");
      label4 = new JLabel("Total of Miles driven: ");
      label5 = new JLabel("Amount of Parking fees: ");
      label6 = new JLabel("Total Taxi charges: ");
      label7 = new JLabel("Conference Registration: ");
      label8 = new JLabel("Lodging charges per night: ");
      
      daysTF = new JTextField(10);
      airfareTF = new JTextField(10);
      rentalFeesTF = new JTextField(10);
      milesTF = new JTextField(10);
      parkingFeesTF = new JTextField(10);
      taxiChargesTF = new JTextField(10);
      registrationFeesTF = new JTextField(10);
      lodgingChargesTF = new JTextField(10);

      calcBtn = new JButton("Calculate Reimbursement");
      calcBtn.addActionListener(new CalcBtnListener());
      resetBtn = new JButton("Reset");
      resetBtn.addActionListener(new ResetBtnListener());
      
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel1.add(label1);
      panel1.add(daysTF);
      panel1.add(label2);
      panel1.add(airfareTF);
      panel1.add(label3);
      panel1.add(rentalFeesTF);
      panel1.add(label4);
      panel1.add(milesTF);
      panel1.add(label5);
      panel1.add(parkingFeesTF);
      panel1.add(label6);
      panel1.add(taxiChargesTF);
      panel1.add(label7);
      panel1.add(registrationFeesTF);
      panel1.add(label8);
      panel1.add(lodgingChargesTF);
      panel2.add(calcBtn);
      panel2.add(resetBtn);
   }
   
   private class CalcBtnListener implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         String input;  
         double days;
         double airfare;
         double rental;
         double miles;
         double parking;
         double taxi;
         double registration;
         double lodging;
         final double DAILY_MEAL_RATE=37.0;
         final double MILEAGE_RATE=0.27;
         double reimbursedParking;
         double reimbursedTaxi;
         double reimbursedLodging;
         double total;
         double allowed;
         double reimburse;
         input = daysTF.getText();
         days = Double.parseDouble(input);
         input = airfareTF.getText();
         airfare = Double.parseDouble(input);        
         input = rentalFeesTF.getText();
         rental = Double.parseDouble(input);        
         input = milesTF.getText();
         miles = Double.parseDouble(input);       
         input = parkingFeesTF.getText();
         parking = Double.parseDouble(input);
         input = taxiChargesTF.getText();
         taxi = Double.parseDouble(input);  
         input = registrationFeesTF.getText();
         registration= Double.parseDouble(input); 
         input = lodgingChargesTF.getText();
         lodging = Double.parseDouble(input);
         
         total=(days*DAILY_MEAL_RATE)+parking+taxi+(miles*MILEAGE_RATE)+
               (lodging*days)+rental+ airfare+registration;
               
         if(parking<(10*days))
            reimbursedParking=parking;
         else 
            reimbursedParking=parking+((10*days)-parking);
         if(taxi<(20*days))
            reimbursedTaxi=taxi;
         else
            reimbursedTaxi=taxi+((20*days)-taxi);
         if(lodging<(95*days))
            reimbursedLodging=lodging+((95*days)-lodging);
         else
            reimbursedLodging=lodging;
            
         allowed=(days*DAILY_MEAL_RATE)+reimbursedParking+reimbursedTaxi+(miles * MILEAGE_RATE)+ 
                                        reimbursedLodging+rental+ airfare+registration;;
         reimburse=total-allowed;
         
         String message="Total expenses: "+"$"+total+"\n"+
                        " Allowed expenses: $"+allowed+"\n"+
                        " Amount to be reimbursed: $"+reimburse;
         JOptionPane.showMessageDialog(null, message);
      }
   }
 
   private class ResetBtnListener implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         daysTF.setText("");
         airfareTF.setText("");
         rentalFeesTF.setText("");
         milesTF.setText("");
         parkingFeesTF.setText("");
         taxiChargesTF.setText("");
         registrationFeesTF.setText("");
         lodgingChargesTF.setText("");
      }
   }   
   
   public static void main(String[] args) 
   {
      TravelExpenses myExpenses = new TravelExpenses();
   }
}
