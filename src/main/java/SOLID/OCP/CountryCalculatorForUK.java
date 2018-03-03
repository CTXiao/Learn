package SOLID.OCP;

import java.text.DecimalFormat;

public class CountryCalculatorForUK extends CountryCalculator {

	@Override
	String Calculate(DecimalFormat income) {
		StringBuffer sb = new StringBuffer();
		sb.append("UK:"+income.format(1000));
		return sb.toString();
	}

}
