package com.springernest.jobs;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AsyncFixedDelayExampleJob {

    /**
     * Job jest uruchamiany asynchronicznie.
     * 1 sekunda - 1000
     * 24h - 86_400_000
     *
     * Dopiero po zakonczeniu zostanie doliczony fixedDelay i metoda zostanie uruchomiona ponownie.
     */
    @Async
    @Scheduled(fixedDelay = 86_400_000)
    public void scheduleFixedDelayTask() throws InterruptedException {
        System.out.println("start: Asynchronous fixed delay task - " + System.currentTimeMillis() / 1000);
        Thread.sleep(20000);
        System.out.println("finish: Asynchronous fixed delay task - " + System.currentTimeMillis() / 1000);
    }

}
