package com.springernest.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CronJob {

    // 14:55 4tego dnia kazdego miesiaca
    @Scheduled(cron = "0 55 14 4 * ?")
    public void task() {
        System.out.println("cron job: " + LocalDateTime.now());
    }

}
