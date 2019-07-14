package com.devpaths.homeworks.w05.cardsgames.enums;

public enum Rank {

  ONE('A', "Ace", 1),
  TWO('2', "Deuce", 2),
  THREE('3', "Three", 3),
  FOUR('4',"Four", 4),
  FIVE('5',"Five", 5),
  SIX('6',"Six", 6),
  SEVEN('7',"Seven", 7),
  EIGHT('8',"Eight", 8),
  NINE('9',"Nine", 9),
  TEN('1',"Ten", 10),
  ELEVEN('J',"Jack", 11),
  TWELVE('Q',"Queen", 12),
  THIRTEEN('K',"King", 13);

  Rank(final char code, final String label, int value) {
    this.code = code;
    this.label = label;
    this.value = value;
  }

  private final char code;
  private final String label;
  private final int value;

  public char getCode() {
    return code;
  }

  public String getLabel() {
    return label;
  }

  public int getValue() {
    return value;
  }
}
