package tip;

/**
 * 
 * @author Scott Vlasic
 * Simple project to calculate the tip to leave at a restaurant 
 *
 */
public class Calculator {

	/**
	 * The bill amount before the tip is applied
	 */
	private double billWithoutTip;
	
	/**
	 * The tip percentage you wish to leave 
	 */
	private double tipAmount;
	
	/**
	 * Number of people who are splitting the bill
	 */
	private int numGuests;
	
	/**
	 * The bill after the tip has been added to the bill
	 */
	private double billAfterTip;
	
	
	public Calculator(double bill, double tip, int numPeople) {
		
		billWithoutTip = bill;
		tipAmount = tip;
		numGuests = numPeople;
		
	}
	
	public double getBillAmount() {
		
		return billWithoutTip;
	}
	
	public double getTipPercentage() {
		
		return tipAmount;
	}
	
	public int getNumGuests() { 
		
		return numGuests;
	}
	
	public double perPersonTip() {
		
		double calculate = ((billWithoutTip * (tipAmount/100)) / numGuests);
		
		return (Math.round(calculate * 100.0) / 100.0);
	}
	
	public double calculateTotalBill() {
		
		double tipCalculate = billWithoutTip * (tipAmount/100);
		
		billAfterTip = billWithoutTip + tipCalculate;
				
		return (Math.round(billAfterTip * 100.0) / 100.0);
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator(23.51, 15.00, 1);
		
		System.out.println("Your total bill is " + c.getBillAmount() + " and you want to tip " + c.getTipPercentage() + " percent.");
		
		double d = c.calculateTotalBill();
		
		System.out.println("Given that you have " + c.getNumGuests() + " guest(s), your total bill comes to " + d + " at " + c.perPersonTip() + " per person");
		
		System.out.println("Finshed");
		
	}
	
}
