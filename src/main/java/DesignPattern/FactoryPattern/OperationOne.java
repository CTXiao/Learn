package DesignPattern.FactoryPattern;

import java.io.ObjectStreamException;

public class OperationOne extends Operation {
	private static class OperationOneHandler {
		private static OperationOne instance = new OperationOne();
	}

	private OperationOne() {
	}

	public static OperationOne getInstance() {
		return OperationOneHandler.instance;
	}

	@Override
	public Object getValue(int num1, int num2) {
		return num1 + num2;
	}

	// 该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve方法！");
		return OperationOneHandler.instance;
	}

}
