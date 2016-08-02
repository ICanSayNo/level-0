// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	public class AirlineRegistration {
		public static void main(String[] args) {
String FName=JOptionPane.showInputDialog("Whas yo ferst naem. TEL MEE");
String LName=JOptionPane.showInputDialog("Whas yo last naem. TEL MEE");
String Destination=JOptionPane.showInputDialog("Wher ya goin.", FName);
String Birthday=JOptionPane.showInputDialog("Whas yo Berfday");
String Gender=JOptionPane.showInputDialog("R U a mael or a femael");		
JOptionPane.showMessageDialog(null, "Ur naem is "+FName+" "+LName+" (Yer Berfday is "+Birthday+" ), Ur a "+Gender+"\n"+"Travlin Tu: "+Destination);	
	
	}
	}



