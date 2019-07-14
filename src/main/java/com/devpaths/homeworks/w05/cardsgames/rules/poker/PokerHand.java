package com.devpaths.homeworks.w05.cardsgames.rules.poker;

import com.devpaths.homeworks.w05.cardsgames.base.Card;
import com.devpaths.homeworks.w05.cardsgames.rules.HandValue;

import java.util.List;


public enum PokerHand {

  ROYAL_FLUSH("Royal Flush", new RoyalFlush()),
  STRAIGHT_FLUSH("Straight Flush", new StraightFlush()),
  FOUR_OF_A_KIND("Four of a Kind", new FourOfAKind()),
  FULL_HOUSE("Full House", new FullHouse()),
  FLUSH("Flush", new Flush()),
  STRAIGHT("Straight", new Straight()),
  THREE_OF_A_KIND("Three of a Kind", new ThreeOfAKind()),
  TWO_PAIR("Two Pair", new TwoPair()),
  ONE_PAIR("One Pair", new OnePair()),
  HIGH_CARD("High Card", new HighCard());

  private final String label;
  private final HandValue handValue;

  PokerHand(final String label, final HandValue handValue) {
    this.label = label;
    this.handValue = handValue;
  }

  public HandValue getHandValue() {
    return handValue;
  }

  public boolean check(final List<Card> cards) {
    return handValue.check(cards);
  }

  @Override
  public String toString() {
    return label;
  }

}
