package DesignPattern.FactoryPattern;

public class OperationTwo extends Operation {
	public enum OperationTwoEnum {
		instance;
		private OperationTwo operationTwo;

		private OperationTwoEnum() {
			operationTwo = new OperationTwo();
		}

		private OperationTwo getInstance() {
			return operationTwo;
		}
	}
	
	private OperationTwo(){};

	public static OperationTwo getInstance() {
		return OperationTwoEnum.instance.getInstance();
	}

	@Override
	public Object getValue(int num1, int num2) {
		return num1 - num2;
	}
}
