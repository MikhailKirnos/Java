package J3_L4;

public class ABC {
        static final Object mon = new Object();
        static volatile int newNumber = 1;
        static final int num = 5;

        public static void main(String[] args) {
            new Thread(() -> {
                try {
                    for (int i = 0; i < num; i++) {
                        synchronized (mon) {
                            while (newNumber != 1) {
                                mon.wait();
                            }
                            System.out.print("A ");
                            newNumber = 2;
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    for (int i = 0; i < num; i++) {
                        synchronized (mon) {
                            while (newNumber != 2) {
                                mon.wait();
                            }
                            System.out.print("B ");
                            newNumber = 3;
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    for (int i = 0; i < num; i++) {
                        synchronized (mon) {
                            while (newNumber != 3) {
                                mon.wait();
                            }
                            System.out.print("C ");
                            newNumber = 1;
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

