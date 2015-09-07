package changeCalculator;

import javax.swing.JOptionPane;

public class TipCalculator {
	public static void main(String[] args) {
		String bill = JOptionPane
				.showInputDialog("How much did your bill cost?");
		String percentage = JOptionPane
				.showInputDialog("How what percentage of a tip would you like to give");
		float bill1 = Float.parseFloat(bill);
		float percentage1 = Float.parseFloat(percentage);
		float thing = percentage1 / 100 * bill1;
		System.out.println("Your tip will be:" + thing);

	}
}
