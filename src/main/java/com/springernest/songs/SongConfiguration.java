package com.springernest.songs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SongConfiguration {

    @Bean
    @Scope("singleton")
    public  Song amerika(){
        return new Song("Rammstein","Amerika");
    }


    @Bean
    @Scope("prototype")
    public  Song prosto(){
        return new Song("Kult","Prosto");
    }

    @Bean
        public  Song linoskoczek(){
        return new Song("Skubas","Linoskoczek");
    }
}
