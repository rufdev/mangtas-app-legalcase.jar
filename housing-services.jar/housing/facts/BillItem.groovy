package housing.facts;

import java.util.*;

class BillItem {
	
	Date billdate;
	int month;
	int year;

	Account account;
	Account surchargeAccount;
	Account interestAccount;

	double amount = 0;
	double surcharge = 0;
	double interest = 0;
	

}