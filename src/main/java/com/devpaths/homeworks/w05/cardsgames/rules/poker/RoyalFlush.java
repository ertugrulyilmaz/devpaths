package com.devpaths.homeworks.w05.cardsgames.rules.poker;

import com.devpaths.homeworks.w05.cardsgames.base.Card;
import com.devpaths.homeworks.w05.cardsgames.rules.HandValue;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;


public class RoyalFlush implements HandValue {

  @Override
  public int valueOf(List<Card> cards) {
    return 0;
  }

  @Override
  public boolean check(List<Card> cards) {
    Card prevCard = cards.get(0);

    if (prevCard.getRank().getCode() != 'T') return false;

    for (int i = 1; i < cards.size(); i++) {
      final Card card = cards.get(i);

      if (card.getSuit() != prevCard.getSuit()) return false;
      if (card.getRank().getValue() - prevCard.getRank().getValue() != 1) return false;

      prevCard = card;
    }

    return true;
  }

  @Override
  public int compare(final List<Card> cards1, final List<Card> cards2) {
    checkArgument(check(cards1) && check(cards2));

    return 0;
  }

}
