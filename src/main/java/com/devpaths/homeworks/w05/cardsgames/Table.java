package com.devpaths.homeworks.w05.cardsgames;

import com.devpaths.homeworks.w05.cardsgames.games.Game;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * Question: *Design a group of card games. Please keep the following questions in mind when creating your solution.
 * Also, please pick 2-3 design choices in your solution and briefly explain your reasoning behind them.
 * <p>
 * - How would you represent the game data?
 * --- I use Score class for collecting game data and publish the results after each turn.
 * --- Score class depends on game rule class which know the score and other information.
 * <p>
 * - How would you design a deck of cards that is flexible enough to be used in different card games?
 * --- I use factory pattern for creating game. It uses another pattern for implementing game rules which is Strategy Pattern.
 * --- I can use Command pattern for sending some commands at the game.
 * <p>
 * - How would you shuffle the cards in a deck?
 * --- There are several shuffle algorithms (Bogus, Fisher-Yates). I would choose easy and fastest one. In this work I chose "Fisher-Yates" algorithm.
 * <p>
 * -  If a card game requires more than one deck, are there any changes needed in your deck design?
 * --- This requirement implements at Game Logic. So This requirement should not need any changes.
 * <p>
 * -  How would you use your card game/deck design to create another type of game which includes dice as well as cards?
 * ---
 */
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
