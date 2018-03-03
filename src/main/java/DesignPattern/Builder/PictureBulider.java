package DesignPattern.Builder;

public class PictureBulider extends ResourcesBulider{
	private Product priduct = new Product();
	@Override
	void buildName() {
		priduct.add("名称","狗");
	}

	@Override
	void buildSize() {
		priduct.add("大小","100KB");
	}

	@Override
	void buildType() {
		priduct.add("类型",".jpg");
	}

	@Override
	void buildPlayTime() {
	}

	@Override
	void buildResolution() {
		priduct.add("分辨率","100*100");
	}

	@Override
	Product getProduct() {
		return priduct;
	}
	
}
