package changeCalculator;

import javax.swing.JOptionPane;

public class ChangeCalculator

{
	public static void main(String[] args) {
		String price = JOptionPane.showInputDialog(null, "Tell me the price");
		String payment = JOptionPane.showInputDialog(null,
				"Tell me the payment");

		float priceReal = Float.parseFloat(price);
		float paymentReal = Float.parseFloat(payment);
		float calculation = paymentReal - priceReal;
		if (paymentReal < priceReal) {
			System.out.println("You dont have enough money.");
		}
		if (paymentReal > priceReal) {

			JOptionPane.showMessageDialog(null, "Your change left over: $"
					+ calculation);

		}

	}

}
