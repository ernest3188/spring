package com.springernest.jobs.exc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Transfer {
    private String senderAccountNumber;
    private String receiverAccountNumber;
    BigDecimal amount;


}
