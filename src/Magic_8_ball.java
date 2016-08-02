import java.util.Random;

import javax.swing.JOptionPane;
public class Magic_8_ball {
 public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	 int Answer =new Random().nextInt(5);
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
String Fail =JOptionPane.showInputDialog("GIVE ME A QUESTION");
	// 5. If the random number is 0

	// -- tell the user "Yes"
if(Answer==0){
JOptionPane.showMessageDialog(null, "YESH");
}
	// 6. If the random number is 1

	// -- tell the user "No"
if(Answer==1){
JOptionPane.showMessageDialog(null, "NU");
}
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
if(Answer==2){
JOptionPane.showMessageDialog(null, "Consult the google");
}
	// 8. If the random number is 3

	// -- write your own answer
if(Answer==3){
JOptionPane.showMessageDialog(null, "Am");
JOptionPane.showMessageDialog(null, "I");
JOptionPane.showMessageDialog(null, "Annoying");
JOptionPane.showMessageDialog(null, "You");
JOptionPane.showMessageDialog(null, "Because");
JOptionPane.showMessageDialog(null, "If");
JOptionPane.showMessageDialog(null, "I");
JOptionPane.showMessageDialog(null, "Am");
JOptionPane.showMessageDialog(null, "Then");
JOptionPane.showMessageDialog(null, "I");
JOptionPane.showMessageDialog(null, "Am");
JOptionPane.showMessageDialog(null, "Doing");
JOptionPane.showMessageDialog(null, "My");
JOptionPane.showMessageDialog(null, "Jorb");
JOptionPane.showMessageDialog(null, "I");
JOptionPane.showMessageDialog(null, "Don't");
JOptionPane.showMessageDialog(null, "Answer");
JOptionPane.showMessageDialog(null, "That");
JOptionPane.showMessageDialog(null, "Question");
}
 }
}