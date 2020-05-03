import java.util.Scanner;

interface MobileApp {

    abstract public void start(String device);

    abstract public void play();

    abstract public void exit();
}

class AndroidApp implements MobileApp {
    public String version = "1.1v";

    @Override
    public void start(final String device) {
        System.out.print("Starting" + device + "Application...\n");
    }

    @Override
    public void play() {
        System.out.print("Play Android Application...\n");
    }

    @Override
    public void exit() {
        System.out.print("Exit Android Application: \n");
    }
}

class IOSApp implements MobileApp {
    public String version = "1.1v";

    @Override
    public void start(final String device) {
        System.out.print("Starting " + device + " Application...\n");
    }

    @Override
    public void play() {
        System.out.print("Play IOS Application...\n");
    }

    @Override
    public void exit() {
        System.out.print("Exit IOS Application: \n");
    }

}

class AndroidVersion extends AndroidApp {

    protected AndroidVersion() {
        super();
    }

    public void version() {
        System.out.println("Android version " + version);
    }

    public String sound(String device) {
        return "Playing " + device + " sounds";
    }
}

class IOSVersion extends IOSApp {

    protected IOSVersion() {
        super();
    }

    public void version() {
        System.out.print("IOS version \n" + version);
    }

    public String sound(String device) {
        return "Playing " + device + " sounds";
    }
}

class Bridge_Problem {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your device? Android / IOS: \n");
        String device = input.nextLine();
        switch (device.toLowerCase()) {
            case "android": {
                AndroidVersion androidVersion = new AndroidVersion();
                androidVersion.start(device);
                androidVersion.version();
                androidVersion.play();
                androidVersion.sound(device);
                androidVersion.exit();
                break;
            }
            case "ios": {
                IOSVersion iosVersion = new IOSVersion();
                iosVersion.start(device);
                iosVersion.version();
                iosVersion.play();
                iosVersion.sound(device);
                iosVersion.exit();
                break;
            }
            default: {
                System.out.println("Wrong Device.");
                break;
            }
        }

    }
}