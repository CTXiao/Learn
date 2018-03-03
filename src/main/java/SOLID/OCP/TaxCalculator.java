package SOLID.OCP;

import java.text.DecimalFormat;

public class TaxCalculator {	
	public String calculate(DecimalFormat income,CountryCalculator obj) {
		String ret = obj.Calculate(income);
		return ret;
	}
}
