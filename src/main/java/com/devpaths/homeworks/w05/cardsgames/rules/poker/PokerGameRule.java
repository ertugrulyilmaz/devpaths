package com.devpaths.homeworks.w05.cardsgames.rules.poker;

import com.devpaths.homeworks.w05.cardsgames.base.Card;
import com.devpaths.homeworks.w05.cardsgames.rules.GameRule;
import com.devpaths.homeworks.w05.cardsgames.rules.HandValue;

import java.util.List;

public class PokerGameRule implements GameRule {

  public HandValue getHandValue(final List<Card> cards) {
    if (PokerHand.ROYAL_FLUSH.check(cards)) {
      return PokerHand.ROYAL_FLUSH.getHandValue();
    } else if (PokerHand.STRAIGHT_FLUSH.check(cards)) {
      return PokerHand.STRAIGHT_FLUSH.getHandValue();
    } else if (PokerHand.FOUR_OF_A_KIND.check(cards)) {
      return PokerHand.FOUR_OF_A_KIND.getHandValue();
    } else if (PokerHand.FULL_HOUSE.check(cards)) {
      return PokerHand.FULL_HOUSE.getHandValue();
    } else if (PokerHand.FLUSH.check(cards)) {
      return PokerHand.FLUSH.getHandValue();
    } else if (PokerHand.STRAIGHT.check(cards)) {
      return PokerHand.STRAIGHT.getHandValue();
    } else if (PokerHand.THREE_OF_A_KIND.check(cards)) {
      return PokerHand.THREE_OF_A_KIND.getHandValue();
    } else if (PokerHand.TWO_PAIR.check(cards)) {
      return PokerHand.TWO_PAIR.getHandValue();
    } else if (PokerHand.ONE_PAIR.check(cards)) {
      return PokerHand.ONE_PAIR.getHandValue();
    } else {
      return PokerHand.HIGH_CARD.getHandValue();
    }
  }

  @Override
  public int calculate(final List<Card> cards) {
    return getHandValue(cards).valueOf(cards);
  }

  @Override
  public int compare(final List<Card> cards1, final List<Card> cards2) {
    HandValue value1 = getHandValue(cards1);
    HandValue value2 = getHandValue(cards2);

    if (value1.valueOf(cards1) < value2.valueOf(cards2)) {
      return 1;
    } else if (value1.valueOf(cards1) > value2.valueOf(cards2)) {
      return -1;
    } else {
     return value1.compare(cards1, cards2);
    }
  }

}
