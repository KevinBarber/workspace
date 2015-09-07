package changeCalculator;

import javax.swing.JOptionPane;

public class ChangeCalculator

{
	public static void main(String[] args) {
		String price = JOptionPane.showInputDialog(null, "Tell me the price");
		String payment = JOptionPane.showInputDialog(null,
				"Tell me the payment");
		int nickels, dimes, pennies, quarters, dollars;

		float priceReal = Float.parseFloat(price);
		float paymentReal = Float.parseFloat(payment);
		int priceRealInCents = (int)(priceReal *100);
		int paymentRealInCents = (int)(paymentReal * 100);
		int calculation = (int) (paymentRealInCents - priceRealInCents);

		dollars = calculation / 100;
		calculation -= dollars * 100;
		quarters = calculation / 25;
		calculation -= quarters * 25;
		dimes = calculation / 10;
		calculation -= dimes * 10;
		nickels = calculation / 5;
		calculation -= nickels * 5;
		pennies = calculation;

		if (paymentReal < priceReal) {
			System.out.println("You dont have enough money.");
		}
		if (paymentReal > priceReal) {

			JOptionPane.showMessageDialog(null, "Your change left over: $" + dollars + " Quarters:" + quarters + "Dimes:" + dimes + "Nickels:" + nickels + "Pennies:" + pennies
					);

		}

	}

}
