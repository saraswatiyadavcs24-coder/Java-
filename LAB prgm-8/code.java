public class ThreadDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("BMS College of Engineering");
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("CSE");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
