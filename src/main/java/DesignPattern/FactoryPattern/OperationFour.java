package DesignPattern.FactoryPattern;

public class OperationFour extends Operation{
	@Override
	public Object getValue(int num1, int num2) {
		if(0 == num2)
		{
			return "被除数不能为0";
		}
		return num1/num2;
	}

}
