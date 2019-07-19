package com.devpaths.homeworks.w05.cardsgames.scores;

public interface Score {

  void clear();

  void update(int player, int score);

  String getScores();

}
