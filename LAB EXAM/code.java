class EvenThread extends Thread {
    public void run() {
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenThread: " + i);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 20; i <= 40; i++) {
            if (i % 2 != 0) {
                System.out.println("OddThread: " + i);
            }
        }
    }
}


class EvenRunnable implements Runnable {
    public void run() {
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenRunnable: " + i);
            }
        }
    }
}

class OddRunnable implements Runnable {
    public void run() {
        for (int i = 20; i <= 40; i++) {
            if (i % 2 != 0) {
                System.out.println("OddRunnable: " + i);
            }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        
        Thread evenRunnableThread = new Thread(new EvenRunnable());
        Thread oddRunnableThread = new Thread(new OddRunnable());

      
        evenThread.start();
        oddThread.start();
        evenRunnableThread.start();
        oddRunnableThread.start();
    }
}
