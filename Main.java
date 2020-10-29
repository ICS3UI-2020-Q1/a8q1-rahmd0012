import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables
  JPanel mainPanel;

  JTextField firstInput;

  JButton helloBtn;  

  JLabel helloPerson;
  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Saying Hello to the user");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);


    // initialize the main JPanel
    mainPanel = new JPanel();
    // disable any layout helpers
    mainPanel.setLayout(null);

    // initialize the input text field 
    firstInput = new JTextField();

    // set location and size for text field 
    firstInput.setBounds(150, 50, 450, 25);

    // initialize the button
    helloBtn = new JButton("Say Hello");

    // set the size and location of the button
    helloBtn.setBounds(600, 400, 150, 30);

    // add an action listener to the button
    helloBtn.addActionListener(this);

    // set the action command on the buttons
    helloBtn.setActionCommand("Say Hello");

    // initialize the label
    helloPerson = new JLabel();

    // set the size and location of the label
    helloPerson.setBounds(150, 150, 150, 30);

    // add the text field to the panel
    mainPanel.add(firstInput);

    // add the button to the panel 
    mainPanel.add(helloBtn);

    // add the label to the panel
    mainPanel.add(helloPerson);
 
    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();


    // create an if statement to make it say hello to the person
    if(command.equals("Say Hello")){
      // get the text from the box
      String firstText = firstInput.getText();
      // set the jlabel to say hello and the persons name
      helloPerson.setText("Hello " + firstText);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
