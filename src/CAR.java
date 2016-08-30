import javax.swing.JOptionPane;

public class CAR {
public static void main(String[] args) {
	String Color= JOptionPane.showInputDialog("Wat CuLEr DU U wUNt UR cAr tO BEEEeEeeEEe!!111!111!!!11!1!1111!");
	String Brand= JOptionPane.showInputDialog("Wat BRanD DU U wUNt UR cAr tO BEEEeEeeEEe!1!1111!11!!111!11!!!1");
	String Model= JOptionPane.showInputDialog("Wat MODLE DU U wUNt UR cAr tO BEEEeEeeEEe!!1!1!1111!1111!11!!!1");
	String year= JOptionPane.showInputDialog("Wat YEeeEr DU U wUNt UR cAr tO BEEEeEeeEEe1!!11!!!11!1111!1!!111");
	int Year=Integer.parseInt(year);
	
	JOptionPane.showMessageDialog(null, "WEEELL, SuN U wuTN A "+ Color+" CARR That IS SA "+ Model+ " FrUM "+ Brand+ " MAEd In "+ Year+ "?");
	if(Year>=2010){
	JOptionPane.showMessageDialog(null, "THeT WElLEl CorST $$"+ ((Color.length()+Model.length()+Brand.length())*2000+20000));
	}
	else{
		JOptionPane.showMessageDialog(null, "THeT WElLEl CorST $$"+ ((Color.length()+Model.length()+Brand.length()))*2000);
	}
	
}
}
