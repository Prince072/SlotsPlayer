package com.example.slotsplayer.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/slots")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayer(){
        return playerService.getPlayer();

    }
    @PostMapping
    public void addMoney(@RequestBody Player player){
        playerService.addMoney(player);
    }
}
