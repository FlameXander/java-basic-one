package ru.otus.java.basic.lesson19.multithreading1;

public class MainApp {
    public static void main(String[] args) throws Exception {
        long t = System.currentTimeMillis();
        int n = 0;
        for (int i = 0; i < 1000000; i++) {
            n = (int)(10 * 1 * 2 * 3 / 4 * Math.sin(i * 1000));
        }
        System.out.println(System.currentTimeMillis() - t);

//        Counter counter1 = new Counter();
//        Counter counter2 = new Counter();
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1_000_000; i++) {
//                    counter1.inc();
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1_000_000; i++) {
//                    counter1.inc();
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

//        MyRunnable myRunnable = new MyRunnable();
//        Thread t = new Thread(myRunnable);
//        t.start();

        // public class MainApp$1 implements Runnable {
        //            @Override
        //            public void run() {
        //
        //            }
        // }
        // Thread t = new Thread (new MainApp$1());
//        Thread t = new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//
//            }
//        });
//
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(1);
//                }
//            }).start();
//        }

//        MyRunnable r = new MyRunnable();
//        r.run();
    }
}
