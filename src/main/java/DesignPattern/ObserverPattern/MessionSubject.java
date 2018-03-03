package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class MessionSubject extends Subject {
	private List<Observer> observerList = null;
	private String info;

	@Override
	void addObserver(Observer obj) {
		if (null == observerList) {
			observerList = new ArrayList<Observer>();
		}
		observerList.add(obj);
	}

	@Override
	void removeObserver(Observer obj) {
		if (null == observerList) {
			return;
		}
		int index = observerList.indexOf(obj);
		if (index > 0) {
			observerList.remove(index);
		}
	}

	@Override
	void notifyObserver() {
		for(Observer observer :observerList)
		{
			observer.update(info);
		}
	}

}
