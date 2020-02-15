package lv.beatrise.test;

import lv.beatrise.employee.CommissionEmployees;
import lv.beatrise.employee.SalaryEmployee;
import lv.beatrise.paysystem.PaymentSystem;

public class TestPayment {

	public static void main(String[] args){
	
	PaymentSystem paymentSystem = new PaymentSystem();
	
	CommissionEmployees toms = new CommissionEmployees("Toms Ozolins", 2345678, 5000.00);
	paymentSystem.addPayee(toms);
	
	CommissionEmployees ieva = new CommissionEmployees("Ieva Liepa", 23476543, 6000.90);
	paymentSystem.addPayee(ieva);
	

	
	SalaryEmployee valters = new SalaryEmployee("Valters Birze", 987654, 3000.70);
	paymentSystem.addPayee(valters);
	
	SalaryEmployee zane = new SalaryEmployee("Zane Virze", 678202, 3050.90);
	paymentSystem.addPayee(zane);
	
	
	valters.giveBonus(10.0);
	ieva.giveBonus(7.0);
	
	toms.giveCommission(20.0);
	toms.giveCommission(71.4);	
	ieva.giveCommission(12.1);
	ieva.giveCommission(94.8);
	toms.giveCommission(30.3);
	ieva.giveCommission(22.2);
	
	paymentSystem.processPayments();
	
	}
}
