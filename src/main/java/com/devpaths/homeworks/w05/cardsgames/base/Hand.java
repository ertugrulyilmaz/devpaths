package com.devpaths.homeworks.w05.cardsgames.base;

import com.devpaths.homeworks.w05.cardsgames.rules.GameRule;

import java.util.ArrayList;
import java.util.List;

public class Hand {

  final List<Card> cards;

  public Hand() {
    this.cards = new ArrayList<>();
  }

  public void clear() {
    cards.clear();
  }

  public void add(final Card card) {
    cards.add(card);
  }

  public int getHandValue(final GameRule gameRule) {
    return gameRule.calculate(cards);
  }

  public boolean give(final Card card, final Hand otherHand) {
    if (!cards.contains(card)) {
      return false;
    }

    cards.remove(card);
    otherHand.add(card);

    return true;
  }

  public void showHand() {

  }

  public int compareTo(final GameRule gameRule, final Hand o) {
    int value1 = this.getHandValue(gameRule);
    int value2 = o.getHandValue(gameRule);

    if ( value1 < value2) {
      return 1;
    } else if (value1 > value2) {
      return -1;
    } else {
      return gameRule.compare(this.cards, o.cards);
    }
  }

}
