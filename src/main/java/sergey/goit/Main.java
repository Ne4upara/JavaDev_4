package sergey.goit;

public class Main {

    public static void main(String[] args) throws Exception {

        MBeanServer mbs = new MBeanServer();
        mbs.mBeanServer();
        Start start = new Start();
        start.start();
    }
}