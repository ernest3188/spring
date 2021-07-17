package com.springernest.jobs.exc;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Controller
public class TransferController {
    private final TransferService transferService;

    @PostMapping("transfer")
    @ResponseStatus(HttpStatus.CREATED)
    public void executeTransfer(@RequestBody Transfer transfer){
     this.transferService.add(transfer);

    }
}
