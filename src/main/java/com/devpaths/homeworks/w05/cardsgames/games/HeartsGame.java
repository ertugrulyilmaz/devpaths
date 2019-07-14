package com.devpaths.homeworks.w05.cardsgames.games;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeartsGame extends Game {

  private final int playerCount;

  public HeartsGame(int playerCount) {
    this.playerCount = playerCount;
  }

  @Override
  public void populate() {
    log.info("Game populating");
  }

  @Override
  public void shuffle() {
    log.info("Game shuffling");
  }

  @Override
  public void deal() {
    log.info("Game dealing");
  }

  @Override
  public void start() {
    log.info("Game starting");
  }

}
