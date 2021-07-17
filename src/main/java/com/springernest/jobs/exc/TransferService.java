package com.springernest.jobs.exc;

import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.Queue;

@Service
public class TransferService {

    private Queue<Transfer> queue = new ArrayDeque<>();

    public void add(Transfer transfer) {
        this.queue.offer(transfer);
    }
}
