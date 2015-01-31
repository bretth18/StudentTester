import javax.swing.JOptionPane;

public class StudentTester {
    
    public static void main(String args[]) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        
        int score1, score2, score3;
        int score;
        int average;
         

        
        

        
        String firstName;
        String lastName;
        
        //start first student here 
        firstName = JOptionPane.showInputDialog("Enter the student's first name.");
        student1.setFirstName(firstName);
        
        lastName = JOptionPane.showInputDialog("Enter the student's last name.");
        student1.setLastName(lastName);
        
        JOptionPane.showMessageDialog(null, "Student 1 has name "
                + student1.getFirstName() + ""+ student1.getLastName() + ".");
        

               
        

            
        //start second student here
        firstName = JOptionPane.showInputDialog("Enter the student's first name.");
        student2.setFirstName(firstName);
        
        lastName = JOptionPane.showInputDialog("Enter the student's last name.");
        student2.setLastName(lastName);
        
        
        JOptionPane.showMessageDialog(null, "Student 2 has name "
                + student2.getFirstName() + "" + student2.getLastName() + ".");
        

        
                

 
        //start third student here
        firstName = JOptionPane.showInputDialog("Enter the student's first name.");
        student3.setFirstName(firstName);
        
        lastName = JOptionPane.showInputDialog("Enter the student's last name.");
        student3.setLastName(lastName);
        
        JOptionPane.showMessageDialog(null, "Student3 has name "
                + student3.getFirstName() + "" + student3.getLastName() + ".");
        

        //average score
               score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 1st student's 1st score."));
                score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 2nd student's 1st score."));
                score3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 3rd student's 1st score."));
                
             average = (score1 + score2 + score3)/3;
        JOptionPane.showMessageDialog(null, "Student 1 has average score " + average);
                       
        
        JOptionPane.showMessageDialog(null, "Student 2 has average score " + average);
                
        
        JOptionPane.showMessageDialog(null, "Student 3 has average score " + average);
            average = (score1 + score2 + score3)/3;
        
                

            }
        }
        

