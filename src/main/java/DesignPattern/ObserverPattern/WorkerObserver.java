package DesignPattern.ObserverPattern;

import util.Printer;

public class WorkerObserver extends Observer{
	//保存一个Subject的引用,以后如果可以想取消订阅,有了这个引用会比较方便
	private MessionSubject ssss;
	private String name;

	public WorkerObserver(String name,MessionSubject subject){
		this.name = name;
		this.ssss = subject;
		subject.addObserver(this);
	}
	@Override
	public void update(String info) {
		Printer.Print("收到任务："+info);
	}

}
