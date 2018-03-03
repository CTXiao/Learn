package DesignPattern.Builder;

public abstract class ResourcesBulider {
	abstract void buildName();
	abstract void buildSize();
	abstract void buildType();
	abstract void buildPlayTime();
	abstract void buildResolution();
	abstract Product getProduct();
}
