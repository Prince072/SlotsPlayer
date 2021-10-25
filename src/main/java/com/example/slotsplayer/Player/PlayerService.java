package com.example.slotsplayer.Player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayer() {
        return playerRepository.findAll();

    }


    public void addMoney(Player player) {
        System.out.println(player);
    }
}
