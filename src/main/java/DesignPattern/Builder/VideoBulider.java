package DesignPattern.Builder;

public class VideoBulider extends ResourcesBulider{
	private Product priduct = new Product();
	@Override
	void buildName() {
		priduct.add("名称","街拍");
	}

	@Override
	void buildSize() {
		priduct.add("大小","10MB");
	}

	@Override
	void buildType() {
		priduct.add("类型",".wmv");
	}

	@Override
	void buildPlayTime() {
		priduct.add("时长","60s");
	}

	@Override
	void buildResolution() {
		priduct.add("分辨率","1000*800");
	}

	@Override
	Product getProduct() {
		return priduct;
	}
}
