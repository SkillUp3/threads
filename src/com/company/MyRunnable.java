package com.company;

import static com.company.ThreadColor.ANSI_RED;

/**
 * Created by idejesus on 25/04/2017.
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRUnnable implementation of run()");
    }
}
