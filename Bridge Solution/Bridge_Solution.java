import java.util.Scanner;

interface Mobile_OS {

	abstract public void load();

	abstract public void execute();

	abstract public void setVersion(String version_no);
}

class Android implements Mobile_OS {

	@Override
	public void load() {
		System.out.print("Loading Android OS...\n");
	}

	@Override
	public void execute() {
		System.out.print("Executing Android OS...\n");
	}

	@Override
	public void setVersion(final String version_no) {
		System.out.print("Android Version: " + version_no + "\n\n");
	}
}

class IOS implements Mobile_OS {

	@Override
	public void load() {
		System.out.print("Loading IOS...\n");
	}

	@Override
	public void execute() {
		System.out.print("Executing IOS...\n");
	}

	@Override
	public void setVersion(final String version_no) {
		System.out.print("IOS Version: " + version_no);
	}

}

abstract class Base_Version {
	protected Mobile_OS mobile_OS;

	protected Base_Version(final Mobile_OS mobile_OS) {
		this.mobile_OS = mobile_OS;
	}

	abstract public void load();

	abstract public void execute();

	abstract public void getVersion();
}

class Version extends Base_Version {
	private final String version_no;

	public Version(final String version_no, final Mobile_OS mobile_OS) {
		super(mobile_OS);
		this.version_no = version_no;
	}

	public void load() {
		mobile_OS.load();
	}

	public void execute() {
		mobile_OS.execute();
	}

	public void sounds() {
		System.out.print("Playing Sounds...");
	}

	public void getVersion() {
		mobile_OS.setVersion(version_no);
	}
}

class BridgePattern {
	public static void main(final String[] args) {
		final Base_Version android = new Version("1.1v", new Android());
		final Base_Version ios = new Version("1.1v", new IOS());
		System.out.println("Enter the device? Android / IOS");
		final String device = new Scanner(System.in).nextLine();
		switch (device.toLowerCase()) {
			case "android": {
				android.load();
				android.execute();
				android.getVersion();
				break;
			}
			case "ios": {

				ios.load();
				ios.execute();
				ios.getVersion();
				break;
			}
			default: {
				System.out.println("Wrong Device.");
				break;
			}
		}

	}
}