package com.springernest.jobs.exc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TransferJob {
    @Scheduled(fixedDelay = 30_000)
    public void doTransfer()  {
        log.info("Transfer started");
        log.info("Transfer ended");

    }


}
