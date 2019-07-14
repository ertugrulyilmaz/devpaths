package com.devpaths.homeworks.w05.cardsgames.base;

import com.devpaths.homeworks.w05.cardsgames.enums.Rank;
import com.devpaths.homeworks.w05.cardsgames.enums.Suit;
import lombok.Data;

@Data
public class Card {

  private final Suit suit;
  private final Rank rank;

  public Card(final Suit suit, final Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }
}
