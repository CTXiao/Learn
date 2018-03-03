package DesignPattern.FactoryPattern;

public class Factory {
	public static Operation createOpreation(OpreationType type){
		switch(type)
		{
		case 加:
			//单例，内部静态类实现
			return OperationOne.getInstance();
		case 减:
			//单例，枚举类实现
			return OperationTwo.getInstance();
		case 乘:
			return new OperationThree();
		case 除:
			return new OperationFour();
		}
		return null;
	}
	public enum OpreationType{加,减,乘,除}
}
