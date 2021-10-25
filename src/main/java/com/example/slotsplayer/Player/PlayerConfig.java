package com.example.slotsplayer.Player;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository repository){
        return args -> {
           Player Lucas01 = new Player("lucas01", 250);
            Player Ben009 = new Player("Ben", 300);
            Player Mario = new Player("Marks0", 2000);
            Player Mich = new Player("Mich", 10009);
            Player Benny = new Player("Bom1", 16000);
            Player Lucky = new Player("lucko2", 90);
            Player Larry = new Player("lucas01", 60);

            repository.saveAll(List.of(Lucas01,Ben009,Mario,Mich,Benny,Lucky,Larry));
        };
    }
}
