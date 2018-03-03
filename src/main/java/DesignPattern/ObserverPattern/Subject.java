package DesignPattern.ObserverPattern;

public abstract class Subject {
	abstract void addObserver(Observer obj);

	abstract void removeObserver(Observer obj);

	abstract void notifyObserver();
}
