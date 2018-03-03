package AOP.AOP;

import java.text.DecimalFormat;

import org.springframework.aop.framework.ProxyFactory;

import Collection.HashMap.HashMapTest;
import SOLID.LSP.GolbalSetting;
import SOLID.LSP.GuestSetting;
import SOLID.OCP.CountryCalculatorForUK;
import SOLID.OCP.TaxCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	...AOP...
//    	AOP();
//    	开放封闭原则
//    	OCP();
//    	里氏替换原则
//    	LSP();
    	new HashMapTest();
    }
	private static void AOP() {
        System.out.println( "敬礼！！" );
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Singer());
		factory.addAdvice(new BeforeAdvice());
		factory.addAdvice(new AfterAdvice());
		factory.addAdvice(new SurroundAdvice());
		Singer singer = (Singer) factory.getProxy();
		singer.sing("人民公安向前进");
	}
	private static void OCP() {
        TaxCalculator tc = new TaxCalculator();
        DecimalFormat df = new DecimalFormat(".0");
        String string = tc.calculate(df,new CountryCalculatorForUK());
        System.out.println(string);
	}
	
	/**
	 * LSP()
	 * 分离Set和Get的想法来自于Guset没有Set的权限。
	 * 若不把Set和Get分离，而写在同一个ISetting接口中，
	 * 那么当guset调用set方法时，会出现异常。
	 */
	private static void LSP() {
		
		GolbalSetting gg = new GolbalSetting();
		gg.SetSetting();
		gg.GetSetting();
		GuestSetting gs = new GuestSetting();
		gs.GetSetting();
	}
}
