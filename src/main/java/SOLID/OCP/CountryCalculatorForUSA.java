package SOLID.OCP;

import java.text.DecimalFormat;

public class CountryCalculatorForUSA extends CountryCalculator {

	@Override
	String Calculate(DecimalFormat income) {
		StringBuffer sb = new StringBuffer();
		sb.append("USA:"+income.format(1000));
		return sb.toString();
	}

}
