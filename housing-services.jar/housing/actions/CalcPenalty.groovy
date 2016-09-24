package housing.actions;

import com.rameses.rules.common.*;
import com.rameses.util.*;
import java.util.*;
import housing.facts.*;
import com.rameses.osiris3.common.*;

class CalcPenalty implements RuleActionHandler {

	public void execute(def params, def drools) {

		def bi = params.billitem;
		def cyr = params.currentyear;
		def cym = params.currentmonth;

		def yr = bi.year;
		def mon = bi.month;

		println "entering " + yr + " " + mon 

		bi.surcharge = bi.amount * 0.25;
		bi.interest = (((cyr*12)+cym)-((yr*12)+mon)) * 0.02 * bi.amount;

		//def acct = params.account;


		/*
		def amt = NumberUtil.round(params.amount.doubleValue).doubleValue();	
		if(amt <= 0 ) return;

		if(acct ==null) 
			throw new Exception("Please specify an account in treasury.actions.ComputeInterest " + drools.rule.name);

		bi.discountAccount = new Account([objid:acct.key, title:acct.value]);
		bi.discount = amt;
		*/

	}
}