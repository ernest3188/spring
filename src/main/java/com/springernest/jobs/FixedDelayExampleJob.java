package com.springernest.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedDelayExampleJob {

    /**
     * Job jest uruchamiany synchronicznie.
     * 1 sekunda - 1000
     * 24h - 86_400_000
     *
     * Dopiero po zakonczeniu zostanie doliczony fixedDelay i metoda zostanie uruchomiona ponownie.
     */
    @Scheduled(fixedDelay = 86_400_000)
    public void scheduleFixedDelayTask() throws InterruptedException {
        System.out.println("start: Synchronous fixed delay task - " + System.currentTimeMillis() / 1000);
        Thread.sleep(2000);
        System.out.println("finish: Synchronous fixed delay task - " + System.currentTimeMillis() / 1000);
    }

}
