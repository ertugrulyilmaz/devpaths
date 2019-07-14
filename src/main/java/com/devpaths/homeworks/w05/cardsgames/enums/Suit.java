package com.devpaths.homeworks.w05.cardsgames.enums;

public enum Suit {

  CLUBS("Clubs"),
  DIAMONDS("Diamonds"),
  HEARTS("Hearts"),
  SPADES("Spades");

  private final String label;

  Suit(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
