package com.devpaths.homeworks.w05.cardsgames.scores;

public class PokerScore implements Score {

  private final int playerCount;
  private int[] scores;

  public PokerScore(int playerCount) {
    this.playerCount = playerCount;
    this.scores = new int[playerCount];
  }

  @Override
  public void clear() {
    for (int i = 0; i < playerCount; i++) {
      scores[i] = 0;
    }
  }

  @Override
  public void update(int player, int score) {
    scores[player] += score;
  }

  @Override
  public String getScores() {
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= playerCount; i++) {
      sb.append("Player " + i + " has " + scores[i]);
    }

    return sb.toString();
  }

}
