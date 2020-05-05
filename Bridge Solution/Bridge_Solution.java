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
	public void setVersion(String version_no) {
		System.out.print("Setting Android Version "+ version_no + " \n");
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
	public void setVersion(String version_no) {
		System.out.print("Setting IOS Version " + version_no + " \n");
	}

}

abstract class Base_Version {
	protected Mobile_OS mobile_OS;

	protected Base_Version(Mobile_OS mobile_OS) {
		this.mobile_OS = mobile_OS;
	}

	abstract public void login();

	abstract public void play();


	abstract public void getVersion();

	abstract public void exit();
}

class Version extends Base_Version {
	private String version_no;

	public Version(String version_no, Mobile_OS mobile_OS) {
		super(mobile_OS);
		this.version_no = version_no;
	}

	public void login() {
		System.out.print("Login...\n");
		mobile_OS.load();
		mobile_OS.execute();
	}

	public void getVersion() {
		mobile_OS.setVersion(version_no);
	}

	public void play() {
		System.out.print("Playing...\n");
	}

	public void sounds() {
		System.out.print("Playing Sounds...\n");
	}

	public void exit() {
		System.out.print("Exiting...");
	}

}

 class BridgePattern {
	public static void main(String[] args) {
		Version android = new Version("1.1V", new Android());
		Version ios = new Version("1.1v", new IOS());
		System.out.println("Enter the device? Android / IOS");
		String device = new Scanner(System.in).nextLine();
		switch (device.toLowerCase()) {
			case "android": {
				android.login();
				android.getVersion();
				android.play();
				android.sounds();
				android.exit();
				break;
			}
			case "ios": {

				ios.login();
				ios.getVersion();
				ios.play();
				ios.sounds();
				ios.exit();
				break;
			}
			default: {
				System.out.println("Wrong Device.");
				break;
			}
		}

	}
}