package lv.beatrise.paysystem;

public class PaymentSystem {
	
	private list<Payment>payment;
	
	public Payment(){
		payment = new ArrayList<>;
	}
	
	public void addPayee(Payee payee) {
		if(!payees.contains(payee)){
			payees.add(payee)
		}
	}
	public void processPayments() {
		for (Payee payee : payees)
		Double grossPayment = payee.grossPayment();
		
		System.out.println("to"+ payee.name());
		System.out.println("gross"+grossPayment);
		System.out.println("transferred to account"+ payee.bankAccount);
	}
	
	
	
	
}
