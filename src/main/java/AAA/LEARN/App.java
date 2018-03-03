package AAA.LEARN;

import java.io.IOException;
import java.text.DecimalFormat;

import org.springframework.aop.framework.ProxyFactory;

import AOP.AOP.AfterAdvice;
import AOP.AOP.BeforeAdvice;
import AOP.AOP.Singer;
import AOP.AOP.SurroundAdvice;
import Collection.HashMap.HashMapTest;
import DesignPattern.Builder.BuilderDirector;
import DesignPattern.Builder.PictureBulider;
import DesignPattern.Builder.Product;
import DesignPattern.Builder.VideoBulider;
import DesignPattern.FactoryPattern.SimpleFactoryTheard;
import DesignPattern.ObserverPattern.MessionSubject;
import DesignPattern.ObserverPattern.WorkerObserver;
import DesignPattern.PrototypePattern.Client;
import SOLID.LSP.GolbalSetting;
import SOLID.LSP.GuestSetting;
import SOLID.OCP.CountryCalculatorForUK;
import SOLID.OCP.TaxCalculator;
import reactor.nio;
import util.Printer;

public class App {
	public static void main(String[] args) {
		AOP();
		LSP();
		OCP();
		NIO();
		SimpleFactory();
		Builder();
		Observer();
		Printer.Print();
		Clone();
		Hash_Map();
		Concurrent();
	}

	private static void Concurrent() {
		
	}

	private static void Hash_Map() {
		new HashMapTest();
	}

	private static void Clone() {
		new Client().Start();
	}

	private static void Observer() {
		MessionSubject sub = new MessionSubject();
		WorkerObserver worker1 = new WorkerObserver("worker1", sub);
		WorkerObserver worker2 = new WorkerObserver("worker2", sub);
		WorkerObserver worker3 = new WorkerObserver("worker3", sub);

	}

	private static void Builder() {
		BuilderDirector pDirector = new BuilderDirector(new PictureBulider());
		BuilderDirector vDirector = new BuilderDirector(new VideoBulider());
		Product product = pDirector.build();
		product.show();
		Printer.Print();
		product = vDirector.build();
		product.show();
	}

	private static void SimpleFactory() {
		int size = 1;
		int i = size;

		SimpleFactoryTheard[] threadList = new SimpleFactoryTheard[size];
		while (i > 0) {
			i--;
			threadList[i] = new SimpleFactoryTheard();
			threadList[i].start();
		}
	}

	private static void NIO() {
		nio n = new nio();
		try {
			n.Start_Selector();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void OCP() {
		TaxCalculator tc = new TaxCalculator();
		DecimalFormat df = new DecimalFormat(".0");
		String string = tc.calculate(df, new CountryCalculatorForUK());
		System.out.println(string);
	}

	private static void LSP() {
		/**
		 * LSP() 分离Set和Get的想法来自于Guset没有Set的权限。 若不把Set和Get分离，而写在同一个ISetting接口中，
		 * 那么当guset调用set方法时，会出现异常。
		 */

		GolbalSetting gg = new GolbalSetting();
		gg.SetSetting();
		gg.GetSetting();
		GuestSetting gs = new GuestSetting();
		gs.GetSetting();
	}

	private static void AOP() {
		System.out.println("敬礼！！");
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Singer());
		factory.addAdvice(new BeforeAdvice());
		factory.addAdvice(new AfterAdvice());
		factory.addAdvice(new SurroundAdvice());
		Singer singer = (Singer) factory.getProxy();
		singer.sing("人民公安向前进");
	}
}
