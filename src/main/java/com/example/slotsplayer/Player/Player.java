package com.example.slotsplayer.Player;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Player {
    @Id
    @GeneratedValue
    private Long playerId;
    private String  transactionId;
    private Integer balance;

    public Player(String transactionId, Integer balance) {
        this.transactionId = transactionId;
        this.balance = balance;
    }

    public Player() {

    }
}

