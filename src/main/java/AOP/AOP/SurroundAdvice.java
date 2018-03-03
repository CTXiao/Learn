package AOP.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SurroundAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("粉丝："+" 好期待！！");
		Object ret = arg0.proceed();
		System.out.println("粉丝："+" 偶像！！");
		return ret;
	}

}
