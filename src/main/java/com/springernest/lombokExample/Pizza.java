package com.springernest.lombokExample;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
@Builder
//@Value  tworzy kod dla niemutowalnej klasy
public class Pizza {

    private String dough;
    private String sauce;
    private int size;
    private List<String> toppings;


}