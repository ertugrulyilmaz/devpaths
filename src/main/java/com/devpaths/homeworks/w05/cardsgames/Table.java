package com.devpaths.homeworks.w05.cardsgames;

import com.devpaths.homeworks.w05.cardsgames.games.Game;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Table {

  public static void main(String[] args) {
    // Enter game type (Poker, Blackjack, Spades, Hearts)
    // Enter player number (2-4, 2-4, 4, 4)
    // Shuffle cards
    // Deal cards
    // Start Game

    Scanner scanner = new Scanner(System.in);

    final String gameType = scanner.nextLine();
    final int playerCount = scanner.nextInt();

    log.info("[{}] was selected.", gameType);
    log.info("Player count is [{}].", playerCount);

    final Game game = GameFactory.build(gameType, playerCount);

    game.populate();
    game.shuffle();
    game.deal();
    game.start();

    scanner.close();
  }

}
