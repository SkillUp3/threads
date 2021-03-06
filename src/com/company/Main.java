package com.company;

import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_PURPLE;
import static com.company.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Another Thread");
        anotherThread.start();


        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        Thread AnonymousRunnable = new Thread(new MyRunnable()) {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class implementation of run()");
            }
        };
        AnonymousRunnable.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");

    }
}
