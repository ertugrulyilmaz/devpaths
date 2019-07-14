package com.devpaths.homeworks.w05.cardsgames.base;

import com.devpaths.homeworks.w05.cardsgames.enums.Rank;
import com.devpaths.homeworks.w05.cardsgames.enums.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

  private final List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<>();
  }

  public void populate() {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        cards.add(new Card(suit, rank));
      }
    }
  }

  /**
   * Fisher-Yates shuffle algorithm implemented
   * */
  public void shuffle() {
    Random r = new Random();

    for (int i = cards.size() - 1; i > 0; i--) {
      int pick = r.nextInt(i + 1);
      Card randCard = cards.get(pick);
      Card lastCard = cards.get(i);
      cards.set(pick, lastCard);
      cards.set(i, randCard);
    }
  }

  public void deal(final Hand[] hands, final int perHand) {
    // perHand = 1
    for (int i = 0; i < perHand; i++) {
      for (Hand hand : hands) {
        hand.give(cards.get(i), hand);
      }
    }
  }

}
