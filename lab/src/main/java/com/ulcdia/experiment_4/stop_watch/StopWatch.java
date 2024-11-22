package com.ulcdia.experiment_4.stop_watch;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private Instant startTime;
    private Instant endTime;

    public StopWatch() {
        this.startTime = Instant.now();
        this.endTime = Instant.now();
    }

    public void start() {
        this.startTime = Instant.now();
    }

    public void stop() {
        this.endTime = Instant.now();
    }

    public long getElapsedTime() {
        return Duration.between(startTime, endTime).toMillis();
    }
}
