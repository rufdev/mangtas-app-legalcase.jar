package housing.actions;

import com.rameses.rules.common.*;
import com.rameses.util.*;
import java.util.*;
import housing.facts.*;
import com.rameses.osiris3.common.*;

class CalcInterest implements RuleActionHandler {

	public void execute(def params, def drools) {
		def bi = params.billitem;
		def amt = params.amount;
		def acct = params.account;

		bi.interest = amt.doubleValue;
		bi.interestAccount = new Account( objid: acct.key , title: acct.value );
	}
}