package com.devpaths.homeworks.w05.cardsgames.rules.poker;

import com.devpaths.homeworks.w05.cardsgames.base.Card;
import com.devpaths.homeworks.w05.cardsgames.rules.HandValue;

import java.util.List;

public class OnePair implements HandValue {
  @Override
  public int valueOf(List<Card> cards) {
    return 0;
  }

  @Override
  public boolean check(List<Card> cards) {
    return false;
  }
}
