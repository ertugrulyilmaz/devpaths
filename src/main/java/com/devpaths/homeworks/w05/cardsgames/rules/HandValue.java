package com.devpaths.homeworks.w05.cardsgames.rules;

import com.devpaths.homeworks.w05.cardsgames.base.Card;

import java.util.List;

public interface HandValue {

  int valueOf(final List<Card> cards);

  boolean check(final List<Card> cards);

  int compare(final List<Card> cards1, final List<Card> cards2);

}
