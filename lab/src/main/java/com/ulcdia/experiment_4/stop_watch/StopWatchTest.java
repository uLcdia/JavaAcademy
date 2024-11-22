package com.ulcdia.experiment_4.stop_watch;

import java.time.Instant;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Start Instant: " + Instant.now());
        stopWatch.start();

        final int SLEEP_DURATION = 3000;
        try {
            Thread.sleep(SLEEP_DURATION);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stop Instant: " + Instant.now());
        stopWatch.stop();

        System.out.println("Elapsed Duration: " + stopWatch.getElapsedTime());
    }
}
