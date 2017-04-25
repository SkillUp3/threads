package com.company;

import static com.company.ThreadColor.ANSI_BLUE;

/**
 * Created by idejesus on 25/04/2017.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from another thread");
    }
}
