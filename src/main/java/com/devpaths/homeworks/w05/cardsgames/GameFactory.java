package com.devpaths.homeworks.w05.cardsgames;

import com.devpaths.homeworks.w05.cardsgames.enums.GameType;
import com.devpaths.homeworks.w05.cardsgames.games.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameFactory {

  public static Game build(final String gameType, final int playerCount) {
    try {
      switch (GameType.valueOf(gameType.toUpperCase())) {
        case POKER:
          return new PokerGame(playerCount);
        case BLACKJACK:
          return new BlackjackGame(playerCount);
        case HEARTS:
          return new HeartsGame(playerCount);
        case SPADES:
          return new SpadesGame(playerCount);
      }
    } catch (Exception e) {
      log.error("{}", e);
    }

    return null;
  }

}
