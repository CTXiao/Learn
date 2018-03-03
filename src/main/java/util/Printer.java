package util;

import java.util.Date;

public class Printer {
	private static Counter counter = null;

	// 打印到控制台
	public static void Print(Object obj) {
		System.out.println(obj);
	}

	// 打印到控制台
	public static void Print() {
		System.out.println();
	}

	// 打印到控制台
	public static void TimeCounter_Start() {
		if (null == counter) {
			counter = new Counter();
		}
		counter.Start();
	}

	// 打印到控制台
	public static void TimeCounter_Stop() {
		if (null == counter) {
			System.out.println("计时器未开始计时！");
		} else {
			counter.Stop();
		}
		System.out.println(Printer.class.getName()+"-耗时："+counter.getInterval());
	}
}

class Counter {
	private long Interval = 0;
	private Date startDate = null;
	private Date stopDate = null;

	public void Start() {
		Clear();
		startDate = new Date();
	}

	public void Stop() {
		stopDate = new Date();
		Interval = stopDate.getTime() - startDate.getTime();
		Clear();
	}

	public long getInterval() {
		return this.Interval;
	}

	private void Clear() {
		startDate = null;
		stopDate = null;
	}
}
