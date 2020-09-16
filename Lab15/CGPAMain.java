/*
Create a swing program which would use basic controls like text box,button,checkboxes,radio button,text area to create a from for your domain.
Domain detail: Online Student Grading Management
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	class CGPAMain extends JFrame
	{
	  public static void main(String[] args)
	  {
	    JFrame frame = new JFrame("GPA Calculation");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    MainPage panel = new MainPage();
	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);
	  }
	}
	  class MainPage extends JPanel
	  {
	      //declare GUI elements
	      private JLabel subjectLabel, cHoursLabel, gradeLabel;      
	      private JTextField subject, cHours;
	      private JButton addSubjectButton, calcGPAButton, clearAllButton;
	      private JTextArea tArea;
	      private JComboBox grade;
	      //declare array to store and collect user input value
	      String[] subjectArray = new String[6];                 
	      String[] gradeArray = new String[6];
	      int[] cHoursArray = new int[6];
	      double[] gradeValue = { 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.33, 1.00, 0.00 };
	      String[] gradeLetter= { "A",  "A-", "B+", "B",  "B-", "C+", "C",  "D",  "D-", "E",  "F"};                 

	      public MainPage()
	      {
	          setLayout (null);
	          setPreferredSize (new Dimension(500, 500));
	          setBackground (Color.lightGray);
	          //Properties of GUI elements
	          subjectLabel = new JLabel ("Subject Name: ");                      
	          subject = new JTextField (33);
	          subject.addActionListener (new TempListener());
	          gradeLabel = new JLabel ("Grade: ");
	          grade = new JComboBox (gradeLetter);
	          grade.addActionListener (new TempListener());
	          cHoursLabel = new JLabel ("Credit Hours: ");
	          cHours = new JTextField (1);
	          cHours.addActionListener (new TempListener());
	          addSubjectButton = new JButton("Add Another Subject");
	          addSubjectButton.addActionListener(new TempListener());
	          calcGPAButton = new JButton("Calculate GPA");
	          calcGPAButton.addActionListener(new TempListener());
	          clearAllButton = new JButton("Clear All");
	          clearAllButton.addActionListener(new TempListener());
	          tArea = new JTextArea(5, 5);               
	          tArea.setEditable(false);    
	          add (subjectLabel);
	          add (subject);
	          add (gradeLabel);
	          add (grade);
	          add (cHoursLabel);
	          add (cHours);
	          add (addSubjectButton);
	          add (calcGPAButton);
	          add (clearAllButton);
	          add (tArea);
	          //Position of GUI elements
	          subjectLabel.setBounds      (20, 20, 150, 20);             
	          subject.setBounds           (120, 20, 350, 20);
	          gradeLabel.setBounds        (20, 50, 50, 20);
	          grade.setBounds             (120, 50, 50, 20);
	          cHoursLabel.setBounds       (20, 80, 100, 20);
	          cHours.setBounds            (120, 80, 50, 20);
	          addSubjectButton.setBounds  (20, 120, 200, 30);
	          calcGPAButton.setBounds     (300, 440, 175, 30);
	          clearAllButton.setBounds    (20, 440, 120, 30);
	          tArea.setBounds             (20, 170, 450, 250);
	      }
		  
	      private class TempListener implements ActionListener
	      {
	        //  Performs the conversion when the enter key is pressed in the text field
	          double tCrPoints = 0.00, tCrHours = 0.00, tGPA = 0.00; 
	          String status;
	          public void actionPerformed(ActionEvent event)
	          {
	              if (event.getSource() == addSubjectButton)                  
	              {
	                  for (int i=0; i<6; i++)
	                  {
	                      subjectArray[i] = subject.getText();
	                      gradeArray[i] = (String) grade.getSelectedItem();
	                      cHoursArray[i] = Integer.parseInt(cHours.getText());
	                  }
	                  tArea.append (subject.getText() + "\t\t\t" + grade.getSelectedItem() + "\t"  + cHours.getText() + "\n");
	                  subject.setText("");
	                  cHours.setText("");
	              }

	              if (event.getSource() == calcGPAButton)  
	              {
	                  for (int i=0 ; i<gradeArray.length; i++)
	                  {
	                      for (int j=0; j<gradeLetter.length; j++)
	                      {
	                          if(gradeArray[i].equals(gradeLetter[j]))
	                          {
	                              tCrHours += cHoursArray[i];
	                              tCrPoints += gradeValue[j] * cHoursArray[i];
	                          }
	                      }
	                  }
	                  tGPA = tCrPoints/tCrHours;
	                  if (tGPA >= 2)
	                      status = ("Pass");
	                  else
	                      status = ("Fail");
	                  //Output for text area
	                  tArea.setText("Total Credit Points : " + tCrPoints + "\n" +
	                                "Total Credit Hours : " + tCrHours + "\n\n" +
	                                "Grade Point Average (GPA) : " + tGPA + "\n" +
	                                "Status : " + status);
	              }
	              if (event.getSource() == clearAllButton) 
	              {
	                  tArea.setText("");
	                  cHours.setText("");
	                  grade.setSelectedIndex(0);
	                  tCrHours = 0.00;
	                  tCrPoints = 0.00;
	              }
	         }
	      }
	  }
