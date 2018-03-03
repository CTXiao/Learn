package DesignPattern.FactoryPattern;

import DesignPattern.FactoryPattern.Factory.OpreationType;
import util.Printer;

//简单工厂线程类 
public class SimpleFactoryTheard extends Thread {
	@Override
	public void run() {
		Operation opreation = Factory.createOpreation(OpreationType.减);
		Printer.Print(opreation.getValue(100, 4));
	}
}