package SOLID.LSP;

public class GolbalSetting implements IReadableSetting, IWritableSetting {

	@Override
	public void SetSetting() {
		System.out.println("Set GolbalSettings");
	}

	@Override
	public void GetSetting() {
		System.out.println("Get GolbalSettings");
	}

}
