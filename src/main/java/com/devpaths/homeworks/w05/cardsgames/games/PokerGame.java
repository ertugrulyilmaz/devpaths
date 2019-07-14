package com.devpaths.homeworks.w05.cardsgames.games;

import com.devpaths.homeworks.w05.cardsgames.scores.PokerScore;
import com.devpaths.homeworks.w05.cardsgames.scores.Score;
import com.devpaths.homeworks.w05.cardsgames.base.Deck;
import com.devpaths.homeworks.w05.cardsgames.base.Hand;
import com.devpaths.homeworks.w05.cardsgames.rules.poker.PokerGameRule;
import com.devpaths.homeworks.w05.cardsgames.rules.GameRule;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PokerGame extends Game {

  private static final int PER_HAND = 5;
  private final int playerCount;
  private final Deck deck;
  private final Hand[] hands;
  private final GameRule gameRule;
  private Score score;
  private int currentPlayer;

  public PokerGame(int playerCount) {
    this.playerCount = playerCount;
    this.deck = new Deck();
    this.hands = new Hand[playerCount];
    this.gameRule = new PokerGameRule();
    this.score  = new PokerScore(playerCount);
    this.currentPlayer = 1;

    for (int i = 0; i < playerCount; i++) {
      this.hands[i] = new Hand();
    }
  }

  @Override
  public void populate() {
    log.info("Game populating");
    deck.populate();
  }

  @Override
  public void shuffle() {
    log.info("Game shuffling");
    deck.shuffle();
  }

  @Override
  public void deal() {
    log.info("Game dealing");

    deck.deal(hands, PER_HAND);
  }

  @Override
  public void start() {
    log.info("Game starting");
  }

  public Score showScore() {
    return score;
  }

}
