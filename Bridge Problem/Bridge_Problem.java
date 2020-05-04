interface Mobile_App {

    abstract public void start();

    abstract public void play();

    abstract public void exit();
}

class Mobile_App_Android implements Mobile_App {
    public String version = "1.1v";

    @Override
    public void start() {
        System.out.print("Starting Android Application...\n");
    }

    @Override
    public void play() {
        System.out.print("Play Android Application...\n");
    }

    @Override
    public void exit() {
        System.out.print("Exit Android Application...\n\n");
    }
}

class Mobile_App_IOS implements Mobile_App {
    public String version = "1.1v";

    @Override
    public void start() {
        System.out.print("Starting IOS Application...\n");
    }

    @Override
    public void play() {
        System.out.print("Play IOS Application...\n");
    }

    @Override
    public void exit() {
        System.out.print("Exit IOS Application...");
    }

}

class Mobile_App_Android_v1 extends Mobile_App_Android {

    protected Mobile_App_Android_v1() {
        super();
    }

    public void version() {
        System.out.println("Android version " + version);
    }

    public void sound() {
        System.out.print("Playing Android sounds\n");
    }
}

class Mobile_App_IOS_v1 extends Mobile_App_IOS {

    protected Mobile_App_IOS_v1() {
        super();
    }

    public void version() {
        System.out.print("IOS version " + version + " \n");
    }

    public void sound() {
        System.out.print("Playing IOS sounds\n");
    }
}

class Bridge_Problem {
    public static void main(final String[] args) {
        Mobile_App_Android_v1 androidVersion = new Mobile_App_Android_v1();
        androidVersion.start();
        androidVersion.version();
        androidVersion.play();
        androidVersion.sound();
        androidVersion.exit();
        Mobile_App_IOS_v1 iosVersion = new Mobile_App_IOS_v1();
        iosVersion.start();
        iosVersion.version();
        iosVersion.play();
        iosVersion.sound();
        iosVersion.exit();
    }

}
