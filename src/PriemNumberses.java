import javax.swing.JOptionPane;

public class PriemNumberses {
	public static void main(String[] args) {
		String numberStrings = JOptionPane.showInputDialog("Which number would you like tested?");
		int Number = Integer.parseInt(numberStrings);
		int prime = 1;
		for (int i = 2; i < (Number); i++) {
			System.out.println(i);
			if (Number % i == 0) {
				prime = 0;
				System.out.println("Nope, it aint prime");
				break;
			}
		}
		if (prime == 1) {
			System.out.println(Number);
			System.out.println("Yay!!! it is a prime number");
		}
	}
}
