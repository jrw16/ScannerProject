import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

 

public class Scan extends JFrame {

       private JPanel contentPane;
       private JTextField textField;
       private JTextField RecSizeTextField;
       private JTextField RecNumTextField;

       // Start the application.
       public static void main(String[] args)
       {
              EventQueue.invokeLater(new Runnable()
              {
                     public void run()
                     {
                           try
                           {
                                  Scan frame = new Scan();
                                  frame.setVisible(true);
                           } catch (Exception e)
                             {
                                  e.printStackTrace();
                             }
                     }
              });
       }      

       // Constructors
       public Scan()
       {
              setResizable(false);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setBounds(100, 100, 750, 508);
              contentPane = new JPanel();
              contentPane.setForeground(SystemColor.activeCaption);
              contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
              setContentPane(contentPane);
              contentPane.setLayout(null);
           
              textField = new JTextField();
              textField.setBounds(10, 11, 210, 20);
              contentPane.add(textField);
              textField.setColumns(10);

              //JEditorPane dtrpnHello1 = new JEditorPane();
              //dtrpnHello1.setFont(new Font("FangSong", Font.PLAIN, 13));
              JEditorPane dtrpnHello2 = new JEditorPane();
              dtrpnHello2.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello3 = new JEditorPane();

              dtrpnHello3.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello4 = new JEditorPane();

              dtrpnHello4.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello5 = new JEditorPane();

              dtrpnHello5.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello6 = new JEditorPane();

              dtrpnHello6.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello7 = new JEditorPane();

              dtrpnHello7.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello8 = new JEditorPane();

              dtrpnHello8.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello9 = new JEditorPane();

              dtrpnHello9.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello10 = new JEditorPane();

              dtrpnHello10.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello11 = new JEditorPane();

              dtrpnHello11.setFont(new Font("FangSong", Font.PLAIN, 13));

              JEditorPane dtrpnHello12 = new JEditorPane();

              dtrpnHello12.setFont(new Font("FangSong", Font.PLAIN, 13));

             

              String line1 = "", line2= "", line3= "", line4= "", line5= "", line6="", line7="", line8="", line9="", line10="", line11="", line12="";

                     

/*    

        try (BufferedReader in = Files.newBufferedReader(path, charset))

        {

             

                inLine = in.readLine();

              for (int i = 0; i < 100; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line1 = line1 + aChar;

                    }

              for (int i = 100; i < 200; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line2 = line2 + aChar;

                    }

              for (int i = 200; i < 300; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line3 = line3 + aChar;

                    }

              for (int i = 300; i < 400; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line4 = line4 + aChar;

                    }

              for (int i = 400; i < 500; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line5 = line5 + aChar;

                    }

              for (int i = 500; i < 600; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line6 = line6 + aChar;

                    }

              for (int i = 600; i < 700; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line7 = line7 + aChar;

                    }

              for (int i = 700; i < 800; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line8 = line8 + aChar;

                    }

             

              for (int i = 800; i < 900; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line9 = line9 + aChar;

                    }

              for (int i = 900; i < 1000; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line10 = line10 + aChar;

                    }

              for (int i = 1000; i < 1100; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line11 = line11 + aChar;

                    }

              for (int i = 1100; i < 1200; ++i)

                    {

               char aChar = inLine.charAt(i);

                 line12 = line12 + aChar;

                    }

                   

              

        } catch (IOException ex)

          {

              ex.printStackTrace();

          }

              */

       

           //dtrpnHello1.setBounds(15, 55, 706, 20);

           dtrpnHello2.setBounds(15, 85, 706, 20);

           dtrpnHello3.setBounds(15, 115, 706, 20);

           dtrpnHello4.setBounds(15, 145, 706, 20);

           dtrpnHello5.setBounds(15, 175, 706, 20);

           dtrpnHello6.setBounds(15, 205, 706, 20);

           dtrpnHello7.setBounds(15, 235, 706, 20);

           dtrpnHello8.setBounds(15, 265, 706, 20);

           //dtrpnHello9.setBounds(15, 295, 706, 20);

           //dtrpnHello10.setBounds(15, 325, 706, 20);

           //dtrpnHello11.setBounds(15, 355, 706, 20);

           //dtrpnHello12.setBounds(15, 385, 706, 20);

             

          

           //dtrpnHello1.setText(line1);

           dtrpnHello2.setText(line2);

           dtrpnHello3.setText(line3);

           dtrpnHello4.setText(line4);

           dtrpnHello5.setText(line5);

           dtrpnHello6.setText(line6);

           dtrpnHello7.setText(line7);

           dtrpnHello8.setText(line8);

           //dtrpnHello9.setText(line9);

           //dtrpnHello10.setText(line10);

           //dtrpnHello11.setText(line11);

           //dtrpnHello12.setText(line12);

          

           

           //contentPane.add(dtrpnHello1);

           contentPane.add(dtrpnHello2);

           contentPane.add(dtrpnHello3);

           contentPane.add(dtrpnHello4);

           contentPane.add(dtrpnHello5);

           contentPane.add(dtrpnHello6);

           contentPane.add(dtrpnHello7);

           contentPane.add(dtrpnHello8);

           //contentPane.add(dtrpnHello9);

           //contentPane.add(dtrpnHello10);

           //contentPane.add(dtrpnHello11);

           //contentPane.add(dtrpnHello12);

           //final FilesSent test1 = new FilesSent("Joshua");

          

             

              JButton btnNewButton = new JButton("Get Record");

              btnNewButton.addActionListener(new ActionListener()

              {

                    

                     public void actionPerformed(ActionEvent arg0)

                     {

                          

                 

                     }

              });

              btnNewButton.setBounds(230, 10, 123, 23);

              contentPane.add(btnNewButton);

             

              RecSizeTextField = new JTextField();

              RecSizeTextField.setBounds(635, 24, 78, 20);

              contentPane.add(RecSizeTextField);

              RecSizeTextField.setColumns(10);

             

              JLabel lblNewLabel = new JLabel("Record Size");

              lblNewLabel.setBounds(635, 11, 86, 17);

              contentPane.add(lblNewLabel);

             

              JEditorPane editorPane = new JEditorPane();

              editorPane.setText("");

              editorPane.setFont(new Font("FangSong", Font.PLAIN, 13));

              editorPane.setBounds(15, 206, 706, 20);

              contentPane.add(editorPane);

             

              JEditorPane editorPane_1 = new JEditorPane();

              editorPane_1.setText("");

              editorPane_1.setFont(new Font("FangSong", Font.PLAIN, 13));

              editorPane_1.setBounds(15, 237, 706, 20);

              contentPane.add(editorPane_1);

             

              JEditorPane editorPane_2 = new JEditorPane();

              editorPane_2.setText("");

              editorPane_2.setFont(new Font("FangSong", Font.PLAIN, 13));

              editorPane_2.setBounds(15, 268, 706, 20);

              contentPane.add(editorPane_2);

             

              JEditorPane editorPane_3 = new JEditorPane();

              editorPane_3.setText("");

              editorPane_3.setFont(new Font("FangSong", Font.PLAIN, 13));

              editorPane_3.setBounds(15, 299, 706, 20);

              contentPane.add(editorPane_3);

             

              JEditorPane editorPane_4 = new JEditorPane();

              editorPane_4.setText("");

              editorPane_4.setFont(new Font("FangSong", Font.PLAIN, 13));

              editorPane_4.setBounds(15, 330, 706, 20);

              contentPane.add(editorPane_4);

             

              JEditorPane editorPane_5 = new JEditorPane();

              editorPane_5.setText("");

              editorPane_5.setFont(new Font("FangSong", Font.PLAIN, 13));

              editorPane_5.setBounds(15, 361, 706, 20);

              contentPane.add(editorPane_5);

             

              JEditorPane editorPane_6 = new JEditorPane();

              editorPane_6.setText("");

              editorPane_6.setFont(new Font("FangSong", Font.PLAIN, 13));

              editorPane_6.setBounds(15, 392, 706, 20);

              contentPane.add(editorPane_6);

             

              // ***************************************************************************************************************************************************

             

              String fileName = "C:/users/joshua/data/employee.txt"; // remove line when done testing

              String inLine = "";

              Path path = Paths.get(fileName);

             Charset charset = Charset.forName("UTF-8");

              int count = 1;

              try (BufferedReader in2 = Files.newBufferedReader(path, charset))

                  {

                           while ((inLine = in2.readLine()) != null)

                           {

                                  count++;

                           }

                  }catch (IOException ex1)

                     {

                    

                }

             

              final String[] arrayFile = new String[count];

             

              try (BufferedReader in2 = Files.newBufferedReader(path, charset))

           {

                     while ((inLine = in2.readLine()) != null)

                     {

                           for (int i = 1; i < arrayFile.length; ++i)

                           {

                                  arrayFile[i] = inLine;

                                  System.out.println("arrayFile[" + i + "] = " + arrayFile[i]);

                                  inLine = in2.readLine();

                           }

                           System.out.println("Done loop");

                     }

        }catch (IOException ex1)

              {

             

         }

             

              // ***************************************************************************************************************************************************

             

              final JEditorPane dtrpnHello1 = new JEditorPane();

              dtrpnHello1.setFont(new Font("FangSong", Font.PLAIN, 13));

           dtrpnHello1.setBounds(15, 55, 706, 20);

          

              RecNumTextField = new JTextField();

              RecNumTextField.addFocusListener(new FocusAdapter()

              {

                     @Override

                     public void focusLost(FocusEvent arg0)

                     {

                          

                           String recordNumber = RecNumTextField.getText();

                           dtrpnHello1.setText(arrayFile[Integer.parseInt(recordNumber)]);

                          

                     }

              });

             

              contentPane.add(dtrpnHello1);                         

             

             

              RecNumTextField.setBounds(462, 24, 86, 20);

              contentPane.add(RecNumTextField);

              RecNumTextField.setColumns(10);

             

              JLabel lblNewLabel_1 = new JLabel("Record Number");

              lblNewLabel_1.setBounds(462, 11, 86, 14);

              contentPane.add(lblNewLabel_1);

             

             

       }

}

 

 

/*

String fileName = "C:/work/99999/99999P1.DP2"; // remove line when done testing

                           String inLine;

                           int count = 1;

                           Path path = Paths.get(fileName);

                           Charset charset = Charset.forName("UTF-8");

                     

                           // Check the time

                           long startTime, elapsedTime;  // for speed benchmarking

                      startTime = System.nanoTime();

 

                           try (BufferedReader in2 = Files.newBufferedReader(path, charset))

                               {

                                         while ((inLine = in2.readLine()) != null)

                                         {

                                                count++;

                                         }

                               }catch (IOException ex1)

                                  {

                                  

                              }

                          

                           final String[] arrayFile = new String[count];

                          

                           try (BufferedReader in2 = Files.newBufferedReader(path, charset))

                         {

                                  while ((inLine = in2.readLine()) != null)

                                  {

                                          for (int i = 1; i < arrayFile.length; ++i)

                                         {

                                                arrayFile[i] = inLine;

                                                inLine = in2.readLine();

                                         }

                                         System.out.println("Done loop");

                                  }

                      }catch (IOException ex1)

                           {

                           

                       }

                          

                           // End checking time

                      elapsedTime = System.nanoTime() - startTime;

                      //System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                      JOptionPane.showMessageDialog(null, "Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                          

                          

                          

                           ///*

                      try (BufferedReader in = Files.newBufferedReader(path, charset))

                      {

                         while ((inLine = in.readLine()) != null)

                         {

                              inLine = in.readLine();

                      

                              //for (int i = 0; i < inLine.length(); ++i)

                            for (int i = 0; i <= 50; ++i)

                                 {

                             char aChar = inLine.charAt(i);

                               line1 = line1 + aChar;

                              

                            //System.out.print(aChar);

                              

                                 }

                            System.out.println();

                         }

                      } catch (IOException ex)

                        {

                            ex.printStackTrace();

                        }

                      //*/

                          

                           /*

                           String fileRecSizeField = RecSizeTextField.getText();

                          

                           String RecNumField = RecNumTextField.getText();

                           int RecNums = Integer.parseInt(RecNumField);

                          

                           //String passingNames = test1.getName();

                           //System.out.println("The name is: " + passingNames);

                          

                           String line1 = "";

                                         

                      System.out.println(" ");

                           for(int i = 0; i < 100; i++)

                           {

                                  char aChar = arrayFile[RecNums].charAt(i);

                                  line1 = line1 + aChar;

                                  System.out.print(aChar);

                           }

                     

                           dtrpnHello1.setText(line1);

 

*/

 