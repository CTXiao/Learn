package DesignPattern.Builder;

public class BuilderDirector {
	private ResourcesBulider builder = null;

	public BuilderDirector(ResourcesBulider builder) {
		this.builder = builder;
	}
	
	public Product build(){
		this.builder.buildName();
		this.builder.buildPlayTime();
		this.builder.buildResolution();
		this.builder.buildSize();
		this.builder.buildType();
		return this.builder.getProduct();
	}
	
}
