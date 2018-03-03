package SOLID.LSP;

public class GuestSetting implements IReadableSetting {

	@Override
	public void GetSetting() {
		System.out.println("Get GuestSettings");
	}

}
